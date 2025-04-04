public class Ex05_스코브1 {
    public static void main(String[] args) {
        if (true) {
            int num = 100;

            for (int i=0; i < 5; i++) {
                // 선언된 위치보다 하위블록에서는 식별 가능
                num++;
            }
        }

        System.out.println(num); // 선언된 위치보다 바깥 블록이므로 에러
    }
}
