package Basic;

public class C {

    private B b;

    private static class D {

        private void a() {
            System.out.println("C.D.a()");
            C c = new C();
            c.b();
        }
    }

    public static void main(String[] args) {
            D d = new D();
            d.a();
    }

    private void b() {
        System.out.println("C.b()");
    }
}
