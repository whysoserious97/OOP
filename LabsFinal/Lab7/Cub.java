package LabsFinal.Lab7;

public class Cub implements GeometryBody{
    double x;
    public Cub(double x){
        this.x=x;
    }
    @Override
    public double getSurface() {
        return 6*x*x;
    }

    @Override
    public double getVolume() {
        return x*x*x;
    }
}
