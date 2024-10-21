import java.util.Scanner;

public class DecimalToBinary2 {
    // 재귀함수를 이용한 이진수 변환 함수
    public static void toBinary(int n) {
        if (n == 0) {
            return;
        }
        // 2로 나눈 몫을 재귀적으로 호출
        toBinary(n / 2);
        // 2로 나눈 나머지를 출력 (재귀 호출 이후 출력하므로 거꾸로 출력됨)
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 10진수 입력받기

        if (n == 0) {
            System.out.println(0);
        } else {
            toBinary(n);  // 이진수 출력 함수 호출
            System.out.println();  // 줄바꿈
        }
    }
}
