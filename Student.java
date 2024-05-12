public class Student {
    private String studId;
    private String studName;

    public Student(String studId, String studName) {
        this.studId = studId;
        this.studName = studName;
    }

    public String getStudId() {
        return studId;
    }
    public void setStudId(String studentId) {
        this.studId = studentId;
    }
    public String getStudName() {
        return studName;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
}