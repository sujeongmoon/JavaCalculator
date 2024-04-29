package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* int[] resultArray = new int[10]; //결과를 담는 배열
        int resultIndex = 0; //resultArray 인덱스 */
        ArrayList<Integer> resultArrList = new ArrayList<Integer>(); // 결과를 담는 배열리스트
        int result = 0; //계산결과


        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println(resultArrList.size()+1 +"번째 입력입니다.");

            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // next()로 String으로 받고, charAt(0)으로 문자열->문자 변환 (한글자니 인덱스 0 고정)
            char operator = sc.next().charAt(0);

            /*입력받은 값으로 계산하기*/
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                // 분모가 0인 경우 return
                if (num2 == 0) {
                    System.out.println("나눗셈에서 분모는 0일 수 없습니다.");
                    return;
                }
                result = num1 / num2;
            }
            //연산자 잘못 입력한 경우 return
            else {
                System.out.println("연산자를 잘못 입력하였습니다.");
                return;
            }

/*            //만약 현재 인덱스가 10 이상이라면 배열을 한칸씩 다 앞으로 밀어서 자리 확보
            if (resultIndex >= resultArray.length){
                for (int i = 0; i < resultArray.length-2; i++){
                    resultArray[i] = resultArray[i+1];
                }
                resultArray[resultArray.length-1] = result;
                System.out.println("한칸씩밀기~");
            }
            else{
                //연산결과 출력 및 배열에 저장
                resultArray[resultIndex] = result;
            }*/

            System.out.println("result = " + result);

            //컬렉션에 값 저장
            resultArrList.add(result); //값 추가
            /*resultIndex++; -> size()로 대체 가능*/

            // 삭제 물어보기
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeResult = sc.next();
            if (removeResult.equals("remove")){
                resultArrList.removeFirst(); //첫 번째 요소 삭제
                System.out.println("가장 먼저 저장된 연산 결과가 삭제됐습니다.");
            }

            // 조회 물어보기
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryResult = sc.next();
            if (inquiryResult.equals("inquiry")){
                for (int rsArrList : resultArrList) {
                    System.out.print(rsArrList + " ");
                }
                System.out.println();
            }

            // 더 계산 물어보기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitResult = sc.next();
            if (exitResult.equals("exit")){
                return;
            }

        }
    }
}