import java.util.Scanner;

public class FibonacciMemoization {

    // 메모이제이션을 위한 배열
    static int[] memo;

    // 메모이제이션을 이용한 피보나치 함수
    public static int fibonacci(int n) {
        if (n == 0) {  // 첫 번째 항
            return 0;
        }
        if (n == 1) {  // 두 번째 항
            return 1;
        }
        if (memo[n] != -1) {  // 이미 계산된 값이 있으면 반환
            return memo[n];
        }
        // 계산된 적이 없으면 재귀적으로 계산하고 저장
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번째 피보나치 수를 구할까요? ");
        int n = sc.nextInt();  // 사용자로부터 숫자를 입력받음

        // 메모이제이션 배열을 -1로 초기화 (계산되지 않은 상태)
        memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        int result = fibonacci(n);  // 피보나치 함수 호출
        System.out.println(n + "번째 피보나치 수는 " + result + "입니다.");
    }
}