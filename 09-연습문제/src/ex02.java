public class ex02 {
    public static void main(String[] args) {
        course[]  c = new course [3];
        c[0] = new onlineCourse("자바 프로그래밍", "김교수");
        c[1] = new offlineCourse("자료구조", "이교수");
        c[2] = new HybridCourse("AI프로젝트", "박교수");

        for (int i = 0; i< c.length; i++){
            c[i].showInfo();
            c[i].Startclass();
            System.out.println();


        }

        HybridCourse h = (HybridCourse) c[2];
        h.switchmode("실시간 화상");
    }
}
