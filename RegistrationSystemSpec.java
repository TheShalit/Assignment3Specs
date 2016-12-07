import java.util.Arrays;

/**
 * Created by shalev on 07/12/2016.
 */
public class RegistrationSystemSpec {
    public static void main(String[] args) {
        RegistrationSystem rs = new RegistrationSystem();

        Student student = new Student("s", 1);
        Course course = new Course("c", 1);
        student.registerTo(course);

        System.out.println("addStudent() student 1: " + rs.addStudent(student));
        System.out.println("addStudent() student 1 again: " + rs.addStudent(student));

        System.out.println("addCourse() course 1: " + rs.addCourse(course));
        System.out.println("addCourse() student 1 again: " + rs.addCourse(course));

        Course course2 = new Course("c", 2);
        rs.addCourse(course2);
        System.out.println("register student to course 2: " + rs.register(student, course2));

        Course course3 = new Course("c", 3);
        System.out.println("adding course 3 to RegistrationSystem only: " + rs.addCourse(course3));

        System.out.println("findExamConflicts(): " + Arrays.deepToString(rs.findExamConflicts()));

        int counter = 1;
        boolean result = true;
        for (int i = 1; i < 500 & result; i++) {
            Student aStudent = new Student("s", ++counter);
            result = rs.addStudent(aStudent);
        }
        System.out.println("filling RegistrationSystem with students: " + counter);

        System.out.println("trying to add more student: " + rs.addStudent(new Student("s", 501)));

        counter = 3;
        result = true;
        for (int i = 3; i < 500 & result; i++) {
            Course aCourse = new Course("s", ++counter);
            result = rs.addCourse(aCourse);
        }
        System.out.println("filling RegistrationSystem with courses: " + counter);

        System.out.println("trying to add more course: " + rs.addCourse(new Course("c", 501)));
    }
}
