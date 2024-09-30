import java.util.HashSet;

public class DuplicateChecker {
    public static boolean containsDuplicate(int[] nums) {
        // 중복을 허용하지 않는 HashSet 생성
        HashSet<Integer> set = new HashSet<>();

        // 배열의 각 원소를 순차적으로 HashSet에 추가하면서 중복 확인
        for (int num : nums) {
            // 이미 HashSet에 있는 경우 중복이므로 true 반환
            if (!set.add(num)) {
                return true;
            }
        }

        // 중복이 없는 경우 false 반환
        return false;
    }

    public static void main(String[] args) {
        // 테스트 예시
        int[] arr1 = {1, 2, 3, 4, 5};     // 중복 없음
        int[] arr2 = {1, 2, 3, 4, 1};     // 중복 있음

        System.out.println(containsDuplicate(arr1));  // false 출력
        System.out.println(containsDuplicate(arr2));  // true 출력
    }
}
