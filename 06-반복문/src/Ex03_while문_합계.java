public class Ex03_while문_합계 {

    public static void main(String[] args) {
        int sum =0;

        int i = 1;

        while (i< 11) {
            sum+= i;
            System.out.printf("i=%d, sum=%d", i , sum);
            i++;
        }
    }
}