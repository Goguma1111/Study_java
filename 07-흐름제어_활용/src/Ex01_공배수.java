import java.util.Scanner;

public class Ex01_공배수 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.print("x를 입력하세요(2~9): ");
        int x = reader.nextInt();

        System.out.print("y를 입력하세요(2~9): ");
        int y = reader.nextInt();

        reader.close();


        //공배수 총합을 위한 배수

        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if (i% x == 0 && i % y == 0){
                System.out.printf("%d는 공배수입니다.\n", i);
                sum += i;
            }
        }

        System.out.printf("1~100 범위 안에서 %d와 %d의 공배수 총합은 %d 입니다.\n",x, y, sum);

    }
}
