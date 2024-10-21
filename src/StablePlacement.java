import java.util.Arrays;
import java.util.Scanner;

public class StablePlacement {

    // 말을 배치할 수 있는지 확인하는 함수
    public static boolean canPlaceHorses(int[] stables, int distance, int horses) {
        int count = 1; // 첫 번째 말 배치
        int lastPosition = stables[0]; // 첫 번째 마구간에 배치

        for (int i = 1; i < stables.length; i++) {
            if (stables[i] - lastPosition >= distance) {
                count++;
                lastPosition = stables[i];
                if (count >= horses) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        System.out.print("마구간 개수(N)와 말의 수(C)를 입력하세요: ");
        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] stables = new int[n];
        System.out.println("마구간 위치를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            stables[i] = sc.nextInt();
        }

        // 마구간 위치 정렬
        Arrays.sort(stables);

        // 이분 탐색을 통한 거리 찾기
        int low = 1; // 가능한 최소 거리
        int high = stables[n - 1] - stables[0]; // 가능한 최대 거리
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canPlaceHorses(stables, mid, c)) {
                result = mid;
                low = mid + 1; // 더 큰 거리 시도
            } else {
                high = mid - 1; // 더 작은 거리 시도
            }
        }

        System.out.println("말 사이의 최대 거리: " + result);
        sc.close();
    }
}
