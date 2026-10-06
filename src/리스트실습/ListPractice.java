package 리스트실습;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // List 인터페이스의 참조변수에 ArrayList 객체
        List<String> list = new ArrayList<>();

        // 1. 입력: 문자열 10개
        System.out.println("문자열 10개 입력: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) +"번째: ");
            list.add(sc.nextLine());  // 맨 마지막 리스트에 값을 추가
        }

        // 2. 전체 출력 및 크기
        System.out.println("\n[전체] " + list);
        System.out.println("크기: " + list.size());

        // 3. 추가
        list.add("Java");      // 맨 뒤에 추가
        list.add(0, "Start");  // 맨 앞에 삽입
        System.out.println("\n[추가 후] " + list);
        System.out.println("크기: " + list.size());

        // 4. 조회
        System.out.println("\n인덱스 3번 요소: " + list.get(3));

        // 5. 수정 (set은 변경 전 값을 반환)
        String oldValue = list.set(2, "Modified");
        System.out.println("\n인덱스 2번 변경 전 값: " + oldValue);
        System.out.println("[수정 후] " + list);

        // 6. 삭제
        String removed = list.remove(1);           // 인덱스로 삭제 → 삭제된 값 반환
        System.out.println("\n삭제된 요소(인덱스 1): " + removed);
        boolean isRemoved = list.remove("Java");   // 값으로 삭제 → 성공 여부 반환
        System.out.println("\"Java\" 삭제 성공 여부: " + isRemoved);
        System.out.println("[삭제 후] " + list);

        // 7. 검색
        System.out.print("\n검색어 입력: ");
        String keyword = sc.nextLine();
        boolean found = list.contains(keyword);
        System.out.println("포함 여부: " + found);
        if (found) {
            System.out.println("위치: " + list.indexOf(keyword) + "번 인덱스");
        } else {
            System.out.println("찾을 수 없습니다");
        }

        // 8. 반복 출력
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 9. 정렬 (오름차순)
        Collections.sort(list);
        System.out.println("\n[정렬 후] " + list);

        // 10. 전체 삭제
        list.clear();
        System.out.println("\n[전체 삭제] 크기: " + list.size() + ", 비어있음: " + list.isEmpty());

        sc.close();

    }
}
