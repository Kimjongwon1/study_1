import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 문자열 입력 받기
        System.out.print("첫 번째 문자열을 입력하세요: ");
        String str1 = scanner.nextLine();
        System.out.print("두 번째 문자열을 입력하세요: ");
        String str2 = scanner.nextLine();

        // 두 문자열이 아나그램인지 확인
        if (isAnagram(str1, str2)) {
            System.out.println("두 문자열은 아나그램입니다.");
        } else {
            System.out.println("두 문자열은 아나그램이 아닙니다.");
        }

        scanner.close();
    }

    // 아나그램 여부를 확인하는 메서드
    public static boolean isAnagram(String str1, String str2) {
        // 길이가 다르면 아나그램이 될 수 없음
        if (str1.length() != str2.length()) {
            return false;
        }

        // 두 문자열의 각 문자의 빈도를 저장할 해시맵
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // 첫 번째 문자열의 각 문자의 빈도 기록
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // 두 번째 문자열의 각 문자의 빈도 감소
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false; // 두 번째 문자열에 첫 번째 문자열에 없는 문자가 있다면 아나그램이 아님
            }

            // 문자의 빈도를 감소시키고, 0이 되면 제거
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c);
            }
        }

        // 모든 문자의 빈도가 0이 되어야 아나그램
        return charCountMap.isEmpty();
    }
}
