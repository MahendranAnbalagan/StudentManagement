public class StudentClass {
    private int student_id;
    private String student_name;
    private int student_age;
    private double student_grade;


    public StudentClass(int student_id,String student_name,int student_age,double student_grade){
        this.student_id = student_id;
        this.student_age = student_age;
        this.student_name= student_name;
        this.student_grade = student_grade;
    }

    
    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }

    public double getStudent_grade() {
        return student_grade;
    }

    public void setStudent_grade(double student_grade) {
        this.student_grade = student_grade;
    }

    public String toString(){
        return ("Name: "+student_name + "\n Age: "+ student_age+"\n Student_Id"+ student_id+"\n Grade: " + student_grade);
    }
    
}




/*Fields: id (int), name (String), age (int), grade (double).
Constructor: To initialize all fields.
Methods:
getId(), getName(), getAge(), getGrade(): To get the values of the fields.
setName(String name), setAge(int age), setGrade(double grade): To set the values of the fields.
toString(): To return a string representation of the student.
 */