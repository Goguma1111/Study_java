import java.util.Scanner;

public class Ex02_IfFor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
    System.out.print("숫자를 입력하세요");
    int k = reader.nextInt();
    reader.close();

    if(k > 1 && k < 10) {
        for (int i = 1; i<10; i++) {
            System.err.printf("%d x %d = %d\n", k , i, k * i);
        }
    } else{
        System.out.println("2~9사이만 출력합니다.");
    }

    }
}
