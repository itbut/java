package Basic;

public class B extends A { //EXTENDS ������������ �������� ������ ������ ������ (��������)...�������� ����� ���� ������ ���� 

    private A a; //� ������ B ����� ��� ��������� �- ���� ��������������+ ���� �����������...��� �-��� ������, � �� ���������

    public B() {
        super();
        System.out.println("B:B()");
    }

    @Override
    void a() { // ����������� �� ������ �, �� � ������ ������������   � ����� ������ ��������� ������� ��������� 
        //   super.a = null;
        a = null;
        super.a();
        System.out.println("�:a()"); //������� ������ 
    }

    @Override
    public void b() {
        System.out.println("�:b()");
    }
}
