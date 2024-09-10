import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;

public class KthLargestTreeMap {

    public static int findKthLargestSum(int[] nums, int K) {
        // 합계를 저장할 TreeMap (자동 정렬 및 중복 제거)
        TreeMap<Integer, Integer> sumMap = new TreeMap<>(Collections.reverseOrder()); // 내림차순으로 정렬

        // 3장의 카드를 뽑아 모든 합 구하기
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    // TreeMap에 합을 추가 (동일한 합일 경우, 키 값으로 처리)
                    sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
                }
            }
        }

        // TreeMap에서 K번째로 큰 수 찾기
        int count = 0;
        for (int sum : sumMap.keySet()) { // 내림차순으로 정렬된 TreeMap의 키들을 순회
            count++;
            if (count == K) {
                return sum; // K번째 수 반환
            }
        }

        return -1; // K번째 수가 없을 경우
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자 카드 입력
        System.out.print("숫자 카드를 입력하세요 (띄어쓰기를 하거나 하지 않아도 됩니다): ");
        String input = scanner.nextLine();

        // 입력된 문자열을 공백을 기준으로 나누어 숫자 배열로 변환
        String[] inputNumbers = input.split("\\s+");
        int[] nums = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            nums[i] = Integer.parseInt(inputNumbers[i]);
        }

        // K 입력
        System.out.print("K번째 큰 수를 입력하세요: ");
        int K = scanner.nextInt();

        // 결과 출력
        int result = findKthLargestSum(nums, K);
        if (result != -1) {
            System.out.println(K + "번째로 큰 합계는 " + result + "입니다.");
        } else {
            System.out.println("K번째 큰 수를 찾을 수 없습니다.");
        }
    }
}
