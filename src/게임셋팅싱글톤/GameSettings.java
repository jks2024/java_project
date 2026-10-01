package 게임셋팅싱글톤;

public class GameSettings {
    private String resolution;
    private int volume;
    private String difficulty;

    // 클래스 생성 시 단 한번 객체 생성
    private static GameSettings instance = new GameSettings();

    // 외부에서 new로 생성하지 못하도록 private 생성자
    private GameSettings() {
        resolution = "1920x1080";
        volume = 50;
        difficulty = "easy";
    }

    // 유일한 인스턴스 반환
    public static GameSettings getInstance() {
        return instance;
    }

    public String getResolution() {
        return resolution;
    }

    public int getVolume() {
        return volume;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
