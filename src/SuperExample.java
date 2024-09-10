class Parent {
    String name;

    // 부모 클래스의 생성자
    Parent(String name) {
        this.name = name;
        System.out.println("Parent 클래스의 생성자 호출: " + name);
    }
}

class Child extends Parent {
    int age;

    // 자식 클래스의 생성자
    Child(String name, int age) {
        super(name); // 부모 클래스의 생성자 호출
        this.age = age;
        System.out.println("Child 클래스의 생성자 호출: 나이 " + age);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child child = new Child("John", 25);
    }
}
