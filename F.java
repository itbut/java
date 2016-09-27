package Basic;

public class F implements I {

    public static void main(String[] args) {
        F f = new F();
        f.a();
        f.b();
        f.c();
        f.d(1);
        f.e(0);

    }

    @Override
    public void a() {
        System.out.println("F: a()");
    }

    @Override
    public void b() {
        System.out.println("F: b()");
    }

    @Override
    public void c() {
        User u = User.administrator;
        u.printName();
        u = User.tutor;
        u.printName();
        u = User.student;
        u.printName();
    }

    @Demo(name = "Example", value = "gfhsdg", properties = {"First", "Second"})
    public void c(User u) {
        u.printName();
    }
    
    public void d (int x){
         if (x==0){
        System.out.println("Zero");
        } else if (x==1){
            System.out.println("One");
        } else if (x==2){
            System.out.println("Two");
        } else {
            System.out.println("Unknown value");}        
        }
    
     public void e (int x){
         switch (x){
             case 0:
                 System.out.println("Zero");
             case 1:
                 System.out.println("One");
             case 2:
                 System.out.println("Two");
             default:
                 System.out.println("Unknown value");
         }
     }  
}
