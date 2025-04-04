/**
 * 게임중 캐릭터가 구현해야 하는 이동관련 기능을 나열
 */
public interface Imove {
    /**걷다 */
    public void walk();

    /** 달리다 */
    public void run();

    /** 점프하다 */
    public void jump();
    
} 