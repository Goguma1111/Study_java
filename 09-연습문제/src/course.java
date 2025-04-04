public abstract class course {
    private String courseName;
    private String teacherName;



    public course(String courseName, String teacherName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
    }


    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

  

    public void showInfo() {
        System.out.println("수업명 : " + this.courseName + "/ 교사:" + this.teacherName);
    }


    public abstract void Startclass();



}
