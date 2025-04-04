public class Ex08_for문_합계 {
    public static void main(String[] args) {
        int sum =0; // 변수를 0으로 초기화

        for (int i = 1; i < 11; i++) {
            // sum의 i값이 1~10까지 변하는 동안 누적합산을 한다.
            sum+= i;

            System.out.printf("i=%d, sum = %d\n", i, sum);
        }
    }
}
