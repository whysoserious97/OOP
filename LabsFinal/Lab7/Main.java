package LabsFinal.Lab7;
import static LabsFinal.Lab7.GeometricBodyController.*;

public class Main{

    public static void main( String[] args ) {
        GeometryBody[] array={new Cub( 3 ),new Paralelipiped( 4,2,3 ),new Sphere( 2 )};
        System.out.println("The max volume is :"+getObjectWithBiggestVolume(array).getVolume());
        System.out.println("The max surface is :"+getObjectWithBiggestSurface(array).getSurface()+"\n\n");
        /////////////////////////////////////////////////////////////////////////////////////////////
        for (int i =0; i < array.length;i++){
            System.out.println("The surface of the body is:"+array[i].getSurface());
            System.out.println("The volume of the body is:"+array[i].getVolume()+"\n");
        }
    }
}
