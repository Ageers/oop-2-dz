package School;

public class SchoolClass {

    private String schoolClass;

    private Student student[] = {

    };

    public SchoolClass(String schoolClass, School.Student[] student) {
        this.schoolClass = schoolClass;
        this.student = student;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
