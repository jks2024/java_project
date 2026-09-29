package 영화표예매하기;

import java.util.Scanner;

public class MovieTicket {
    private final int[] seat = new int[10]; // 배열로 좌석 10개 만들기
    private final Scanner sc = new Scanner(System.in);  // 키보드 입력을 받기 위한 스캐너
    int price;

    // 생성자를 통해서 가격을 주입 받음
    public MovieTicket(int price) {
        this.price = price;
    }

    // 좌석 상태 출력: 1이면 예약 좌석 [V], 0이면 예약 되지 않은 좌석 [ ]
    // for문을 순회하면서 값을 확인해서 출력
    public void printSeat() {
        for (int e : seat) {
            System.out.print(e == 0 ? "[ ]" : "[V]");
        }
        System.out.println();
    }


    // 좌석 예매 메서드
    // 먼저 좌석 상태를 보여주기 위해서 좌석 상태 출력 메서드 후출 이 후 예매(0이면 예약 안된 좌석)
    public void selectSeat() {
        printSeat();
        System.out.print("예매할 좌석 번호 (1 ~ 10): ");
        int seatNum = sc.nextInt();

        if (!isSeatValid(seatNum)) {
            System.out.println("좌석 번호는 1 ~ 10 사이로 입력 하세요.");
            return;
        }
        if (seat[seatNum - 1] == 0) {
            seat[seatNum - 1] = 1;
            printSeat();
        } else {
            System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택 하세요");
        }
    }


    // 예약 취소 메서드
    public  void cancelSeat() {
        printSeat();
        System.out.print("취소할 좌석 번호 (1 ~ 10): ");
        int seatNum = sc.nextInt();

        if (seat[seatNum - 1] == 1) {
            seat[seatNum - 1] = 0;
            printSeat();
        } else {
            System.out.println("해당 좌석은 예약 되어 있지 않습니다.");
        }
    }

    // 총 판매 구입 반환 메서드 (int형으로 반환)
    public int getTotalPrice() {
        int totalPrice = 0;
        for (int e : seat) {
            if (e == 1) {
                totalPrice += price;
            }
        }
        return totalPrice;
    }

    // 좌석 유효 범위 체크 메서드 구현
    private boolean isSeatValid(int seatNum) {
        return seatNum >= 1 && seatNum <= 10;
    }
}
