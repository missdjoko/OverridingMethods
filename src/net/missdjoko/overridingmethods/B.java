package net.missdjoko.overridingmethods;

/**
 * Created by Miss_ on 15.02.2016.
 */
public class B extends A {
    protected int i;
    protected int j;

    B(int a, int b){
        i=a;
        j=b;
    }

    void show (){
        super.show();
        System.out.println("i, j = "+ i+", "+j);
    }

}
