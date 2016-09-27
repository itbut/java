package Basic;

public class B extends A { //EXTENDS наследование возможно только одного класса (супертип)...супертип может быть только один 

    private A a; //в классе B будет два аттрибута а- один унаследованный+ свой собственный...тут а-это ссылка, а не самобъект

    public B() {
        super();
        System.out.println("B:B()");
    }

    @Override
    void a() { // переопреден из класса ј, но с новыми параматерами   у этого метода дефолтна€ область видимости 
        //   super.a = null;
        a = null;
        super.a();
        System.out.println("¬:a()"); //возврат метода 
    }

    @Override
    public void b() {
        System.out.println("¬:b()");
    }
}
