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
       // super.show();//  ���������� ����� ������ �� � �������� �����������
        // ���� � ������-������ ���� ����������� super-� �� ��� ���� �����������, �� ����� �� �������� ������.
        // �� �� ���������� ���������� �� ������ b.show(String str), �� ���������� ����������� � ����� ������
        // �� ������ ������ ������ ( � ������ ������ ��� ����� �)
        System.out.println("k = " + k );
    }

}
