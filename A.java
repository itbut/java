package Basic;

public abstract class A {
    
    protected final A a; // ������������� ���, ������ ����������� ����� ������ ������� ������ 
         // ������� �������� ������ ��������� ������
    
    public A() {
       System.out.println("A:A()");
       a = null;
    }
      
    public A(A a) {
       System.out.println("A:A(A)");
        this.a = a;
    }
    
    public static void main(String[] args){  // ������ ��������� � ������ main
        System.out.println("A:main()"); // ����� �� �����
        A a = null;
        //a = new A(a); //��������� ������- ����� ������������ �� ���������
       // a.a(); // ����� ������ ������ A:a()
        // a.a = a; //�������
        B b = new B();
        b.a();
    }
    
    void a(){ // � ����� ������ ��������� ������� ���������
     System.out.println("A:a()"); //������� ������ 
    }
    public abstract void b();
}