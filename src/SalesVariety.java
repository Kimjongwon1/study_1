import java.util.HashMap;
import java.util.Scanner;

public class SalesVariety {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N과 K 입력 받기
        System.out.print("매출액 배열의 길이를 입력하세요(N): ");
        int N = scanner.nextInt();

        System.out.print("슬라이딩 윈도우의 크기를 입력하세요(K): ");
        int K = scanner.nextInt();

        // 매출액 배열 입력 받기
        int[] sales = new int[N];
        System.out.println("매출액 배열을 입력하세요:");
        for (int i = 0; i < N; i++) {
            sales[i] = scanner.nextInt();
        }

        // 슬라이딩 윈도우를 통해 매출액의 종류를 구함
        int[] result = countSalesVariety(N, K, sales);

        // 결과 출력
        System.out.println("각 구간의 매출액 종류 수:");
        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    public static int[] countSalesVariety(int N, int K, int[] sales) {
        // 결과를 저장할 배열
        int[] result = new int[N - K + 1];

        // 해시맵을 사용하여 매출액 빈도를 기록
        HashMap<Integer, Integer> salesMap = new HashMap<>();

        // 첫 번째 윈도우 처리
        for (int i = 0; i < K; i++) {
            salesMap.put(sales[i], salesMap.getOrDefault(sales[i], 0) + 1);
        }
        result[0] = salesMap.size(); // 첫 번째 구간의 고유한 매출액 종류

        // 슬라이딩 윈도우 처리
        for (int i = K; i < N; i++) {
            // 윈도우에 새로 추가되는 값
            salesMap.put(sales[i], salesMap.getOrDefault(sales[i], 0) + 1);

            // 윈도우에서 제거되는 값
            int left = sales[i - K];
            if (salesMap.get(left) == 1) {
                salesMap.remove(left); // 빈도가 1이면 제거
            } else {
                salesMap.put(left, salesMap.get(left) - 1); // 빈도가 1보다 크면 감소
            }

            // 현재 윈도우의 고유한 매출액 종류 기록
            result[i - K + 1] = salesMap.size();
        }

        return result;
    }
}
