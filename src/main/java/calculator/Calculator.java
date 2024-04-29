package calculator;

import java.util.ArrayList;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드
    ArrayList<Double> resultArrayList = new ArrayList<Double>();


    // 연산기능을 수행한 후 결과값을 반환하는 메서드, 예외처리
    public double calculate(int num1, int num2, char operator) throws BadInputException{
        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0){
                throw new BadInputException("분모 0");
            }
            result = (double)num1 / num2;
        } else{
            throw new BadInputException("연산자 입력오류"); // 연산자가 안 들어온 경우 예외처리
        }

        /* return 연산 결과 */
        this.resultArrayList.add(result); //값 추가
        return result;
    }
}
