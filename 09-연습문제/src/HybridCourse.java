public class HybridCourse extends course {

    public HybridCourse(String courseName, String teacher) {
            super(courseName, teacher);
        }
    

    @Override
    public void Startclass() {
        System.out.println("온라인과 오프라인 수업을 병행합니다.");
    }

    public void switchmode(String mode) {
        System.out.println("현재 수업모드를 " + mode + " 으로 변경합니다.");
    }

    
    
}
