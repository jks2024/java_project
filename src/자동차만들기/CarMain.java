package 자동차만들기;

import java.util.Scanner;

import static 자동차만들기.Common.DISTANCE;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car car = null;
        int location = 0, carType = 0, option = 0, weather = 0, passCnt = 0;

        while (true) {
            System.out.print("\n이동 지역 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            location = sc.nextInt();
            if (location >= 1 && location <= 4) break;
            System.out.println("이동할 지역 선택이 잘못되었습니다.");
        }

        while (true) {
            System.out.print("이동할 승객 수 입력 (1~100): ");
            passCnt = sc.nextInt();
            if (passCnt >= 1 && passCnt <= 100) break;
            System.out.println("승객 수는 1~100명 사이여야 합니다.");
        }

        while (true) {
            System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            carType = sc.nextInt();
            if (carType >= 1 && carType <= 3) break;
            System.out.println("차량 선택이 잘못되었습니다.");
        }

        while (true) {
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            option = sc.nextInt();
            if (option == 1 || option == 2) break;
            System.out.println("모드 선택이 잘못되었습니다.");
        }

        boolean isMode = (option == 1);

        switch (carType) {
            case 1 -> car = new SportsCar("포르쉐 911");
            case 2 -> car = new Sedan("제네시스 G80");
            case 3 -> car = new Bus("관광버스");
        }

        while (true) {
            System.out.print("날씨 선택 [1]맑음 [2]비 [3]눈 : ");
            weather = sc.nextInt();
            if (weather >= 1 && weather <= 3) break;
            System.out.println("날씨 선택이 잘못되었습니다.");
        }

        if (car != null) {
            car.setMode(isMode);
            System.out.println();
            if (car instanceof AirCon a)    a.airConOn();
            if (car instanceof Audio au)    au.audioOn();
            if (car instanceof AutoDrive ad) ad.autoDriveOn();

            int moveCnt = car.getMovingCnt(passCnt);
            System.out.println("=".repeat(7) + car.getName() + "=".repeat(7));
            System.out.println("총 비용 : " + car.getTotalCost(DISTANCE[location], moveCnt) + "원");
            System.out.println("총 주유 횟수 : " + car.getRefuelCnt(DISTANCE[location], moveCnt) + "회");
            System.out.println("총 이동 시간 : " + car.getMovingTime(DISTANCE[location], moveCnt, weather));
        }
    }
}
