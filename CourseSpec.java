import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by shalev on 07/12/2016.
 */
public class CourseSpec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        int number = scanner.nextInt();
        Course course = new Course(name, number);
        System.out.println("Created Course: " + course.getName() + "(" + course.getCourseNumber() + ")");

        System.out.println("getName(): " + course.getName());
        System.out.println("getCourseNumber(): " + course.getCourseNumber());
        System.out.println("toString(): is it String? " + course.toString().getClass().equals(String.class));
        System.out.println("isEqualTo(): with number " + number + ": " + course.isEqualTo(new Course("someName", number)));
        System.out.println("isEqualTo(): with number " + (number + 1) + ": " + course.isEqualTo(new Course("someName", number + 1)));
    }
}
