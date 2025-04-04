public class Ex04_If문_논리값_조건 {
    public static void main(String[] args) {
        boolean iskorean = true;
        //boolean iskorean = false;

        if (iskorean == true) {
            System.out.println("한국사람 입니다.(1)");
        }

        if (iskorean == false) {
            System.out.println("한국사암이 아닙니다.(2)");
        }

        if (iskorean != true) {
            System.out.println("한국사람이 아닙니다.(3)");
        }

        if (iskorean != false) {
            System.out.println("한국사람 입니다.(4)");
        }

        if (iskorean) {
            System.out.println("한국사람 입니다.(5)");
        }

        if (!iskorean) {
            System.out.println("한국사람이 아닙니다.(6)");
        }
    }
}
