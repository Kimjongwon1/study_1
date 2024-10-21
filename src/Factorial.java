import java.util.Scanner;

public class Factorial {

    // 재귀함수를 이용한 팩토리얼 함수
    public static int factorial(int n) {
        if (n == 1 || n == 0) {  // 종료 조건: 0! = 1, 1! = 1
            return 1;
        }
        // 재귀 호출: n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();  // 사용자로부터 숫자를 입력받음

        if (n < 0) {
            System.out.println("팩토리얼은 음수에 대해 정의되지 않습니다.");
        } else {
            int result = factorial(n);  // 팩토리얼 함수 호출
            System.out.println(n + "! = " + result);  // 결과 출력
        }
    }
}