import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CoordinateSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 좌표 개수 입력
        int N = sc.nextInt();

        // 좌표 배열 선언
        int[][] coordinates = new int[N][2];

        // 좌표 입력 받기
        for (int i = 0; i < N; i++) {
            coordinates[i][0] = sc.nextInt();  // x값
            coordinates[i][1] = sc.nextInt();  // y값
        }

        // 커스텀 정렬: x값 오름차순 -> x값이 같으면 y값 오름차순
        Arrays.sort(coordinates, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);  // y값 오름차순
                } else {
                    return Integer.compare(o1[0], o2[0]);  // x값 오름차순
                }
            }
        });

        // 정렬된 좌표 출력
        for (int i = 0; i < N; i++) {
            System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
        }

        sc.close();
    }
}
