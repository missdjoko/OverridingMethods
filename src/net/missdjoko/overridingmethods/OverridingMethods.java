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



        a.show(); // ����� ����� ������ (������ ������)
        System.out.println();

        b.show(); // ����� ���������� ������ �� ������-������ (�) // �� ������ ������ � ����� ������ � ����������� ���!!!
        b.show(" eto stroka iz klassa B "); // ����� ������ ������ � ����� �� ������ �� ������ �
        System.out.println();

        c.show();
        System.out.println();

        bc1.show(); // ��������������� ������ // ��������� ���� �����
        bc1.show("mama"); // �������� ��,  �� ��� ���������� -� class � //���������� ������
        System.out.println();

        ac2.show(); // ��������� ���� �����
        System.out.println();

        ab2.show(); // ���������� ����� �� �������, �� ��� ���������� -� class �


    }
}
