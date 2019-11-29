package LabsFinal.Lab6.Classes;

import java.util.Date;

public class Surgeon extends Doctor{

    public Surgeon( Person person, Date joined, String[] education, String[] certification, String[] languages, String[] speciality, String[] locations ) {
        super( person, joined, education, certification, languages, speciality, locations );
    }
}
