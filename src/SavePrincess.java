import java.util.LinkedList;
import java.util.Queue;

public class SavePrincess {

    public static int findLastPerson(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();

        // 1번부터 N번까지 사람을 큐에 추가
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 마지막 한 명이 남을 때까지 반복
        while (queue.size() > 1) {
            // K-1번째까지의 사람을 큐에서 꺼내어 다시 뒤로 보냄
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll());
            }
            // K번째 사람을 제거
            queue.poll();
        }

        // 마지막 남은 사람 반환
        return queue.peek();
    }

    public static void main(String[] args) {
        int N = 8; // 사람의 수
        int K = 3; // 제거할 순서

        int lastPerson = findLastPerson(N, K);
        System.out.println("마지막으로 남은 사람: " + lastPerson);
    }
}
