public class Ex10_Break제어 {
    public static void main(String[] args) {
        String grade = "C";
        
        switch (grade) {
            case "A":
            case "B" :
            case "c" :
                System.out.println("pass...(1)");
                break;
            default:
                System.out.println("Not-Pass");    
                break;

        }


        // 위와 같은 코드 처리
        if (grade == "A" || grade == "B" || grade == "C") {
            System.out.println("pass...(2)");
        } else {
            System.out.println("Not-pass....(2)");
        }
    }
}
