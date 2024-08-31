import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean valid = true;
        Scanner scanner = new Scanner(System.in);
        StudentManager s1Manager = new StudentManager();
       while (valid) {
        System.out.println("1.Add astudent.");
        System.out.println("2.Remove a student.");
        System.out.println("3.Get a student by ID.");
        System.out.println("4.Display all students.");
        System.out.println("5.calculate average grade.");
        System.out.println("0.Exit");
        System.out.println();
        System.out.println("Select the option: example(1)");

        int option = scanner.nextInt();

        switch (option) {
            case 1:

                System.out.println("Student - Name");
                String name = scanner.next();
                
                System.out.println("Student - Id");
                int Id = scanner.nextInt();
                
                System.out.println("Student - Age");
                int age = scanner.nextInt();
                
                System.out.println("Student - Grade");
                double grade = scanner.nextDouble();
                s1Manager.addstudent(new StudentClass(Id, name, age, grade));
                break;
        
            case 2:
                System.out.println("Student ID");
                int id = scanner.nextInt();
                s1Manager.removestudent(id);
                break;
            case 3:
                System.out.println("Enter the Student Id.");
                int student_id = scanner.nextInt();
                System.out.println(s1Manager.getstudent(student_id)); 
                break;
            case 4:
                System.out.println(s1Manager.getallstudent());
                break;
            case 5:
                System.out.println(s1Manager.calculateAverageGrade()); 
                break;
            case 0:
                valid = false;
                break;
        }

       }
        
    }
}

/*Display a menu with options:
Add a student.
Remove a student.
Get a student by ID.
Display all students.
Calculate average grade.
Exit.
Handle user input and call appropriate methods from StudentManager. */