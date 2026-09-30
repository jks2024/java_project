package 추상클래스;

public class AbstractMain {
    public static void main(String[] args) {
        Phone phone = new AndroidPhone("갤럭시 S25");
        phone.call();
        phone.store();

        ApplePhone applePhone = new ApplePhone("iPhone 15");
        applePhone.call();
        applePhone.store();

    }
}
