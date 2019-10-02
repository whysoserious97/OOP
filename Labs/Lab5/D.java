package Labs.Lab5;

public class D extends C {
    protected String d;
    X x=new X("another x");

    public D (String a, X x,String b,String c,String d) {
        super (a, x,b,c);
        this.d=d;
    }

    @Override
    public String toString () {
        return "D{" +
                "d='" + d + '\'' +
                "} " + super.toString ();
    }
}
