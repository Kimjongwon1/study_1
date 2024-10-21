class Node {
    int data;
    Node2 left, right;

    // 생성자
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeTraversal {

    // 전위 순회 (Pre-order): 부모 -> 왼쪽 -> 오른쪽
    public void preOrder(Node2 node2) {
        if (node2 == null) {
            return;
        }
        System.out.print(node2.data + " "); // 부모 노드 방문
        preOrder(node2.left); // 왼쪽 자식 방문
        preOrder(node2.right); // 오른쪽 자식 방문
    }

    // 중위 순회 (In-order): 왼쪽 -> 부모 -> 오른쪽
    public void inOrder(Node2 node2) {
        if (node2 == null) {
            return;
        }
        inOrder(node2.left); // 왼쪽 자식 방문
        System.out.print(node2.data + " "); // 부모 노드 방문
        inOrder(node2.right); // 오른쪽 자식 방문
    }

    // 후위 순회 (Post-order): 왼쪽 -> 오른쪽 -> 부모
    public void postOrder(Node2 node2) {
        if (node2 == null) {
            return;
        }
        postOrder(node2.left); // 왼쪽 자식 방문
        postOrder(node2.right); // 오른쪽 자식 방문
        System.out.print(node2.data + " "); // 부모 노드 방문
    }

    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();

        // 이진 트리 생성
        Node2 root = new Node2(1);
        root.left = new Node2(2);
        root.right = new Node2(3);
        root.left.left = new Node2(4);
        root.left.right = new Node2(5);
        root.right.left = new Node2(6);
        root.right.right = new Node2(7);

        System.out.println("전위 순회 (Pre-order):");
        tree.preOrder(root);  // 전위 순회

        System.out.println("\n중위 순회 (In-order):");
        tree.inOrder(root);  // 중위 순회

        System.out.println("\n후위 순회 (Post-order):");
        tree.postOrder(root);  // 후위 순회
    }
}
