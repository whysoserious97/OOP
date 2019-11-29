package LabsFinal.Lab6.Classes;

import LabsFinal.Lab6.DataTypes.Address;
import LabsFinal.Lab6.DataTypes.Phone;

public class Hospital{
    public String name;
    public Address address;
    public Phone phone;
    public Department[] departments;
    public Person[] people;
    public Hospital(String name,Address address,Phone phone,Department[] departments){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.departments=departments;
    }
    public void gotVisited(Person person){
        Person[] temp=new Person[people.length+1];
        for ( int i=0;i<people.length;i++ )
        {
            temp[i]=people[i];
        }
        temp[people.length]=person;
        people=temp;
    }
    public void displayListOfPeople(){
        for (int i = 0;i<people.length;i++)
        {
            System.out.println(people[i].givenName);
        }
    }
}
