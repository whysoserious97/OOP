package LabsFinal.Lab6.Classes;

import java.util.Date;

public class Staff extends Person{
    Date joined;
    String[] education;
    String[] certification;
    String[] languages;

    public Staff(Person person,Date joined,String[] education,String[] certification,String[] languages) {
        super(person.title,person.givenName,person.middleName,person.familyName,person.birthDate,person.gender,person.homeaddress,person.phone);
        this.joined=joined;
        this.education=education;
        this.certification=certification;
        this.languages=languages;
    }
}
