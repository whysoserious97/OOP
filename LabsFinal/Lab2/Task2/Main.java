package LabsFinal.Lab2.Task2;


public class Main{
    public static void main( String[] args ) {
        Queue queue1 = new Queue (2);
        System.out.println("Before any insertion:");
        System.out.println("The queue is empty: "+queue1.isEmpty()); //it should be empty
        System.out.println("The queue is full: "+queue1.isFull()+ '\n');     // and not full
        queue1.push( 1 );
        queue1.push( 2 );
        queue1.push( 3 );
        System.out.println("After insertions:");
        System.out.println("The queue is empty: "+queue1.isEmpty());
        System.out.println("The queue is full: "+queue1.isFull()+ '\n');   //it should be full
        System.out.println("The removed element:"+queue1.pop());
        System.out.println("After removing an element:");
        System.out.println("The queue is empty: "+queue1.isEmpty());
        System.out.println("The queue is full: "+queue1.isFull()+ '\n');   //now both should be false

        Queue queue2 = new Queue ();
        System.out.println("The initial state of 2nd queue:");
        System.out.println("The queue is empty: "+queue2.isEmpty());  // is empty
        System.out.println("The queue is full: "+queue2.isFull()+ '\n');   //never full
        queue2.push( 4 );
        queue2.push( 5 );
        queue2.push( 6 );
        System.out.println("The removed element: "+queue2.pop());
        System.out.println("After adding 3 elements and removing one from queue:");
        System.out.println("The queue is empty: "+queue2.isEmpty());  //not empty
        System.out.println("The queue is full: "+queue2.isFull());   // never full


    }
}
