import java.util.Scanner;

public class ContinuousSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시작과 끝 숫자를 입력받기
        System.out.print("시작 숫자를 입력하세요: ");
        int start = scanner.nextInt();
        System.out.print("끝 숫자를 입력하세요: ");
        int end = scanner.nextInt();

        int sum = 0;

        // 시작부터 끝까지의 합 계산
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        // 결과 출력
        System.out.println(start + "부터 " + end + "까지의 합은 " + sum + "입니다.");

        scanner.close();
    }
}
