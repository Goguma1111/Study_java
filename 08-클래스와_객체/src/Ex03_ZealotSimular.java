class Zealot {

    int hp; // 체력
    int dps; // 공격력


    // 상태확인 메서드
    void state() {
        System.out.printf("상태확인 >>> hp : %d, dps: %d\n", hp, dps);
    }


    // 레벨업 - 모든 속성이 증가
    void levelUp() {
        hp += 10;
        dps += 2;
        System.out.println("레벨업을 하여 체력(+10), 공격력(+2)이 증가합니다.");
    }


    // 공격을 받음 - 상대 공격력만큼 체력이 감소
    void attacked(int enemyAttack) {
        hp -= enemyAttack;
        System.out.printf("%d의 공격을 받아 hp가 %d만큼 감소합니다.\n", enemyAttack, hp);
    }
}

// 메서드 실행에 따른 멤버변수의 변화확인
public class Ex03_ZealotSimular {
    public static void main(String[] args) {
        Zealot zealot1 = new Zealot();
        zealot1.hp = 100;
        zealot1.dps = 20;


        zealot1.state();
        zealot1.attacked(30);
        zealot1.state();
        zealot1.levelUp();
        zealot1.state();
    }
}
