package 싱글톤;

public class Student {
    Singleton singleton = Singleton.getInstance();  // 이미 생성된어 있는 싱글톤 객체의 주소를 가져옴

    void setInfo(String name, int id) {
        singleton.name = name;  // 싱글톤 객체의 인스턴스 필드 객체 접근
        singleton.id = id;
    }

    public void print() {
        System.out.println("이름 : " + singleton.name);
        System.out.println("아이디 : " + singleton.id);
    }
}
