package 열거형;
// Enum 클래스: 열거 타입(Enum Type) 은 한정된 상수 집합을 정의할 수 있는 참조 타입

// 이름
// 개발 타입: 모바일, 프로튼, 백엔드, 데이터베이스
// 경력: 신입과 경력
// 성별: 남성, 여성
// 주소

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnumMain {
    static Scanner sc = new Scanner(System.in);
    static List<Developer> devList = new ArrayList<>();

    public static void main(String[] args) {
        //Developer developer = new Developer("장원영", DevType.FRONTEND, Career.JUNIOR, Gender.MALE, "천안시");

        while (true) {
            System.out.println("========= 개발자 관리 =========");
            System.out.println("1. 개발자 등록");
            System.out.println("2. 전체 목록 보기");
            System.out.println("3. 이름으로 검색");
            System.out.println("0. 종료");
            int menu = sc.nextInt();
            sc.nextLine();  // 숫자 입력 후 남은 엔터(\n) 제거

            switch (menu) {
                case 1: registerDeveloper(); break;
                case 2: printAll(); break;
                case 3: searchDeveloper(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴를 잘못 선택했습니다.");
            }
        }
    }
    static void registerDeveloper() {
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("개발분야 [1]MOBILE [2]FRONTEND [3]BACKEND [4]DBA: ");
        int type = sc.nextInt();
        DevType devType = null;
        switch (type) {
            case 1: devType = DevType.MOBILE; break;
            case 2: devType = DevType.FRONTEND; break;
            case 3: devType = DevType.BACKEND; break;
            case 4: devType = DevType.DBA; break;
            default: System.out.println("개발 분야 선택이 잘못 되었습니다.");
        }
        System.out.print("경력 [1]신입 [2]경력: ");
        Career career = null;
        int careerType = sc.nextInt();
        if (careerType == 1) {
            career = Career.JUNIOR;
        } else if (careerType == 2) {
            career = Career.SENIOR;
        } else {
            System.out.println("경력 선택이 잘 못 되었습니다.");
        }
        Gender gender = null;
        while (gender == null) {
            System.out.print("성별 [1]남성 [2]여성: ");
            int genderType = sc.nextInt();
            if (genderType == 1) {
                gender = Gender.MALE;
            } else if (genderType == 2) {
                gender = Gender.FEMALE;
            } else {
                System.out.println("성별 선택이 잘못 되었습니다.");
            }
        }
        sc.nextLine();  // 남은 엔터 제거 (없으면 주소 입력이 건너뛰어짐)

        System.out.print("주소: ");
        String addr = sc.nextLine();
        devList.add(new Developer(name, devType, career, gender, addr));
    }

    static void printAll() {
        if (devList.isEmpty()) {
            System.out.println("등록된 개발자가 없습니다.\n");
            return;
        }
        for (int i = 0; i < devList.size(); i++) {
            System.out.println("[" + (i + 1) + "번]");
            System.out.println(devList.get(i));  // toString() 자동 호출
        }
    }

    // 3. 이름으로 검색
    static void searchDeveloper() {
        System.out.print("검색할 이름: ");
        String name = sc.nextLine();

        boolean found = false;
        for (Developer dev : devList) {
            if (dev.getName().equals(name)) {
                System.out.println(dev);
                found = true;
            }
        }
        if (!found) {
            System.out.println("'" + name + "' 이름의 개발자가 없습니다.\n");
        }
    }

}
