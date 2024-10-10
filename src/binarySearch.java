import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

    // 이분 검색 함수
    public static int binarySearch(int[] arr, int M) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;  // 중간 인덱스 계산

            if (arr[mid] == M) {
                return mid + 1;  // 인덱스를 1부터 세므로 mid + 1 반환
            } else if (arr[mid] < M) {
                left = mid + 1;  // M이 중간 값보다 크면 오른쪽 절반 탐색
            } else {
                right = mid - 1;  // M이 중간 값보다 작으면 왼쪽 절반 탐색
            }
        }

        return -1;  // M이 배열에 없는 경우 (문제 조건상 여기에 도달하지 않음)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N개의 숫자 입력
        int N = sc.nextInt();
        int[] arr = new int[N];

        // 배열 요소 입력
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // M 입력
        int M = sc.nextInt();

        // 배열 정렬
        Arrays.sort(arr);

        // 이분 검색을 통해 M의 위치 찾기
        int position = binarySearch(arr, M);

        // 결과 출력 (M의 위치)
        System.out.println(position);

        sc.close();
    }
}
