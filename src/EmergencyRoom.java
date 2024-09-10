import java.util.LinkedList;
import java.util.Queue;

class Patient {
    int id;      // 환자의 위치 (인덱스)
    int priority; // 환자의 중요도

    public Patient(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class EmergencyRoom {

    public static int solution(int N, int M, int[] priorities) {
        Queue<Patient> queue = new LinkedList<>();

        // 큐에 환자 정보 추가
        for (int i = 0; i < N; i++) {
            queue.offer(new Patient(i, priorities[i]));
        }

        int order = 0; // 진료 순서

        while (!queue.isEmpty()) {
            Patient current = queue.poll();
            // 현재 환자보다 중요도가 높은 환자가 있는지 확인
            boolean hasHigherPriority = false;
            for (Patient p : queue) {
                if (p.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            // 더 중요한 환자가 있으면 뒤로 보냄
            if (hasHigherPriority) {
                queue.offer(current);
            } else {
                // 현재 환자가 진료를 받음
                order++;
                // 목표 환자인 경우 순서 반환
                if (current.id == M) {
                    return order;
                }
            }
        }

        return -1; // 오류 방지용 (여기에 도달하면 안됨)
    }

    public static void main(String[] args) {
        int N = 5; // 환자의 수
        int M = 2; // 목표 환자의 인덱스
        int[] priorities = {60, 50, 70, 80, 90}; // 각 환자의 중요도

        int result = solution(N, M, priorities);
        System.out.println("해당 환자는 " + result + "번째로 진료를 받습니다.");
    }
}
