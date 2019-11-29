package LabsFinal.Lab7;

public class GeometricBodyController{
    public static GeometryBody getObjectWithBiggestVolume(GeometryBody[] array){
        GeometryBody forReturn=array[0];
        double maxVolume=array[0].getVolume();
        for (int i=0; i< array.length;i++)
        {
            if (array[i].getVolume()>maxVolume)
            {
                forReturn=array[i];
                maxVolume=array[i].getVolume();
            }
        }
        return forReturn;
    }
    public static GeometryBody getObjectWithBiggestSurface(GeometryBody[] array){
        GeometryBody forReturn=array[0];
        double maxSurface=array[0].getSurface();
        for (int i=0; i< array.length;i++)
        {
            if (array[i].getSurface()>maxSurface)
            {
                forReturn=array[i];
                maxSurface=array[i].getSurface();
            }
        }
        return forReturn;
    }
}
