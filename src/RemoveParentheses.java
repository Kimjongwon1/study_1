import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {

    public static String removeBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        // 문자열의 각 문자에 대해 처리
        for (char c : str.toCharArray()) {
            if (c == '(') {
                // 여는 괄호는 스택에 푸시
                stack.push(c);
            } else if (c == ')') {
                // 닫는 괄호는 스택에서 여는 괄호를 제거
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // 괄호 안에 있지 않은 문자만 결과에 추가
                if (stack.isEmpty()) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        // 괄호 문자 제거 후 출력
        String output = removeBrackets(input);
        System.out.println("괄호가 제거된 결과: " + output);
    }
}
