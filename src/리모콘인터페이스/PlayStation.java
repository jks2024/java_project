package 리모콘인터페이스;

public class PlayStation implements RemoteControl{
    private int volume;
    @Override
    public void turnON() {
        System.out.println("PlayStation 전원을 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("PlayStation 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 PlayStation 볼륨 : " + this.volume);

    }

    @Override
    public int getVolume() {
        return volume;
    }
}
