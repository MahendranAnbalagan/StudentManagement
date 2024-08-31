
import java.util.ArrayList;

public class StudentManager {
    public ArrayList<StudentClass> students;

    

    public StudentManager(){
        this.students = new ArrayList<StudentClass>();
    }

    

    public void addstudent(StudentClass student){
        students.add(student);
    }

    public void removestudent(int student_Id){
       for (int i = 0; i < students.size(); i++) {
        if (students.get(i).getStudent_id() == student_Id) {
            students.remove(i);
            return;
        }
       }
    }

    public String getstudent(int student_id){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudent_id() == student_id) {
                return students.get(i).getStudent_name();
            }
        }
        return "Student_id is not here";
    
    }

    public String getallstudent(){
        StringBuilder allnames = new StringBuilder();
        for (StudentClass student : students) {
            allnames.append(student.getStudent_name()).append("\n");
        }
        return allnames.toString();
    }

    public double calculateAverageGrade(){
        if (students.isEmpty()) {
            System.out.println("No students here add first");
        }
        
        double totalgrade =0;
        for (StudentClass student: students) {
            totalgrade+=student.getStudent_grade();
        }
        double average = totalgrade / students.size();
        return average;
       
    }
}


/*Field: List<Student> to store student objects.
Methods:
addStudent(Student student): To add a student to the list.
removeStudent(int id): To remove a student by their ID.
getStudent(int id): To get a student by their ID.
getAllStudents(): To return the list of all students.
calculateAverageGrade(): To calculate and return the average grade of all students. */