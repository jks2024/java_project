package 다운캐스팅;

public abstract class Animal {
    public void move() {
        System.out.println("동물이 움직 입니다.");
    }
    public abstract void option();
}

class Human extends Animal {
    @Override  // 오버라이드 관계 성립 여부 확인
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    @Override
    public void option() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    @Override
    public void option() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    @Override
    public void option() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}

// 다른 동물 2개 추가 하기
