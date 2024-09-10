public class MaxLengthSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 1, 1, 3, 3, 3, 3};

        int maxLength = findMaxLengthSubarray(arr);

        System.out.println("최대 길이의 연속 부분 수열은 " + maxLength + "입니다.");
    }

    public static int findMaxLengthSubarray(int[] arr) {
        if (arr.length == 0) return 0;

        int maxLength = 1; // 최대 길이를 저장할 변수
        int currentLength = 1; // 현재 연속된 숫자의 길이

        // 배열을 처음부터 끝까지 순회
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLength++; // 이전 값과 같으면 길이를 증가
            } else {
                maxLength = Math.max(maxLength, currentLength); // 더 긴 길이를 저장
                currentLength = 1; // 연속이 끊기면 다시 초기화
            }
        }

        // 마지막에 남은 수열도 처리
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }
}
