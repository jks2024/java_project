package 회원정보예제;

import java.util.Scanner;

public class Member {
    private String name;  // 인스턴스 필드, 객체 생성 시 함께 생성 됨
    private int age;  // private은 클래스 내부에서만 접근 가능한 접근 제한자
    private char gender;
    private int job;
    private final Scanner sc = new Scanner(System.in);

    // 이름 설정 하기, 세터
    public void setName() {
        System.out.print("이름 입력: ");
        name = sc.nextLine();
    }
    // 이름 가져오기
    public String getName() {
        return name;
    }

    // 나이 설정 하기
    public void setAge() {
        while (true) {
            System.out.print("나이 입력: ");
            String ageStr = sc.nextLine();
            try {
                age = Integer.parseInt(ageStr);
                if (age >= 0 && age < 200) return;
                System.out.println("나이 입력 범위가 아닙니다.");
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력 하세요.");
            }
        }
    }
    // 나이 가져 오기
    public int getAge() {
        return age;
    }

    // 성별 설정 하기
    public void setGender() {
        while (true) {
            System.out.print("성별 입력: ");
            gender = sc.nextLine().toLowerCase().charAt(0);
            if (gender == 'm' || gender == 'f') return;
            System.out.println("성별을 잘 못 입력 하셨습니다.");
        }
    }

    public int getGender() {
        return gender;
    }

    // 직업 설정하기: 1 ~ 4까지를 정상 입력으로 간주
    // 문자가 들어 오면 숫자만 입력 하세요 출력 하기
    public void setJob() {
        while (true) {
            System.out.print("직업 입력: ");
            String jobStr = sc.nextLine();
            try {
                job = Integer.parseInt(jobStr);
                if (job >= 1 && job <= 4) return;
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력 하세요.");
            }
        }
    }

    public int getJob() {
        return job;
    }

    public void print() {
        // final은 최종 값을 의미 함(상수)
        final String[] jobStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("=".repeat(7) + "회원 정보" + "=".repeat(7));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + ((gender == 'm' ? "남성" : "여성")));
        System.out.println("직업 : " + jobStr[job]);
    }

}
