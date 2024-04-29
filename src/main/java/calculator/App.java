package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Calculator instance 생성

        Scanner sc = new Scanner(System.in);

        while (true) {
            /*System.out.println(calculator.getResultArrayList().size() + 1 + "번째 입력입니다.");*/

            System.out.println("사칙연산을 진행하고 싶으면 1, 원의 넓이를 구하고 싶으면 2를 입력하세요.");
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.println("사칙연산을 선택하셨습니다.");

                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                // next()로 String으로 받고, charAt(0)으로 문자열->문자 변환 (한글자니 인덱스 0 고정)
                char operator = sc.next().charAt(0);

                try {
                    System.out.println(calculator.calculate(num1, num2, operator));
                } catch (BadInputException e) {
                    System.out.println(e.getMessage());
                }

                //  가져오기
                System.out.println("저장된 데이터의 개수를 확인하시겠습니까? (size 입력 시 개수확인)");
                String sizeResult = sc.next();
                if (sizeResult.equals("size")) {
                    System.out.println(calculator.getResultArrayList().size());//저장된 데이터 개수 확인
                }

                // 수정하기
                System.out.println("저장된 데이터들을 새로 재설정하시겠습니까? (set 입력 시 재설정)");
                String sizeSet = sc.next();
                if (sizeSet.equals("set")) {
                    calculator.setResultArrayList(new ArrayList<Double>());//재설정
                    System.out.println("저장된 데이터가 재설정되었습니다.");
                }

                // 삭제 물어보기
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeResult = sc.next();
                if (removeResult.equals("remove")) {
                    calculator.rmFirstResultArrayList(); //첫 번째 요소 삭제
                    System.out.println("가장 먼저 저장된 연산 결과가 삭제됐습니다.");
                }

                // 연산 결과 조회 물어보기
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiryResult = sc.next();
                if (inquiryResult.equals("inquiry")) {
                    calculator.inquiryResultArrayList();
                }
            } else if (choice ==2) { // 원의 넓이 구하기
                System.out.println("원의 넓이 구하기를 선택하셨습니다.");
                System.out.println("넓이를 구할 원의 반지름을 입력해주세요.");
                int r = sc.nextInt(); //반지름
                calculator.calculateCircleArea(r);
                System.out.println("저장된 원의 넓이 값들을 조회합니다.");
                calculator.inquiryCircleArea();

            } else {
                System.out.println("값을 잘못 입력하였습니다. 반복문을 종료합니다.");
                break;
            }



            // 더 계산 물어보기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitResult = sc.next();
            if (exitResult.equals("exit")) {
                return;
            }

        }
    }
}