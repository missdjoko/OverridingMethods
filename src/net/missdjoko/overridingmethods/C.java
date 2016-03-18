package net.missdjoko.overridingmethods;

/**
 * Created by Miss_ on 15.02.2016.
 */
public class C extends B {
    protected int k;
    C(int a,int b, int c){
       super(a,b);
       k=c;
    }

    void show (){
       // super.show();//  вызывается метод предка но с текущими параметрами
        // если в методе-предке есть конструкция super-› то она тоже выполняется, те вверх по иерархии класса.
        // тк по параметрам отличается от метода b.show(String str), то вызывается конструктор с таким именем
        // из общего класса предка ( в данном случае это класс А)
        System.out.println("k = " + k );
    }

}
