public class Ex11_while_continue {
    public static void main(String[] args) {
        int x =5;

        while (x > 10) {
            x++;
            if (x % 2 ==0) { 
                continue;  //짝수일 경우 강제 이동
         }

         System.out.println(x);
        }
    }
}
