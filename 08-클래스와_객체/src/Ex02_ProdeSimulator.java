class prode{
    /** 이동 메서드 -> 이동할 좌표를 전달받아 이동 */
    void move (int x , int y){
        System.out.printf("좌표(%d, %d)로 이동합니다.\n",x,y);
    }

    /** 광물을 채집하는 메서드 -> 채집된 광물을 반환 */
    int mineral() {
        System.out.println("광물을 채집합니다.(+10)");
        return 10;
    }


    /** 가스를 채집하는 메서드 -> 채집된 가스를 반환 */
    int gas() {

        System.out.println("가스를 채집합니다.(+5)");
        return 5;

    }


}


// 객체를 통한 메서드 호출
public class Ex02_ProdeSimulator {
    public static void main(String[] args) {
        prode prode1 = new prode();
        prode1.move(10, 10);

        int my_mineral = 0;
        my_mineral += prode1.mineral();
        my_mineral += prode1.mineral();
        my_mineral += prode1.mineral();

        int my_gas = 0;
        my_gas += prode1.gas();
        my_gas += prode1.gas();

        System.out.printf("채집된 광물 : %d, 채집된 가스: %d\n", my_mineral, my_gas);
    }
}
