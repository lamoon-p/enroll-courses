public class Main {

    public static void main(String[] args) {

        // Initialize an object
        StudentRequest request1 = new StudentRequest();
        request1.setName("Top");
        request1.setGrade(3.00f);

        StudentRequest request2 = new StudentRequest();
        request2.setName("Nan");
        request2.setGrade(4.00f);

        // add courses
        request1.addCourse("Chemistry 101");
        request1.addCourse("English 101");

        request2.addCourse("Psychology 101");
        request2.addCourse("Thai 101");

        // remove courses
        request1.removeCourse(0);
        System.out.println(request1);

        request2.removeCourse(1);
        System.out.println(request2);

        Student student1 = validateAndSave(request1);
        Student student2 = validateAndSave(request2);

        System.out.println(student1);
        System.out.println(student2);
    }

    // Input validation method
    public static Student validateAndSave(StudentRequest request) {

        if (request.getName() == null) {
            System.out.println("Please re-enter name.");
        }

        if (!request.getName().matches("[a-zA-Z]+")) {
            System.out.println("Please enter a proper name.");
        }

        if (request.getGrade() <= 0.00f || request.getGrade() > 4.00f) {
            System.out.println("Please enter a proper grade.");
        }

        if (request.getCourses() == null) {
            System.out.println("Please enter a proper course.");
        }

        Student student = new Student();
        student.setName(request.getName());
        student.setGrade(request.getGrade());
        student.setCourses(request.getCourses());

        return student;
    }
}
