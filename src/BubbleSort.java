import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped; // 교환 여부를 추적

        // 배열 전체를 반복
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // 교환이 발생했는지 추적

            // 인접한 두 요소를 비교
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 두 요소가 정렬되지 않았으면 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // 교환 발생
                }
            }

            // 만약 교환이 없었다면 배열이 이미 정렬됨
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 35, 12, 22, 11, 90};  // 예시 배열

        System.out.println("정렬 전 배열: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
