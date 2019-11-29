package LabsFinal.Lab6.Classes;

import java.util.Date;

public class Technician extends TechnicalStaff{
    public Technician( Person person, Date joined, String[] education, String[] certification, String[] languages ) {
        super( person, joined, education, certification, languages );
    }
}
