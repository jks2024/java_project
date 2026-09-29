package 입력과출력;

import java.util.Scanner;

public class InOutMain {  // 자바 클래스 이름은 대문자로 시작 해야 함
    public static void main(String[] args) {
        // System.in: 표준 입력 스트림
        // System.out: 표준 출력 스트림
        // System.err: 표준 오류 스트림, 거의 사용 되지 않음

        // 이름, 주소, 성별, 국어, 영어, 수학 변수를 만들고 값을 대입
        // 총점과 평균 구하기
        // 이름, 주소, 성별, 총점, 평균을 println()과 printf() 출력
//        String name = "Lee";
//        String addr = "Seoul City";
//        char gender = 'F';
//        int kor = 99;
//        int eng = 88;
//        int mat = 40;
//        double aver = 0.0;
//        int total = 0;
//        total = kor + eng + mat;
//        aver = (double) total / 3;
//
//        // println() : 자바의 오버로딩 문법을 사용, 데이터 타입을 자동으로 찾아 줌
//        System.out.println("====== Java Style output =======");
//        System.out.println("Name : " + name);
//        System.out.println("Address : " + addr);
//        System.out.println("Gender : " + gender);
//        System.out.println("Total : " + total);
//        System.out.println("Average : " + aver);
//
//        // printf() : 서식 지정자를 사용해서 출력 하는 방식
//        System.out.println("====== C Style Output ======");
//        System.out.printf("Name : %s\n", name);
//        System.out.printf("Address : %s\n", addr);
//        System.out.printf("Gender : %c\n", gender);
//        System.out.printf("Total : %d\n", total);
//        System.out.printf("Average : %.2f\n", aver);


        // 표준 입력은 스캐너 객체 사용
        Scanner sc = new Scanner(System.in);  // 스캐너 객체 생성
        // 이름, 주소, 성별, 나이, 이메일을 입력 받아 출력하기
        System.out.print("이름 입력: ");  // 줄바꿈이 없음
        String name = sc.nextLine();       // 문자열을 공백 기준으로 입력 받음
        System.out.print("주소 입력: ");
        String addr = sc.nextLine();   // 문자열을 줄바꿈 기준으로 입력 받음
        System.out.print("성별 입력: ");
        char gender = sc.next().charAt(0);  // 문자열에서 해당 인덱스의 문자를 추출
        System.out.print("나이 입력: ");
        int age = sc.nextInt();  // 정수 입력
        System.out.print("이메일 입력: ");
        String email = sc.next();  // 문자열 입력

        // 출력 해보기, 단 성별은 "남성", "여성"으로 출력
        System.out.println("==== 회원 정보 출력 =====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + (gender == 'M' ? "남성" : "여성"));
        System.out.println("나이 : " + age);
        System.out.println("이메일: " + email);


    }
}
