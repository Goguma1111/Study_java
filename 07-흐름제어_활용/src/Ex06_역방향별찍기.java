public class Ex06_역방향별찍기 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            
            for (int j =0; j < 7 - i;  j++) {
                System.out.print("*");

            }
            System.out.println(); // 줄바꿈
        }
    }
}
