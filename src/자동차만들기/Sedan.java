package 자동차만들기;

public class Sedan extends Car implements AirCon, Audio, AutoDrive {
    public Sedan(String name) {
        super(200, 12, 45, 4, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) seatCnt += 1;
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
    public void audioOn() {
        System.out.println(name + ": 오디오 ON");
    }

    @Override
    public void audioOff() {
        System.out.println(name + ": 오디오 OFF");
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