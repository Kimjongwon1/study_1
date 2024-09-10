import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // 문자열의 각 문자에 대해 처리
        for (char c : s.toCharArray()) {
            // 여는 괄호는 스택에 넣는다.
            if (c == '(') {
                stack.push(c);
            }
            // 닫는 괄호가 나오면 스택에서 여는 괄호를 꺼낸다.
            else if (c == ')') {
                // 스택이 비어 있으면 매칭되는 여는 괄호가 없으므로 false
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop(); // 매칭되는 여는 괄호를 꺼낸다.
            }
        }

        // 스택이 비어있으면 모든 괄호가 올바르게 매칭된 것
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("괄호 문자열을 입력하세요: ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("올바른 괄호입니다.");
        } else {
            System.out.println("올바르지 않은 괄호입니다.");
        }
    }
}
