public class Ex06_스코브2 {
    public static void main(String[] args) {
        int num =100;

        for (int i = 0; i < 5; i++) {
            // 선언된 위치보다 하위블록에서는 식별가능
            num++;
        }

        System.out.println(i); // 에러
    }
}
