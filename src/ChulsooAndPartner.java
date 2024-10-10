import java.util.Arrays;
import java.util.Scanner;

public class ChulsooAndPartner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 수 입력
        int N = sc.nextInt();
        int[] heights = new int[N];  // 실제 서있는 키 정보
        int[] sortedHeights = new int[N];  // 정렬된 키 정보

        // 학생들의 키 입력
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
            sortedHeights[i] = heights[i];
        }

        // 키순으로 정렬
        Arrays.sort(sortedHeights);

        int chulsoo = 0, partner = 0;

        // 철수와 짝꿍이 자리를 바꾼 부분을 찾아서 그들의 키와 번호 확인
        for (int i = 0; i < N; i++) {
            if (heights[i] != sortedHeights[i]) {
                if (chulsoo == 0) {
                    chulsoo = i + 1;  // 철수의 번호
                } else {
                    partner = i + 1;  // 짝꿍의 번호
                    break;
                }
            }
        }

        // 철수의 번호와 짝꿍의 번호를 출력
        System.out.println(chulsoo + " " + partner);

        sc.close();
    }
}
