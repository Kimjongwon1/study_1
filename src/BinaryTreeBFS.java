import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    int data;
    Node2 left, right;

    // 생성자
    public Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeBFS {

    // 레벨 순서 탐색 (BFS)
    public void levelOrder(Node2 root) {
        if (root == null) {
            return;
        }

        Queue<Node2> queue = new LinkedList<>();
        queue.add(root);  // 루트 노드를 큐에 삽입

        while (!queue.isEmpty()) {
            Node2 current = queue.poll();  // 큐에서 노드를 꺼내 출력
            System.out.print(current.data + " ");

            // 왼쪽 자식 노드가 있으면 큐에 추가
            if (current.left != null) {
                queue.add(current.left);
            }

            // 오른쪽 자식 노드가 있으면 큐에 추가
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeBFS tree = new BinaryTreeBFS();

        // 이진 트리 생성
        Node2 root = new Node2(1);
        root.left = new Node2(2);
        root.right = new Node2(3);
        root.left.left = new Node2(4);
        root.left.right = new Node2(5);
        root.right.left = new Node2(6);
        root.right.right = new Node2(7);

        System.out.println("레벨 순서 탐색 (BFS):");
        tree.levelOrder(root);  // 레벨 순서 탐색 실행
    }
}
