package Basic;

public class E {
    public static void main(String[] args){
        D d = new D(){
            @Override
            public void a(){
                System.out.println("Anonymous:a()");
            }
        };
        
        d.a();
        d.b();
        
    }
}
