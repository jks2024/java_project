package Math실습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MathPractice {
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        practice4();
        practice5();
    }

    // ============================================================
    // [실습 1] 주사위 시뮬레이션 (random)
    // 주사위 2개를 10,000번 굴려서 두 눈의 합(2~12)이 각각 몇 번 나왔는지 출력하세요.
    // 결과를 보고 어떤 합이 가장 많이 나오는지 확인해 봅시다. (예상: 7)
    // ============================================================
    static void practice1() {
        System.out.println("=== 실습 1: 주사위 합 빈도 ===");
        int[] count = new int[13]; // 인덱스 2~12 사용

        for (int i = 0; i < 10000; i++) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            count[dice1 + dice2]++;
        }

        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%2d : %5d회%n", sum, count[sum]);
        }
    }
    // ============================================================
    // [실습 2] 원하는 자리에서 반올림하기 (round, pow)
    // Math.round()는 항상 정수로 반올림합니다.
    // 실수 value를 소수점 digits 자리까지 반올림하는 메서드 roundTo(value, digits)를 만드세요.
    //   roundTo(3.14159, 2) -> 3.14
    //   roundTo(2.71828, 3) -> 2.718
    // 추가 질문: Math.round(-10.5)의 결과는? (-11이 아니라 -10)
    // ============================================================
    static double roundTo(double value, int places) {
        double scale = Math.pow(10, places);  // 제곱을 구하는 함수
        return Math.round(value * scale) / scale;
    }

    static void practice2() {
        System.out.println("\n=== 실습 2: 자리수 지정 반올림 ===");
        System.out.println(roundTo(3.14159, 2));  // 3.14
        System.out.println(roundTo(2.71828, 3));  // 2.718
        System.out.println(roundTo(123.456, 1));  // 123.5
        System.out.println(Math.round(-10.5));    // -10 (round = floor(x + 0.5))
    }
    // ============================================================
    // [실습 3] 게시판 페이지 수 계산 (ceil)
    // 전체 게시글 수와 한 페이지에 보여줄 글 수가 주어질 때, 총 페이지 수를 구하세요.
    //   게시글 95개, 페이지당 10개 -> 10페이지
    //   게시글 100개, 페이지당 10개 -> 10페이지
    //   게시글 0개 -> 0페이지
    // 함정: Math.ceil(95 / 10) 은 왜 9.0이 나올까요? (정수 나눗셈이 먼저 일어남)
    // ============================================================
    static int getTotalPages(int totalPosts, int pageSize) {
        return (int) Math.ceil((double) totalPosts / pageSize);
    }

    static void practice3() {
        System.out.println("\n=== 실습 3: 총 페이지 수 ===");
        System.out.println("잘못된 계산: " + Math.ceil(95 / 10)); // 9.0
        System.out.println(getTotalPages(95, 10));   // 10
        System.out.println(getTotalPages(100, 10));  // 10
        System.out.println(getTotalPages(101, 10));  // 11
        System.out.println(getTotalPages(0, 10));    // 0
    }
    // ============================================================
    // [실습 4] 두 점 사이의 거리 (abs, sqrt, pow)
    // 좌표 (x1, y1), (x2, y2)가 주어질 때 두 가지 거리를 구하세요.
    //   - 맨해튼 거리 : |x1 - x2| + |y1 - y2|
    //   - 유클리드 거리 : √((x1 - x2)² + (y1 - y2)²)
    //   (1, 2) ~ (4, 6) -> 맨해튼 7, 유클리드 5.0
    // ============================================================
    static void practice4() {
        System.out.println("\n=== 실습 4: 두 점 사이의 거리 ===");
        int x1 = 1, y1 = 2;
        int x2 = 4, y2 = 6;

        int manhattan = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        double euclid = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.println("맨해튼 거리: " + manhattan); // 7
        System.out.println("유클리드 거리: " + euclid);  // 5.0
    }
    // ============================================================
    // [실습 5] 성적 처리 (random, max, min, round 종합)
    // 1. 학생 10명의 점수를 0~100 사이 임의의 값으로 생성해 리스트에 저장하세요.
    // 2. Math.max / Math.min 을 사용해 최고점과 최저점을 구하세요. (Collections 사용 금지)
    // 3. 평균을 소수점 첫째 자리까지 반올림해 출력하세요. (실습 2의 roundTo 활용)
    // 4. 최고점과 최저점을 뺀 나머지 8명의 평균도 구하세요.
    // ============================================================
    static void practice5() {
        System.out.println("\n=== 실습 5: 성적 처리 ===");
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            scores.add((int) (Math.random() * 101)); // 0 ~ 100
        }
        System.out.println("점수: " + scores);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int score : scores) {
            max = Math.max(max, score);
            min = Math.min(min, score);
            sum += score;
        }

        double avg = (double) sum / scores.size();
        double trimmedAvg = (double) (sum - max - min) / (scores.size() - 2);

        System.out.println("최고점: " + max);
        System.out.println("최저점: " + min);
        System.out.println("평균: " + roundTo(avg, 1));
        System.out.println("최고/최저 제외 평균: " + roundTo(trimmedAvg, 1));

        // 확인용: Collections로 구한 값과 같은지 비교
        System.out.println("검증: " + (max == Collections.max(scores) && min == Collections.min(scores)));
    }
}
