import java.util.ArrayList;
import java.util.List;

public class SubsetDFS {

    // DFS를 이용하여 부분집합 구하기
    public static void findSubsets(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        // 부분집합에 현재까지의 경로를 추가
        result.add(new ArrayList<>(current));

        // 배열을 탐색
        for (int i = index; i < arr.length; i++) {
            // 현재 원소를 포함한 경우
            current.add(arr[i]);
            findSubsets(arr, i + 1, current, result); // 다음 원소 탐색
            current.remove(current.size() - 1); // 탐색이 끝난 후 원소 제거
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};  // 예시 배열
        List<List<Integer>> result = new ArrayList<>();

        // 빈 리스트에서 시작
        findSubsets(arr, 0, new ArrayList<>(), result);

        // 결과 출력
        System.out.println("부분집합:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
