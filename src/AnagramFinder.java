import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class AnagramFinder {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        // 패턴 문자열 p의 각 문자의 빈도를 저장하는 해시맵
        HashMap<Character, Integer> pMap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        // 슬라이딩 윈도우에서 현재 문자의 빈도를 저장하는 해시맵
        HashMap<Character, Integer> sMap = new HashMap<>();

        int windowSize = p.length(); // 패턴의 길이
        int sLength = s.length();

        // 첫 번째 윈도우 초기화
        for (int i = 0; i < windowSize; i++) {
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        // 첫 번째 윈도우가 아나그램인지 확인
        if (sMap.equals(pMap)) {
            result.add(0);
        }

        // 슬라이딩 윈도우를 이동하면서 아나그램 검사
        for (int rt = windowSize; rt < sLength; rt++) {
            // 오른쪽 끝 문자 추가
            char addChar = s.charAt(rt);
            sMap.put(addChar, sMap.getOrDefault(addChar, 0) + 1);

            // 왼쪽 끝 문자 제거
            char removeChar = s.charAt(rt - windowSize);
            if (sMap.get(removeChar) == 1) {
                sMap.remove(removeChar); // 빈도가 1이면 제거
            } else {
                sMap.put(removeChar, sMap.get(removeChar) - 1);
            }

            // 현재 윈도우가 아나그램인지 확인
            if (sMap.equals(pMap)) {
                result.add(rt - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "bacaAacba";
        String p = "abc";

        List<Integer> anagramIndices = findAnagrams(s, p);
        System.out.println("아나그램의 시작 인덱스: " + anagramIndices);
    }
}
