public class Student {
    private String studId;
    private String studName;

    public Student(String studentId, String studName) {
        this.studId = studentId;
        this.studName = studName;
    }

    public String getStudentId() {
        return studId;
    }
    public void setStudentId(String studentId) {
        this.studId = studentId;
    }
    public String getStudName() {
        return studName;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
}