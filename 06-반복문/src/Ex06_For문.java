public class Ex06_For문 {
    public static void main(String[] args) {
        for(int x =0; x < 10; x++) {
            System.out.printf("x = %d\n", x);
        }

        // for문은 종료후 초기식에서 설정한 변수를 인식할 수 없다.
        // System.out.println(x);
    }
}
