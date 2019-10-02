package Labs.Lab5;

public class A {
    public A (String a,X x) {
        this.a = a;
        this.x= x;
    }

    protected String a;
    protected X x=new X("xxx");

    @Override
    public String toString () {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
