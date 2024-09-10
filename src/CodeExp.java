public class CodeExp {
        public static void main(String[] args) {
            // 예시 매출 배열
            int[] sales = {120, 200, 310, 150, 240, 180, 260, 350};
            int k = 3;  // 연속된 k일

            // 최대 매출 구하는 함수 호출
            int result = getMaxSales(sales, k);

            // 결과 출력
            System.out.println("최대 매출액: " + result);
        }

        // 최대 매출을 구하는 함수
        public static int getMaxSales(int[] sales, int k) {
            int maxSales = 0;
            int currentSales = 0;

            // 처음 k일 동안의 매출 합 계산
            for (int i = 0; i < k; i++) {
                currentSales += sales[i];
            }

            // 첫 번째 k일 합을 maxSales에 초기화
            maxSales = currentSales;

            // 슬라이딩 윈도우로 최대 매출 계산
            for (int i = k; i < sales.length; i++) {
                // 이전 창에서 첫 번째 값을 빼고 새로운 값을 더함
                currentSales = currentSales - sales[i - k] + sales[i];
                // 최대 매출 갱신
                maxSales = Math.max(maxSales, currentSales);
            }

            return maxSales;
        }
    }


