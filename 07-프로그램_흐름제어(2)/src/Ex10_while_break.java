public class Ex10_while_break {
    public static void main(String[] args) {
        int times = 1;
        int count = 0;


        while (true) {
            count++;
            times *= 2;
            System.out.println(times);


            if (times > 500) {
                break; //강제 종료
            }
        }


        System.out.println("총" + count + "회 수행했습니다.");
    }
}
