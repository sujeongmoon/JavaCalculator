package calculator;
import java.util.ArrayList;

public class Calculator {
    //원의 넓이 구하기
    private int r; //반지름
    private static final double PI = 3.14; //원주율 -변하지않는고정된 상수
    // 연산 결과를 저장하는 컬렉션 타입 필드
    private ArrayList<Double> resultArrayList;
    // 원의 넓이 결과를 저장하는 컬렉션 타입 필드
    private ArrayList<Double> resultCircleArea;


    //생성자
    Calculator(){
        //초기화
        this.resultArrayList = new ArrayList<Double>();
        this.resultCircleArea = new ArrayList<Double>();
    }



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

    //결과값 배열리스트 가져오기
    public ArrayList<Double> getResultArrayList(){
        return this.resultArrayList;
    }

    //결과값 배열리스트 수정하기
    public void setResultArrayList(ArrayList<Double> resultArrayList){
        this.resultArrayList = resultArrayList;
    }

    // 가장 먼저 저장된 연산 결과를 삭제
    public void rmFirstResultArrayList(){
        this.resultArrayList.removeFirst();
    }

    // 연산 결과 조회 물어보기
    public void inquiryResultArrayList(){
        for (double rsArrList : this.resultArrayList) {
            System.out.print(rsArrList + " ");
        }
        System.out.println();
    }

    //원의 넓이를 구하는 메서드
    public double calculateCircleArea(int r) {
        double result = r*r*PI;
        this.resultCircleArea.add(result); //원의 넓이 저장
        return result;
    }

    // 원의 넓이 결과값 배열리스트 가져오기
    public ArrayList<Double> getResultCircleArea(){
        return this.resultCircleArea;
    }

    //원의 넓이 결과값 배열리스트 수정하기
    public void setResultCircleArea(ArrayList<Double> resultCircleArea){
        this.resultCircleArea = resultCircleArea;
    }

    // 원의 넓이 결과 조회
    public void inquiryCircleArea(){
        for (double rr : this.resultCircleArea) {
            System.out.print(rr + " ");
        }
        System.out.println();
    }
}
