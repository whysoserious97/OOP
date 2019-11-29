package LabsFinal.Lab1.University;


public class Lab_1 {
    public static void main (String[] args) {


        // creating UTM students and the respective array.
        Student student11 = new Student("Andrei", 21, 9.5);
        Student student12 = new Student("Alin", 20, 8.8);
        Student student13 = new Student("Dan", 19, 8.9);
        Student[] utmstudents = { student11, student12, student13 };

        // creating ASEM students and the respective array.
        Student student21 = new Student("Ioana", 20, 9.6);
        Student student22 = new Student("Zina", 20, 8.4);
        Student student23 = new Student("Radu", 22, 7.4);
        Student[] asemstudents = { student21, student22, student23 };

        // creating USM students and the respective array.
        Student student31 = new Student("Dana", 20, 9.4);
        Student student32 = new Student("Cristi", 20, 8.6);
        Student student33 = new Student("Florin", 22, 7.0);
        Student[] usmstudents = { student31, student32, student33 };

        // create ASEM,UTM,USM and give the respective information and arrays with students.
        University utm = new University ("UTM",1965, utmstudents);
        University asem = new University ("ASEM",1991, asemstudents);
        University usm = new University ("USM",1946,usmstudents);

        //correcting the wrong data.
        utm.year=1964;
        // printing the average marks obtained by stundents.
        System.out.println ("UTM students have "+utm.avgmark + " in average");
        System.out.println ("USM students have "+usm.avgmark + " in average");
        System.out.println ("ASEM students have "+asem.avgmark + " in average");
    }


}
