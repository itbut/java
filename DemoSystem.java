/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

import static std.DemoObject.startCalculator;

/**
 *
 * @author java
 */
public class DemoSystem {

    public static void main(String[] args) {
        System.out.println(" Start...");
//        printMemory();
//        Eater e = new Eater(100_000_000);
//        printMemory();
//        e = null;
//        System.gc();
//        printMemory();
        
        
        int[] a = {1, 2, 34, 54};
//        int[] c = copyInt(a);
//        for (int i : c) {
//            System.out.print(i + " , ");
//        }
//        System.out.println("");
//        Object[] b = {new DemoObject(1, 345), new DemoObject(22, 3454)};
//        Object[] d = copyObject(b);
//        for (Object obj : d) {
//            System.out.println(obj);
//        }

        startCalculator();
        
        System.out.println("End.");
    }

    public static void printMemory() {
        System.out.println("-----------------");
        Runtime r = Runtime.getRuntime();
        System.out.println("FreeMem: " + r.freeMemory());
        System.out.println("Total: "
                + r.totalMemory());
        System.out.println("Max: "
                + r.maxMemory());
        System.out.println("-----------------");

    }

    public static int[] copyInt(int[] a) {
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        return b;
    }

    public static Object[] copyObject(Object[] a) {
        Object[] b = new Object[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        return b;
    }
    
      public static Object[] copyArray(Object[] a) {
        Object[] b = new Object[a.length];
       for (int i=0; 1<a.length; ++i){
           b[i] = new DemoObject (
                   ((DemoObject)a[i]).getID(),
           ((DemoObject)a[i]).getValue());
       
       }
        return b;
    }
}
