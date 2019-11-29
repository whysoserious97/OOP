package LabsFinal.Lab6.Classes;


import LabsFinal.Lab6.DataTypes.History;

import java.util.Date;

public class Patient extends Person{
    public String id;
    Integer age;
    Date accepted;
    History sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;
    OperationsStaff[] operationsStaffs;  // operationStafs to which patient has communicated in case of a virus
    public Patient(Person person,String id,Integer age, Date accepted,History sickness,String[] prescriptions,String[] allergies,String[] specialReqs){
        super(person.title,person.givenName,person.middleName,person.familyName,person.birthDate,person.gender,person.homeaddress,person.phone);
        this.id=id;
        this.age=age;
        this.accepted=accepted;
        this.sickness=sickness;
        this.prescriptions=prescriptions;
        this.allergies=allergies;
        this.specialReqs=specialReqs;
    }
    public void communicateOperationsStaff(OperationsStaff localoperationsStaff)
    {
        OperationsStaff[] tempOpStaff = new OperationsStaff[operationsStaffs.length+1];
        for (int i=0; i < operationsStaffs.length; i++)
        {
            if(operationsStaffs[i].phone==localoperationsStaff.phone)
            {
                return;
            }
            tempOpStaff[i]=operationsStaffs[i];
        }
        tempOpStaff[tempOpStaff.length-1]=localoperationsStaff;
        operationsStaffs=tempOpStaff;
        localoperationsStaff.newPatientInList( this );
    }
}
