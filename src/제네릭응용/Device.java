package 제네릭응용;

public abstract class Device {
    abstract void turnOn();
    abstract void turnOff();
}

class Printer extends Device {
    @Override
    void turnOn() {
        System.out.println("프린터의 전원을 켭니다.");
    }

    @Override
    void turnOff() {
        System.out.println("프린터의 전원을 끕니다.");
    }
}

class Monitor extends Device {
    @Override
    void turnOn() {
        System.out.println("Monitor의 전원을 켭니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Monitor의 전원을 끕니다.");
    }
}

class KeyBoard extends Device {
    @Override
    void turnOn() {
        System.out.println("KeyBoard의 전원을 켭니다.");
    }

    @Override
    void turnOff() {
        System.out.println("KeyBoard의 전원을 끕니다.");
    }
}

class DeviceController <T extends Device> {

}

