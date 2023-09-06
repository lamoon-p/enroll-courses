public class Main {

    public static void main(String[] args) {

        // Initialize an object
        Student student1 = new Student();
        student1.setName("Top");
        student1.setGrade(3.00f);

        Student student2 = new Student();
        student2.setName("Nan");
        student2.setGrade(4.00f);

        // add courses
        student1.addCourse("Chemistry 101");
        student1.addCourse("English 101");
        System.out.println(student1);

        student2.addCourse("Psychology 101");
        student2.addCourse("Thai 101");
        System.out.println(student2);

        // remove courses
        student1.removeCourse(0);
        System.out.println(student1);

        student2.removeCourse(1);
        System.out.println(student2);

    }
}
