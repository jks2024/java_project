package 제네릭응용;

public abstract class Device {
    protected String name;  // protected 상속관계에서 접급 가능
    abstract void turnOn();
    abstract void turnOff();

    Device(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

class Printer extends Device {
    Printer(String name) {
        super(name);
    }

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
    Monitor(String name) {
        super(name);
    }

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
    KeyBoard(String name) {
        super(name);
    }

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
    private T device;

    public T getDevice() {
        return device;
    }

    public void setDevice(T device) {
        this.device = device;
    }

    public void powerOn() {
        if (device == null) {
            System.out.println("설정된 기기가 없습니다.");
            return;
        }
        device.turnOn();
    }

    public void powerOff() {
        if (device == null) {
            System.out.println("설정된 기기가 없습니다.");
            return;
        }
        device.turnOff();
    }
}

