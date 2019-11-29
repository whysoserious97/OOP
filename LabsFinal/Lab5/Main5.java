package LabsFinal.Lab5;

public class Main5 {
    public static void main (String[] args) {
        A a = new A("aa", new X("ax"));
        B b = new B("ba", new X ("bx"),"bb");
        C c = new C ("ca",new X ("cx"),"cb","cc");
        D d = new D ("da",new X ("dx"),"db","dc","dd");
        E e = new E ("ea",new X ("ex"),"eb","ec","ed","ee");
        F f = new F ("fa",new X ("fx"),"fb","fc","fd","fe","ff");
        G g = new G ("ga",new X ("gx"),"gb","gc","gd","ge","gf","gg");
        H h = new H ("ha",new X ("hx"),"hb","hc","hd","he","hf","hg","hh");
        I i = new I ("ia",new X ("ix"),"ib","ic","id","ie","if","ig","ih","ii");
        J j = new J ("ja",new X ("jx"),"jb","jc","jd","je","jf","jg","jh","ji","jj");
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
        System.out.println (d);
        System.out.println (e);
        System.out.println (f);
        System.out.println (g);
        System.out.println (h);
        System.out.println (i);
        System.out.println (j);

    }
}
