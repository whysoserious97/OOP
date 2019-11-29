package LabsFinal.Lab2.Task2;

public class Node{

   public Object object;   // the stored value that can be anything: numbers,bool values, stored in Wrapper class, and objects .
   public Node next;  // to implement the queue we need to have a link to the next node.

    Node(Object object)
    {
        this.object=object;   // the inserted object in constructor will become the Nodes object.
        this.next=null;  // if this is the last added node, this means that there is not defined yet the next node. PS by default it would be null.
    }
}
