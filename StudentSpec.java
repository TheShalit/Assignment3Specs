import java.util.Scanner;

/**
 * Created by shalev on 07/12/2016.
 */
public class StudentSpec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        int number = scanner.nextInt();
        Student student = new Student(name, number);
        System.out.println("Created Course: " + student.getName() + "(" + student.getID() + ")");

        System.out.println("getName(): " + student.getName());
        System.out.println("getID(): " + student.getID());
        System.out.println("toString(): is it String? " + student.toString().getClass().equals(String.class));
        System.out.println("isEqualTo(): with number " + number + ": " + student.isEqualTo(new Student("someName", number)));
        System.out.println("isEqualTo(): with number " + (number + 1) + ": " + student.isEqualTo(new Student("someName", number + 1)));

        Course course = new Course("someCourse", 1);
        System.out.println("isRegesteredTo(): with number 1: " + student.isRegesteredTo(course));

        System.out.println("registering student to course 1: " + student.registerTo(course));
        System.out.println("isEqualTo(): with number 1: " + student.isRegesteredTo(course));

        System.out.println("registering student to course 1 again: " + student.registerTo(course));

        System.out.print("filling student with courses: ");
        for (int i = 1; i < 10; i++)
            System.out.print(student.registerTo(new Course("someName", i + 1)) + " ");
        System.out.println();

        System.out.println("trying to add another course: " + student.registerTo(new Course("someName", 11)));
    }
}
