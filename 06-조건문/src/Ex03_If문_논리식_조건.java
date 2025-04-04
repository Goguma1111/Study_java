import java.util.Scanner;

public class Ex03_If문_논리식_조건 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("점수를 입력하세요: ");
        int point = reader.nextInt();
        reader.close();

        // AND(&&) -> 두 조건이 모두 참
        if (point > 70 && point <= 80) {
            System.out.println("C학점 입니다.");
        }

        // OR(||) -->두 조건 중 하나라도 참이라면 전체가 참

        if (point <= 70 || point > 80) {
            System.out.println("c학점이 아닙니다.");
        }
    }
}
