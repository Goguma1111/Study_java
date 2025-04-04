import java.util.Scanner;

public class Ex02_If문_비교식_조건 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int myage = reader.nextInt();
        reader.close();


        if(myage == 19) {
            System.out.println("19살입니다.(1)");
        }


        if(myage != 19) {
            System.out.println("19살이 아닙니다.(2)");
        }


        if (myage > 19) {
            System.out.println("성인입니다.(3)");

        }


        if (myage <= 19) {
            System.out.println("학생입니다.(4)");
        }
    }
}
