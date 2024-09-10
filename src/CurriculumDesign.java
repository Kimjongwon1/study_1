import java.util.LinkedList;
import java.util.Queue;

public class CurriculumDesign {

    public static String isValidPlan(String required, String plan) {
        Queue<Character> queue = new LinkedList<>();

        // 필수 과목 순서를 큐에 넣음
        for (char c : required.toCharArray()) {
            queue.offer(c);
        }

        // 학습 계획을 하나씩 확인
        for (char c : plan.toCharArray()) {
            // 필수 과목을 만나면, 큐에서 맨 앞의 과목인지 확인
            if (queue.contains(c)) {
                // 필수 과목이 맨 앞에 있으면 큐에서 제거
                if (queue.peek() == c) {
                    queue.poll();
                } else {
                    // 순서가 맞지 않으면 잘못된 교육과정
                    return "NO";
                }
            }
        }

        // 필수 과목이 전부 순서대로 다 이수되었는지 확인
        if (queue.isEmpty()) {
            return "YES"; // 올바른 교육과정
        } else {
            return "NO"; // 필수 과목이 남아있으면 잘못된 교육과정
        }
    }

    public static void main(String[] args) {
        String required = "CBA"; // 필수 과목 순서
        String plan = "CBDAGE";   // 학습 계획

        String result = isValidPlan(required, plan);
        System.out.println("교육 과정이 올바른가? " + result);
    }
}
