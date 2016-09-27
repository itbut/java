package Basic;

public abstract class A {
    
    protected final A a; // неисполняемый код, задает компилятору необх задать атрибут класса 
         // зеленым отмечены именап атрибутов класса
    
    public A() {
       System.out.println("A:A()");
       a = null;
    }
      
    public A(A a) {
       System.out.println("A:A(A)");
        this.a = a;
    }
    
    public static void main(String[] args){  // начало программы с метода main
        System.out.println("A:main()"); // вывод на экран
        A a = null;
        //a = new A(a); //создается объект- вызов конструктора по умолчанию
       // a.a(); // вызов метода выдаст A:a()
        // a.a = a; //атрибут
        B b = new B();
        b.a();
    }
    
    void a(){ // у этого метода дефолтная область видимости
     System.out.println("A:a()"); //возврат метода 
    }
    public abstract void b();
}