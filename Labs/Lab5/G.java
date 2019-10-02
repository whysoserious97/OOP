package Labs.Lab5;

public class G extends F {
    protected String g;

    public G (String a, X x, String b, String c, String d, String e, String f, String g) {
        super (a, x, b, c, d, e, f);
        this.g = g;
    }

    @Override
    public String toString () {
        return "G{" +
                "g='" + g + '\'' +
                "} " + super.toString ();
    }
}
