import java.util.HashSet;
import java.util.Scanner;

public class StudentNumberChecker {

    // 학생들의 숫자 중복 여부를 체크하는 메서드
    public static void checkForDuplicates(int N, int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        boolean isDuplicate = false;

        // N명의 학생이 적은 숫자를 중복 확인
        for (int num : numbers) {
            // HashSet에 이미 있는 숫자라면 중복이므로 D 출력
            if (!set.add(num)) {
                isDuplicate = true;
                break;
            }
        }

        // 결과 출력
        if (isDuplicate) {
            System.out.println("D");
        } else {
            System.out.println("U");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 수 입력
        int N = sc.nextInt();
        int[] numbers = new int[N];

        // 학생들이 제출한 숫자 입력받기
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        // 중복 체크 메서드 호출
        checkForDuplicates(N, numbers);

        sc.close();
    }
}
