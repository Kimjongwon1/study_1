import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList 생성
        LinkedList<String> list = new LinkedList<>();

        // 요소 추가
        list.add("A");
        list.add("B");
        list.add("C");

        // 첫 번째와 마지막에 요소 추가
        list.addFirst("First");
        list.addLast("Last");

        // 요소 조회
        System.out.println("첫 번째 요소: " + list.getFirst());  // 출력: First
        System.out.println("마지막 요소: " + list.getLast());    // 출력: Last

        // 요소 삭제
        list.removeFirst();  // 첫 번째 요소 삭제
        list.removeLast();   // 마지막 요소 삭제

        // 중간에 있는 요소 삽입
        list.add(1, "Inserted");

        // 전체 리스트 출력
        System.out.println("리스트 요소: " + list);
    }
}