package 게임셋팅싱글톤;

public class GameMain {
    public static void main(String[] args) {
        // 플레이어 객체 2개 생성
        Player player1 = new Player("리브");
        Player player2 = new Player("제나");

        // 현재 설정 상태 확인
        player1.viewSettings();
        player2.viewSettings();

        // 플레이어 1 설정 변경
        player1.changeSettings("1920x1080", 100, "hard");

        // 플레이어 2 설정 확인
        player2.viewSettings();

    }
}
