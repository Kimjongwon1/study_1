import java.util.Scanner;

public class PrintNumbers {

    // 1부터 n까지 출력하는 재귀 함수
    public static void printNumbers(int n) {
        if (n == 0) { // 재귀 종료 조건: n이 0일 때 함수 종료
            return;
        }
        printNumbers(n - 1); // 재귀 호출로 n-1까지 출력
        System.out.print(n + " "); // 현재 n 출력
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 입력 받기
        System.out.print("정수 N을 입력하세요 (3 <= N <= 10): ");
        int N = sc.nextInt();

        // 입력값이 조건을 만족하는지 확인
        if (N < 3 || N > 10) {
            System.out.println("N은 3 이상 10 이하의 정수여야 합니다.");
            return;
        }

        // 재귀 함수 호출하여 출력
        printNumbers(N); // 1부터 N까지 출력
    }
}
