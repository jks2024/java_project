package 영화표예매하기;

//- while(true)로 메뉴 반복
//- switch/if로 분기
//- 각 메뉴에 맞게 MovieTicket의 메서드 호출

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket 클래스에 대한 ticket 참조 변수에 MovieTicket 객체 주소 대입
        MovieTicket ticket = new MovieTicket(10000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 영화표 예매 시스템 ===");
            System.out.println("[1] 예매하기");
            System.out.println("[2] 취소하기");
            System.out.println("[3] 종료하기");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    ticket.selectSeat();
                    break;
                case 2:
                    ticket.cancelSeat();
                    break;
                case 3:
                    System.out.println("총 판매 금액: " + ticket.getTotalPrice());
                    return;
                default:
                    System.out.println("메뉴 선택이 잘못 되었습니다.");
            }
        }
    }
}
