package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator <T extends Number> extends Calculator <T> {

    ArithmeticCalculator() {
        this.resultArray = new ArrayList<>();//이 인스턴스 메모리에 속한 배열 인스턴스를 생성 - 사칙연산 저장
    }

    //오버라이딩
    @Override
    public double calculate(T num1, T num2, char operator) throws BadInputException {
        double result;
        OperatorType operatorType;

        if (operator == '+') {
            operatorType = OperatorType.ADD; // 입력받은 연산자 따라 operatorType 설정해주기
        } else if (operator == '-') {
            operatorType = OperatorType.SUB;
        } else if (operator == '*') {
            operatorType = OperatorType.MUL;
        } else if (operator == '/') {
            if ((double)num2 == 0.0) { // T extends Number로 (double)형변환 가능하게 해줌
                throw new BadInputException("분모 0");
            }
            operatorType = OperatorType.DIV;
        } else if (operator == '%') {
            operatorType = OperatorType.MOD;
        }else {
            throw new BadInputException("연산자 입력오류"); // 연산자가 안 들어온 경우 예외처리
        }

        // 설정된 operatorType에 따라서 연산 -> 3-1 문제의 요구사항이 이게 맞는지 의문..
        result = operatorType.operatorTypeCal(num1, num2, operatorType);

        /* return 연산 결과 */
        this.resultArray.add(result); //값 추가
        return result;
    }

}
