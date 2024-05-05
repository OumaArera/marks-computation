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
    String class_teacher;

    public void calculateMarks()
    {
        marks = mathematics + science + ssh + english + kiswahili;
    }

    public void calculateGrade()
    {
        if (marks >= 400){
            grade = "A";

        }else if (marks >= 350){
            grade = "B+";

        }else if (marks >= 300){
            grade = "B";

        }else if (marks >= 250){
            grade = "B-";

        }else{
            grade = "F";
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
        s2.mathematics = 90;
        s2.science = 91;
        s2.ssh = 79;
        s2.english = 73;
        s2.kiswahili = 95;
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
        s3.kiswahili = 99;
        s3.calculateMarks();
        s3.calculateGrade();
        s3.class_teacher = "Rambung' Fee";

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i=0; i < students.length; i++)
        {
            System.out.println();
            System.out.println(students[i].admin_no + " " + students[i].name + " " + students[i].class_stream + " " + students[i].mathematics + " " + students[i].science + " " + students[i].english + " " + students[i].kiswahili + " " + students[i].ssh + " " + students[i].marks + " " + students[i].grade + " " + students[i].class_teacher);
            
        }
        System.out.println();

    }

}



