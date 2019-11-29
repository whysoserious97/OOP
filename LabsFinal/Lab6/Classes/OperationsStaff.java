package LabsFinal.Lab6.Classes;


import java.util.Date;

public class OperationsStaff extends Staff{
    Patient[] patients;
    public OperationsStaff(Person person,Date joined,String[] education,String[] certification, String[] languages){
        super(person,joined,education,certification,languages);
    }
    public void newPatientInList(Patient patient){
        Patient[] temp=new Patient[patients.length+1];
        for (int i = 0 ;  i < patients.length;i++)
        {
            temp[i]=patients[i];
        }
        temp[patients.length]=patient;
        patients=temp;
    }
    public void displayPatients(){
        for (int i = 0; i< patients.length;i++)
        {
            System.out.println(patients[i].givenName);
        }
    }
}
