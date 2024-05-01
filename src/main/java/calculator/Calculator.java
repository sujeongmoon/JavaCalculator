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

    // 3-2) App에서 Ari..인스턴스를 Calculator 매개변수로 사용하기 때문에 임의로 조회 메서드를 Calculator에 구현
    // 형변환 해도 되지만 CircleCalculator에서 써도 괜찮을 메서드라서 Calculator에 구현함
    public void compareScanner(double compareNum) {
        ArrayList<Double> compareList = new ArrayList<>(); //기준값보다 더 큰 값을 담을 compareList 생성
        this.resultArray.stream().filter(result -> result > compareNum).forEach(compareList::add); //filter은 bool, true인 경우에 compareList.add()
        System.out.println(compareList.stream().toList()); //람다식으로 출력, map()굳이 할 필요 없는 듯
        //메서드에 매개변수로 전달하는 게 아니기 때문에 함수형 인터페이스 필요 X
    }
}
