package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{

    CircleCalculator(){
        this.resultArray = new ArrayList<Double>();//이 인스턴스 메모리에 속한 배열 인스턴스를 생성 - 원 넓이 저장
    }

    @Override
    public double calculate(int num1, int num2, char operator) { //예외 선언할 필요 X !!
        double result = num1*num2*PI; //r*r*PI
        this.resultArray.add(result); //원의 넓이 저장
        return result;
    }

}
