package LabsFinal.Lab6.Classes;

import java.util.Date;

public class Doctor extends OperationsStaff{
   public String[] speciality;
   public String[] locations;
    public Doctor( Person person, Date joined, String[] education, String[] certification, String[] languages,String[] speciality,String[] locations ) {
        super( person, joined, education, certification, languages );
        this.speciality=speciality;
        this.locations=locations;
    }
}
