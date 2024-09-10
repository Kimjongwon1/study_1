class Car {
    String model;

    Car() {
        System.out.println("기본 모델의 자동차 생성");
    }

    Car(String model) {
        this.model = model;
        System.out.println(model + " 모델의 자동차 생성");
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar() {
        super(); // 부모 클래스의 기본 생성자 호출
        System.out.println("전기 자동차 기본 생성");
    }

    ElectricCar(String model, int batteryCapacity) {
        super(model); // 부모 클래스의 매개변수 있는 생성자 호출
        this.batteryCapacity = batteryCapacity;
        System.out.println("배터리 용량: " + batteryCapacity + "kWh");
    }
}

public class SuperExample4 {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar(); // 기본 생성자 호출
        System.out.println("-----");
        ElectricCar ec2 = new ElectricCar("Tesla", 100); // 매개변수 있는 생성자 호출
    }
}
