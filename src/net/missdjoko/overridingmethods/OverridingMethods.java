package net.missdjoko.overridingmethods;

/**
 * Created by Miss_ on 15.02.2016.
 */
public class OverridingMethods {
    public static void main(String[] args) {
        C c= new C(10,12,10);
        B c1=new C(2,3,4);
        A c2=new C(5,6,7);

        B b=new B(7,8);
        A a= new A();


        a.show();
        System.out.println();
        b.show(); // вызов метода из класса А
        b.show(" eto stroka iz klassa B "); // вызов метода из класса В
        System.out.println();

       c.show();
      //  c1.show();
       // c2.show();

    }
}
