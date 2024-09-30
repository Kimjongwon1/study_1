import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue 인터페이스를 구현한 LinkedList 사용
        Queue<Integer> queue = new LinkedList<>();

        // 요소 삽입
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // 가장 앞의 요소를 확인 (제거하지 않음)
        System.out.println("peek: " + queue.peek()); // 출력: 1

        // 요소 삭제 및 반환
        System.out.println("poll: " + queue.poll()); // 출력: 1
        System.out.println("poll: " + queue.poll()); // 출력: 2

        // 남은 요소
        System.out.println("peek: " + queue.peek()); // 출력: 3

        // 큐가 비어 있으면 null 반환
        queue.poll(); // 3이 제거됨
        System.out.println("poll: " + queue.poll()); // 출력: null
    }
}
