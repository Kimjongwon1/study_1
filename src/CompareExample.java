public class CompareExample {
    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 200;

        // 두 값을 비교
        int result = Integer.compare(num1, num2);

        if (result == 0) {
            System.out.println("두 숫자는 같습니다.");
        } else if (result < 0) {
            System.out.println("첫 번째 숫자가 작습니다.");
        } else {
            System.out.println("첫 번째 숫자가 큽니다.");
        }
    }
}
