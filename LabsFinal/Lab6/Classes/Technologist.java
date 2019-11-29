package LabsFinal.Lab6.Classes;

import java.util.Date;

public class Technologist extends TechnicalStaff{
    public Technologist( Person person, Date joined, String[] education, String[] certification, String[] languages ) {
        super( person, joined, education, certification, languages );
    }
}
