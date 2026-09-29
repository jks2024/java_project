package 조건문;

// 조건문: 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
// if ~ else ~ if
// 3항 연산자

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
        // 나이를 입력 받아 19세까지는 미성년자 출력, 19세를 초과하면 성인 출력
        // 3가지의 조건문을 사용해 출력 해보기
        Scanner sc = new Scanner(System.in); // 표준 입력으로 스캐너 객체 생성
        // 나이 입력 받기
        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        // if문으로 참과 거짓 분기
        if (age <= 19) {
            System.out.println(age + "는 미성년자 입니다.");
        } else {
            System.out.println(age + "는 성인 입니다.");
        }

        // 3항연산자를 사용해 출력하기
        System.out.println(age + "는 " + (age <= 19 ? "미성년자" : "성인") + " 입니다.");


        // 숫자를 입력 홀수 / 짝수 구분 해서 출력 하기
        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "은 찍수 입니다.");
        } else {
            System.out.println(num + "은 홀수 입니다.");
        }

        System.out.println(num + "은 " + (num % 2 == 0 ? "짝수" : "홀수") + " 입니다.");



    }
}
