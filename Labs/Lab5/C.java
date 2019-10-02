package Labs.Lab5;

public class C extends B {
    protected String c;

    public C (String a, X x,String b,String c) {
        super (a, x,b);
        this.c=c;
    }

    @Override
    public String toString () {
        return "C{" +
                "c='" + c + '\'' +
                "} " + super.toString ();
    }
}
