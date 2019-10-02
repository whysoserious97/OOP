package Labs.Lab5;

public class B extends A {
    protected String b;

    public B (String a, X x,String b) {
        super (a, x);
        this.b= b;
    }

    @Override
    public String toString () {
        return "B{" +
                "b='" + b + '\'' +
                "} " + super.toString ();
    }
}
