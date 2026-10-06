package 제네릭응용;

import java.util.Scanner;

public class GenericEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeviceController<Device> controller = new DeviceController<>();

        while (true) {
            System.out.println("\n===== 기기 선택 =====");
            System.out.println("[1]프린터 [2]모니터 [3]키보드 [0]종료");
            System.out.print("선택 >> ");
            int deviceNum = sc.nextInt();

            switch (deviceNum) {
                case 1: controller.setDevice(new Printer("프린터")); break;
                case 2: controller.setDevice(new Monitor("모니터")); break;
                case 3: controller.setDevice(new KeyBoard("키보드")); break;
                case 0:
                    System.out.println("프로그램을 종료 합니다.");
                    sc.close();
                    return;
                default: System.out.println("잘못된 입력 입니다.");
            }

            System.out.println(controller.getDevice().getName() + "전원을 겹니다.");
            controller.powerOn();
        }
    }
}
