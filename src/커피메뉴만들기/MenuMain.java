package 커피메뉴만들기;

import java.util.List;
import java.util.Scanner;

public class MenuMain {
    private static MenuService menuService = new MenuService();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n[1]조회 [2]등록 [3]수정 [4]삭제 [5]검색 [6]종료");
            System.out.print("메뉴 선택 : ");
            int sel = sc.nextInt();
            sc.nextLine();

            switch (sel) {
                case 1: printMenu(); break;
                case 2: addMenu(); break;
                case 3: updateMenu(); break;
                case 4: deleteMenu(); break;
                case 5: searchMenu(); break;
                case 6: return;
                default:
            }
        }
    }
    // 메뉴 조회
    private static void printMenu() {
        List<MenuInfo> list = menuService.getAllMenu();
        for (MenuInfo menu : list) {
            System.out.println(menu);
        }
    }

    // 공통 입력
    private static MenuInfo inputMenu() {
        System.out.print("이름: "); String name = sc.nextLine();
        System.out.print("가격: "); int price = sc.nextInt(); sc.nextLine();
        System.out.print("카테고리: "); String category = sc.nextLine();
        System.out.print("설명: "); String desc = sc.nextLine();
        System.out.print("[1]세금 포함 [2]별도: ");
        boolean isTax = sc.nextInt() == 1;
        sc.nextLine();
        return new MenuInfo(name, price, category, desc, isTax);
    }

    // 메뉴 등록
    private static void addMenu() {
        menuService.addMenu(inputMenu());
    }

    // 메뉴 수정
    private static void updateMenu() {
        printMenu();
        System.out.print("수정할 번호: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();

        if (menuService.updateMenu(idx, inputMenu())) {
            System.out.println("수정 완료");
        } else {
            System.out.println("수정 실패");
        }
    }


    // 메뉴 삭제
    private static void deleteMenu() {
        printMenu();
        System.out.print("삭제할 번호: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();

        if (menuService.deleteMenu(idx)) {
            System.out.println("삭제 완료");
        } else {
            System.out.println("삭제 실패");
        }
    }

    // 메뉴 검색
    private static void searchMenu() {
        System.out.print("검색어(이름): ");
        String keyword = sc.nextLine();
        MenuInfo menuInfo = menuService.searchMenu(keyword);
        System.out.println(menuInfo);

    }


}
