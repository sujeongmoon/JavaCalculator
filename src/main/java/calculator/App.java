package calculator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Calculator instance 생성

        Scanner sc = new Scanner(System.in);

        while(true) {
/*            System.out.println(resultArrList.size()+1 +"번째 입력입니다.");*/

            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // next()로 String으로 받고, charAt(0)으로 문자열->문자 변환 (한글자니 인덱스 0 고정)
            char operator = sc.next().charAt(0);

            try{
                System.out.println(calculator.calculate(num1, num2, operator));
            } catch(BadInputException e){
                System.out.println(e.getMessage());
            }

            // 삭제 물어보기
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeResult = sc.next();
            if (removeResult.equals("remove")){
                calculator.resultArrayList.removeFirst(); //첫 번째 요소 삭제
                System.out.println("가장 먼저 저장된 연산 결과가 삭제됐습니다.");
            }

            // 조회 물어보기
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryResult = sc.next();
            if (inquiryResult.equals("inquiry")){
                for (double rsArrList : calculator.resultArrayList) {
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