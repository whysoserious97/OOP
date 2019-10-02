package Labs.Lab2.Task1;



public class Main {
    public static void main (String[] args) {
        Box box1 = new Box();
        Box box2= new Box(5);
        Box box3= new Box(1.5,2,3 );
        System.out.println("The area of box is "+box3.getArea()+" cm2");
        System.out.println("The volume of box is "+box3.getVolume()+" cm3");



    }

}
