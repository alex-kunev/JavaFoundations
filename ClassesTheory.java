import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassesTheory {
    private static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        Student(int id) {
            this(null, null,  id,  null);
        }

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }
    }

    public static void main(String[] args) {
//        Student student1 = new Student("George", 15, 6.00 );
//
//        Student student2 = new Student(16);

        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = sc.next();
        while (!input.equals("end")) {
            Student student = new Student(input, sc.next(), sc.nextInt(),
                    sc.next() );

            students.add(student);

            input = sc.next();
        }
         String cityName = sc.next();

    }
}
