import java.util.ArrayList;
import java.util.List;

public class StudentRequest {

    private String name;
    private float grade;
    private List<String> courses = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String courseName) {

        courses.add(courseName);
        System.out.println("Course Added!");
    }

    public void removeCourse(int courseIndex) {

        courses.remove(courseIndex);
        System.out.println("Course removed!");
    }

    @Override
    public String toString() {
        return "StudentRequest{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", courses=" + courses +
                '}';
    }
}
