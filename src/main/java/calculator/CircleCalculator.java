package calculator;

import java.util.ArrayList;

public class CircleCalculator <T extends Number> extends Calculator <T>{

    CircleCalculator(){
        this.resultArray = new ArrayList<>();//이 인스턴스 메모리에 속한 배열 인스턴스를 생성 - 원 넓이 저장
    }

    @Override
    public double calculate(T num1, T num2, char operator) { //예외 선언할 필요 X !!
        double result = (double)num1*(double)num2*PI; //r*r*PI
        this.resultArray.add(result); //원의 넓이 저장
        return result;
    }

}
