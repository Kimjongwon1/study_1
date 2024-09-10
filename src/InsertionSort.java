import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // 두 번째 요소부터 시작하여 차례대로 삽입
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // 현재 삽입할 값을 저장
            int j = i - 1;

            // 정렬된 부분에서 key보다 큰 값들을 오른쪽으로 이동
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // 요소를 오른쪽으로 이동
                j = j - 1;
            }

            // 삽입할 위치에 key를 삽입
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};  // 예시 배열

        System.out.println("정렬 전 배열: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
