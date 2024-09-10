class Parent2 {
    Parent2() {
        System.out.println("Parent 기본 생성자 호출");
    }
}

class Child2 extends Parent2 {
    Child2() {
        System.out.println("Child 기본 생성자 호출");
    }
}

public class SuperExample2 {
    public static void main(String[] args) {
        Child2 child = new Child2();
    }
}
