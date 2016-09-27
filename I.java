/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author rerir
 */
public interface I {

    public static final B a = new B();
    B b = new B();

    public abstract void a();

    void b();
// Only since Java SE version 8.0:
    default public void c() {
        System.out.println("I:c() (default method)");
    }
}
