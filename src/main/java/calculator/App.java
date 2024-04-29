package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        int result = 0;
        if (operator == '+'){
            result = num1 + num2;
        } else if (operator == '-'){
            result = num1 - num2;
        } else if (operator == '*'){
            result = num1 * num2;
        } else if (operator == '/'){
            // 분모가 0인 경우 return
            if (num2 == 0){
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
        System.out.println("result = " + result);
    }
}
