package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    ArithmeticCalculator() {
        this.resultArray = new ArrayList<Double>();//이 인스턴스 메모리에 속한 배열 인스턴스를 생성 - 사칙연산 저장
    }

    //오버라이딩
    @Override
    public double calculate(int num1, int num2, char operator) throws BadInputException {
        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                throw new BadInputException("분모 0");
            }
            result = (double) num1 / num2;
        } else {
            throw new BadInputException("연산자 입력오류"); // 연산자가 안 들어온 경우 예외처리
        }

        /* return 연산 결과 */
        this.resultArray.add(result); //값 추가
        return result;
    }

/*    @Override
    public void inquiryResultArray() {
        for (double rsArrList : this.resultArray) {
            System.out.print(rsArrList + " ");
        }
        System.out.println();
    }*/
}
