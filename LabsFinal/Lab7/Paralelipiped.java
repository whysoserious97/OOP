package LabsFinal.Lab7;

public class Paralelipiped implements GeometryBody{
    double x;
    double y;
    double z;
    public Paralelipiped(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
   public double getSurface() {
        return 2*x*y+2*x*z+2*y*z;
    }

    @Override
    public double getVolume() {
        return x*y*z;
    }
}
