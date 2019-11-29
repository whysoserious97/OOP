package LabsFinal.Lab5;

public class C extends B {
    protected String c;

    protected C (String a, X x,String b,String c) {
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
