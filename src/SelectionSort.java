import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // 배열을 순차적으로 반복
        for (int i = 0; i < n - 1; i++) {
            // 현재 범위 내에서 가장 작은 값을 찾는다.
            int minIndex = i; // 가장 작은 값의 인덱스
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 더 작은 값이 있으면 인덱스를 갱신
                }
            }

            // 가장 작은 값을 현재 위치(i)와 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};  // 예시 배열

        System.out.println("정렬 전 배열: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
