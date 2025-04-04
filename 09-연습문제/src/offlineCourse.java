public class offlineCourse extends course {

    public offlineCourse(String courseName, String teacherName) {
            super(courseName, teacherName);
        }
    
    @Override
    public void Startclass() {
        System.out.println("지정된 강의실에서 대면 수업을 시작합니다.");
    }
    
}
