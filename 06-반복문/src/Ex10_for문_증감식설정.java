public class Ex10_for문_증감식설정 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수

        for (int i = 0; i < 100; i += 10) {
            sum += i;
            System.out.printf("i=%d, sum = %d\n", i, sum);
        }
    }
}
