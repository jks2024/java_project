package 자동차만들기;

public class SportsCar extends Car implements Audio, AutoDrive{
    public SportsCar(String name) {
        super(250, 8, 30, 2, name);
    }
    @Override
    void setMode(boolean isMode) {
        if (isMode) maxSpeed *= 1.2;
    }

    @Override
    public void audioOn() {
        System.out.println(name + " : 오디오 ON");
    }

    @Override
    public void audioOff() {
        System.out.println(name + " : 오디오 OFF");
    }

    @Override
    public void autoDriveOn() {
        System.out.println(name + " : 자율 주행 ON");
    }

    @Override
    public void autoDriveOff() {
        System.out.println(name + " : 자율 주행 OFF");
    }
}

