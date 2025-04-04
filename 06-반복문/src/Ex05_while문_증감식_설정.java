public class Ex05_while문_증감식_설정 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (i < 100){
            sum += i;
            System.out.printf("i=%d, sum = %d\n", i, sum);

            i += 10;
        }
    }
}
