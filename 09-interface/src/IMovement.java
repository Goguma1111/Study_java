/**
 * 게임중 캐릭터가 구현해야하는 기본동작 관련 기능을 나열
 */
public interface IMovement {
    /** 아이템획득 */
    public void pickUpItem();

    /** npc와 대화하기 */
    public void talkNpc();
}
