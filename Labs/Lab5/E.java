package Labs.Lab5;

public class E extends D {
    public String e;

    public E (String a, X x,String b,String c,String d, String e) {
        super (a, x,b,c,d);
        this.e=e;
    }

    @Override
    public String toString () {
        return "E{" +
                "e='" + e + '\'' +
                "} " + super.toString ();
    }
}
