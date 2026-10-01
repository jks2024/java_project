package 자동차만들기;

public class Bus extends Car implements AirCon, AutoDrive {
    public Bus(String name) {
        super(150, 5, 100, 20, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) fuelTank += 30;
    }

    @Override
    public void airConOn() {
        System.out.println(name + ": 에어컨 ON");
    }

    @Override
    public void airConOff() {
        System.out.println(name + ": 에어컨 OFF");
    }

    @Override
    public void autoDriveOn() {
        System.out.println(name + ": 자율 주행 ON");
    }

    @Override
    public void autoDriveOff() {
        System.out.println(name + ": 자율 주행 OFF");
    }
}