/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

/**
 *
 * @author java
 */
public class Eater {

    private long a[];

    public Eater(int size) {
        size = (size < 1) ? 1 : size;
        a = new long[size];
    }
    @Override
    protected void finalize (){
 
    System.out.println("Eater is done");
           
}
}
