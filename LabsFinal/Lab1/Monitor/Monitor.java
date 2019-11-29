package LabsFinal.Lab1.Monitor;

public class Monitor {
    public int hight;
    public int width;
    public String color;

   public Monitor (int width, int hight, String color){
        this.color = color;
        this.hight = hight;
        this.width = width;
    }
    public int compareHight(Monitor comparable)
    {
        if(this.hight<comparable.hight)
            return -1;
        else if(this.hight==comparable.hight)
            return 0;
        else
            return 1;
    }
}
