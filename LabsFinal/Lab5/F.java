package LabsFinal.Lab5;

public class F extends E {
    protected String f;

    protected F (String a, X x,String b,String c,String d, String e,String f) {
        super (a, x,b,c,d,e);
        this.f=f;
    }

    @Override
    public String toString () {
        return "F{" +
                "f='" + f + '\'' +
                "} " + super.toString ();
    }
}
