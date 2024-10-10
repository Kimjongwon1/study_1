public class countDVDs {
    public static int countDVDs(int[] songs, int capacity) {
        int count = 1; // 최소 DVD 한 개 필요
        int sum = 0;

        for (int song : songs) {
            if (sum + song > capacity) {
                count++; // 새로운 DVD 필요
                sum = song; // 새로운 DVD에 현재 곡 넣기
            } else {
                sum += song; // 현재 DVD에 곡 추가
            }
        }

        return count;
    }

    public static int solution(int n, int m, int[] songs) {
        int left = 0, right = 0;

        for (int song : songs) {
            left = Math.max(left, song); // 가장 긴 곡의 길이
            right += song; // 모든 곡의 총 길이
        }

        int answer = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (countDVDs(songs, mid) <= m) {
                answer = mid; // 가능한 최소 용량
                right = mid - 1; // 더 작은 값이 가능한지 확인
            } else {
                left = mid + 1; // 더 큰 값이 필요
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 9; // 곡의 개수
        int m = 3; // DVD의 개수
        int[] songs = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(solution(n, m, songs)); // 결과 출력
    }
}