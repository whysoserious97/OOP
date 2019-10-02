package Labs.Lab2.Task2;


public class Queue {
   public int count=0;  // nr of nodes in queue
    public Node head,last;  // remembers the first and last nodes
    public int maxsize=-1; // defines the maxsize of the queue

  public Queue(int maxsize){
    this.maxsize=maxsize;  // sets the limit
      System.out.println("The maxsize was set to "+maxsize);


  }
    public Queue(){
                            // to have the constructor with no parameters
    }

  public void push(Object o){

      if (count<maxsize && maxsize!=-1)    // if the queue is not full and has a defined a valid maxsize
      {
          insert( o );  // because the code is the same a reasonable way is to create a function for a better understanding.

      }else if (maxsize==-1){  // the same but dont have a limit
          insert( o );  // the second use of function
      }
      else {
          System.out.println("Cannot add element.Max size reached!!!!");  // this will happen when queue reached his maxsize;
      }
  }

    private void insert( Object o ) {
        if(count==0) {    // if this is the first node it will be created as the head and last element in the queue
            head=last= new Node( o );
            System.out.println("Element added: " + o);
            count++;
        }else {
            last.next = new Node( o );   // otherwise it will be created a node that will be linked to the previous node, and will become the last node
            System.out.println("Element added: " + o);
            last=last.next;   // the added node becomes the last
            count++;  //+1 node in queue
        }
    }

    public Object pop(){
      if (count>0){  // if queue has at least 1 element
         Object forRemoving=this.head.object;  // stores the object that has to be returned
        head=head.next;  // but before the return statement we need to set the new head of the queue
        count--;  //-1 element
        return forRemoving;  // when we have done the setting of the new head we can now to return the stored element
      }
      else{
          return null;}  // if there is no element we return a null value that says that there are no elements in queue
  }
  public boolean isFull(){
      return count==maxsize && maxsize!=-1;
      //the first statement checks if the current size and the maxsize are the same, the second one checks if there was defined a maxsize.
  }
  public boolean isEmpty(){
        return count==0;
    }  // if the current size is 0 the queue is empty.

}
