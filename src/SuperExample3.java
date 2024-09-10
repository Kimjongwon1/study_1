class Person {
    void introduce() {
        System.out.println("저는 사람입니다.");
    }
}

class Student extends Person {
    // 메서드 오버라이딩
    @Override
    void introduce() {
        super.introduce(); // 부모 클래스의 introduce() 메서드를 호출
        System.out.println("저는 학생입니다.");
    }
}

public class SuperExample3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.introduce(); // 부모 클래스와 자식 클래스의 introduce 메서드를 모두 호출
    }
}
