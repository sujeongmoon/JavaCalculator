package calculator;
import java.util.ArrayList;

public abstract class Calculator <T extends Number> {
    protected static final double PI = 3.14; //원주율 -변하지않는고정된 상수 > protected로 변경, 상속시 사용 가능
    // 연산 결과 및 원의 넓이를 저장하는 컬렉션 타입 필드 -> protected로 변경, 상속시 사용 가능
    protected ArrayList<Double> resultArray;

    // 연산기능을 수행한 후 결과값을 반환하는 추상메서드, 예외처리
    public abstract double calculate(T num1, T num2, char operator) throws BadInputException; //T 타입으로 가져가기

    //결과값 배열리스트 가져오기
    public ArrayList<Double> getResultArray(){
        return this.resultArray;
    }

    //결과값 배열리스트 수정하기
    public void setResultArray(ArrayList<Double> resultArray){
        this.resultArray = resultArray;
    }

    // 가장 먼저 저장된 연산 결과를 삭제
    public void rmFirstResultArray(){
        this.resultArray.removeFirst();
    }

    // 연산 결과 조회 물어보기
    public void inquiryResultArray() {
        for (double rsArrList : this.resultArray) {
            System.out.print(rsArrList + " ");
        }
        System.out.println();
    }
}
