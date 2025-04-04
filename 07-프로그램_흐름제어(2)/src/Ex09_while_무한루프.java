public class Ex09_while_무한루프 {
    public static void main(String[] args) {
        int num = 1;
        while (num < 10) {
            System.out.println("Hello world >> " + num);

            /* 증감식 설정 오류 */
            // 1씩 증가해서 언젠가는 10을 초과해야 하는 i값이 1씩 감소하여 
            // 점점 10 보다 더작아지기 때문에 무한루프에 빠지게 된다.
            num--;
        }
    }
}
