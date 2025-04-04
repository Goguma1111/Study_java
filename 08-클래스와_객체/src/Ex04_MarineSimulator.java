class Marine{
    String name; // 이름
    int hp; // 체력

    // 생성자 : 객체 속성을 초기화
    Marine(String name,int hp){
        this.name = name;
        this.hp = hp;
        System.out.printf("[%s] you wanna piece of me boy? \n", this.name);
    }

    // 상태확인 메서드

    void state() {
        System.out.printf("[%s] hp: %d\n", name, hp);
    } 



    // 레벨업 - 체력증가

    void levelUp() {
        hp += 5;
        System.out.printf("[%s] 레벨업을 하여 체력(+5)가 증가합니다.\n", name);

    }


    void attacked(int enemyAttack){
        hp -= enemyAttack;
        System.out.printf("[%s] 적의 공격을 받아 hp가 감소됩니다.\n", name, enemyAttack);
    }


}


// 정의한 클래스 객체 사용하기
public class Ex04_MarineSimulator {
    public static void main(String[] args) {
        // 객체 생성과 동시에 생성자 호출
        Marine m1 = new Marine("마린1", 100);
        Marine m2 = new Marine("마린2", 100);


        // 객체 속성 출력
        m1.state();
        m2.state();
        
        //공격을 받아 체력이 감소
        m1.attacked(30);
        m2.attacked(20);

        // 객체의 속성 출력
        m1.state();
        m2.state();

        // 레벨업으로 체력 증가
        m1.levelUp();
        m2.levelUp();


        // 객체의 속성 출력
        m1.state();
        m2.state();
    }
}
