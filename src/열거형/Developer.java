package 열거형;

public class Developer {
    private String name;
    private DevType devType;
    private Career career;
    private Gender gender;
    private String addr;

    // 매개변수가 있는 생성자
    public Developer(String name, DevType devType, Career career, Gender gender, String addr) {
        this.name = name;
        this.devType = devType;
        this.career = career;
        this.gender = gender;
        this.addr = addr;
    }

    // 정보 출력
    @Override
    public String toString() {
        return "이름: " + name + "\n" + "개발 분야: " + devType + "\n" + "경력: "  + career + "\n"
                + "성별: " + gender + "\n" + "주소: "  + addr + "\n";
    }

    // 게터 / 세터 만들기
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DevType getDevType() {
        return devType;
    }

    public void setDevType(DevType devType) {
        this.devType = devType;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
