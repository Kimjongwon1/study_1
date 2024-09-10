import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 투표 결과를 문자열로 입력받기
        System.out.print("투표 결과를 입력하세요 (띄어쓰기가 있어도 됩니다): ");
        String votes = scanner.nextLine(); // 띄어쓰기 포함된 전체 투표 결과를 입력받음

        // 공백 제거
        votes = votes.replaceAll("\\s", ""); // 공백(띄어쓰기)을 모두 제거

        // 해시맵을 이용하여 각 후보의 득표수를 저장할 공간
        HashMap<Character, Integer> voteCount = new HashMap<>();

        // 투표 결과 문자열의 각 문자에 대해 득표수 카운팅
        for (char vote : votes.toCharArray()) {
            voteCount.put(vote, voteCount.getOrDefault(vote, 0) + 1);
        }

        // 득표수가 가장 많은 후보 찾기
        char president = ' ';
        int maxVotes = 0;

        for (char candidate : voteCount.keySet()) {
            int votesForCandidate = voteCount.get(candidate);
            if (votesForCandidate > maxVotes) {
                maxVotes = votesForCandidate;
                president = candidate;
            }
        }

        // 각 후보의 득표 수 출력
        System.out.println("각 후보의 득표수:");
        for (char candidate : voteCount.keySet()) {
            System.out.println(candidate + " : " + voteCount.get(candidate) + "표");
        }

        // 학급 회장 출력
        System.out.println("학급 회장은 " + president + "입니다.");

        scanner.close();
    }
}
