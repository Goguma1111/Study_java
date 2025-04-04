import java.util.Scanner;

public class Ex04_while문_반복범위 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("x를 입력하세요: ");
        int x = reader.nextInt();

        System.out.println("y를 입력하세요 : ");
        int y = reader.nextInt();


        reader.close();


        int i = x;
        int sum =0;
        while (i< y+1) {
            
            System.out.printf("%d + %d\n" , sum, i);

            sum += i;

            i++;
        }
        System.out.printf("%d부터 %d가지의 촙합은%d입니다.",x,y, sum);
    }
}
