// 멤버변수와 geeter, setter 정의

public class Vulture {
    private String name;
    private int hp;

    // getter and setter for name
    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }


    // getter ans setter for hp
    int gethp() {
        return this.hp;
    }

    void setHp(int hp) {
        if (hp < 1) {
            hp = 1; // 체력이 1보다 작아지지 않도록 제한
        }
        
        this.hp = hp;
    }

// 생성자와 기능 구현

    // 생성자
    public Vulture (String name, int hp) {
        this.setName(name);
        this.setHp(hp);
        System.out.printf("[%s] Alright! Bring it on!\n", this.name);
    }

    // 객체의 상태 출력
    void state() {
        System.out.printf("[%s] hp: %d\n", this.getName(),this.gethp());
    }

    // 레벨업 - 체력증가
    void levelUp() {
        this.setHp(hp);
        System.out.printf("[%s]레벨업을 하여 체력(+5)가 증가합니다.\n",this.getName());

    }

    // 공격을 받음 체력이 감소
    void attacked(int enemyAttack){
        this.setHp(this.gethp()- enemyAttack);
        System.out.printf("[%s] 적의 공격을 받아 hp가 %d 감소합니다.", this.getName(),enemyAttack);

    }
}
