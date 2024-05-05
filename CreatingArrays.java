import java.util.Arrays;
import java.util.Comparator;

/**
 * CreatingArrays
 */
class Students 
{
    int admin_no;
    String name;
    String class_stream;
    int mathematics;
    int science;
    int ssh;
    int english;
    int kiswahili;
    int marks;
    String grade;
    int rank;
    String class_teacher;

    public void calculateMarks()
    {
        marks = mathematics + science + ssh + english + kiswahili;
    }

    public String calculateGrade()
    {
        if (marks >= 400){
            return grade = "A";
        } else if (marks >= 350){
            return grade = "B+";
        } else if (marks >= 300){
            return grade = "B";
        } else if (marks >= 250){
            return grade = "B-";
        } else {
            return grade = "F";
        }
    }
}


public class CreatingArrays {

    public static void main(String[] args) 
    {
        Students s1 = new Students();
        s1.admin_no = 7330;
        s1.name = "John Oluoch ";
        s1.class_stream = "F4 Green";
        s1.mathematics = 91;
        s1.science = 98;
        s1.ssh = 89;
        s1.english = 67;
        s1.kiswahili = 91;
        s1.calculateMarks();
        s1.calculateGrade();
        s1.class_teacher = "Rambung' Fee";

        Students s2 = new Students();
        s2.admin_no = 7331;
        s2.name = "Peachy Kweyu";
        s2.class_stream = "F4 Red  ";
        s2.mathematics = 91;
        s2.science = 89;
        s2.ssh = 79;
        s2.english = 98;
        s2.kiswahili = 79;
        s2.calculateMarks();
        s2.calculateGrade();
        s2.class_teacher = "Rambung' Fee";

        Students s3 = new Students();
        s3.admin_no = 7334;
        s3.name = "Ouma Arera  ";
        s3.class_stream = "F4 Blue ";
        s3.mathematics = 87;
        s3.science = 89;
        s3.ssh = 91;
        s3.english = 56;
        s3.kiswahili = 90;
        s3.calculateMarks();
        s3.calculateGrade();
        s3.class_teacher = "Rambung' Fee";

        Students students[] = new Students[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        Arrays.sort(students, Comparator.comparingInt(s -> -s.marks));

        int rank = 1;
        int previousMarks = students[0].marks;

        for (int i = 0; i < students.length; i++) {
            if (students[i].marks < previousMarks) {
                rank = i + 1;

            }

            students[i].rank = rank;
            previousMarks = students[i].marks;
            
             
        }

        // for (int i=0; i < students.length; i++)
        // {
        //     System.out.println();
        //     System.out.println(students[i].admin_no + " " + students[i].name + " " + students[i].class_stream + " " + students[i].mathematics + " " + students[i].science + " " + students[i].english + " " + students[i].kiswahili + " " + students[i].ssh + " " + students[i].marks + " " + students[i].grade + " " + students[i].rank + " " + students[i].class_teacher);
            
        // }
        // System.out.println();

        for (Students student : students){

            System.out.println();
            System.out.println(student.admin_no + " " + student.name + " " + student.class_stream + " " + student.mathematics + " " + student.science + " " + student.english + " " + student.kiswahili + " " + student.ssh + " " + student.marks + " " + student.grade + " " + student.rank + " " + student.class_teacher);
        }
        System.out.println();

    }

}


