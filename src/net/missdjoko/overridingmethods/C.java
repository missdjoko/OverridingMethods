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
        super.show();//  вызываетс€ метод предка но с текущими параметрами
        // если в методе-предке есть конструкци€ super-Ы то она тоже выполн€етс€, те вверх по иерархии класса
        System.out.println("k = " + k );
    }

}
