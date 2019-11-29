package LabsFinal.Lab1.Monitor;

public class Main{
    public static void main( String[] args ) {
        Monitor monitor1= new Monitor (2000,1000,"Grey");
        Monitor monitor2= new Monitor (1500,900,"Black");
        monitor1.width=1980;
        monitor1.hight=1080;
        monitor2.width=1440;
        if(monitor1.compareHight( monitor2)==-1)
        {
            System.out.println("The hight of 1st monitor is smaller");
        }else if(monitor1.compareHight( monitor2 )==0)
        {
            System.out.println("The height of both monitors are the same");
        }
        else
            System.out.println("The hight of 2nd monitor is bigger");   // 1080<1440 , so this will be executed

    }
}
