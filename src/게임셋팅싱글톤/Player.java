package 게임셋팅싱글톤;

public class Player {
    private String name;
    private GameSettings settings = GameSettings.getInstance();

    public Player(String name) {
        this.name = name;
    }

    void changeSettings(String res, int vol, String diff) {
        System.out.println(name + "의 설정 변경");
        settings.setResolution(res);
        settings.setVolume(vol);
        settings.setDifficulty(diff);
    }

    void viewSettings() {
        System.out.println(name + "현재 설정");
        System.out.println("  해상도 : " + settings.getResolution());
        System.out.println("  볼륨   : " + settings.getVolume());
        System.out.println("  난이도 : " + settings.getDifficulty());
    }

}
