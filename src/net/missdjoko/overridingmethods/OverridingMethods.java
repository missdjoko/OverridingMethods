package net.missdjoko.overridingmethods;

/**
 * Created by Miss_ on 15.02.2016.
 */
public class OverridingMethods {
    public static void main(String[] args) {
        B b   = new B(7,8);
        A a   = new A();
        C c   = new C(10,12,10);
        B bc1 = new C(2,3,4);
        A ac2 = new C(5,6,7);
        A ab2 = new B(1,2);



        a.show(); // метод супер класса (класса предка)
        System.out.println();

        b.show(); // вызов доступного метода из класса-предка (А) // тк своего метода с таким именем и параметрами нет!!!
        b.show(" eto stroka iz klassa B "); // вызов своего метода с таким же именем из класса В
        System.out.println();

        c.show();
        System.out.println();

        bc1.show(); // переопределение метода // выполняет свой метод
        bc1.show("mama"); // доступен тк,  тк тип переменной -› class В //перегрузка метода
        System.out.println();

        ac2.show(); // выполняет всой метод
        System.out.println();

        ab2.show(); // недоступен метод со строкой, тк тип переменной -› class А


    }
}
