public class onlineCourse extends course{

    public onlineCourse(String courseName, String teacherName) {
            super(courseName, teacherName);
        }
    

    @Override
    public void Startclass() {
    System.out.println("zoom 링크를 통해 온라인 수업을 시작합니다.");

    }
         
}
