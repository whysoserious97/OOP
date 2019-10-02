package Labs.Lab1.University;

public class University {

    public String name;
    public Student[] students;
    public int year;
    public double avgmark;

    University( String name, int year, Student[] students){
    this.name= name;
    this.year= year;
    this.students= students;

    // computing the average based on students marks
       double sum=0;
        for (int i = 0; i < students.length; i++)
        {
            sum+=students[i].avgmark;
        }
        avgmark= sum / students.length;
    }

}
