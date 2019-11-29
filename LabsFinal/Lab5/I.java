package LabsFinal.Lab5;

public class I extends H {
    protected String i;

    protected I (String a, X x, String b, String c, String d, String e, String f, String g, String h, String i) {
        super (a, x, b, c, d, e, f, g, h);
        this.i = i;
    }

    @Override
    public String toString () {
        return "I{" +
                "i='" + i + '\'' +
                "} " + super.toString ();
    }

}
