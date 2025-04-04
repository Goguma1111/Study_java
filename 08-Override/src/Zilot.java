public class Zilot extends Protoss {
    public Zilot(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);
    }


    /* 메서드 override */  
    // 자식클래스가 부모가 갖고 있는 메서드를 다시 새롭게 구성하는 것 --> 기능의 수정
    // 자식 클래스의 객체를 통해 이 메서드를 호출하면 부모가 갖고 있는 기능은 비활성화 된다.

    @Override
    public void move (String target) {
        // 부모 클래스의 멤버변수는 은닉된 상태이므로 접근 불가.
        // 대신 부가 부모 클래스의 getter, setter가 상속 되었으므로 이를 통해 데이터에 접근
        System.out.printf("[Zilot] %s (이)가 빠른 속도로 이동합니다.\n", this.getName(), target);
    }

    @Override
    public void attack (String target){
            System.out.printf("[Zealot](이)가 %s(을) 칼로 찌릅니다. >> 데미지: %d\n", this.getName(), target, this.getDps());
        
    }
        /**
         *  이 클래스가 독작적으로 갖는 고유의 기능
         * @param target 공격할 대상   
         */
        public void swapaAttack (String target) {
            System.out.printf("[지럿의 고유 스킬] %s가 %s을 칼로 공격합니다.\n", this.getName(), target);
        }

    }

