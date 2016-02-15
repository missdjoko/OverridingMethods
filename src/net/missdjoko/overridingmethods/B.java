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

    void show (String str){ // перегрузка метода, те то же имя, но входные параметры другие
        System.out.println(str);
        System.out.println("i, j = "+ i+", "+j);
    }

}
