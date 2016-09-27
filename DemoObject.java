/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

import Basic.K;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author java
 */
public class DemoObject {

    private int id;
    private double value;

    public DemoObject(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println("Start of the program");
//        DemoObject o = new DemoObject(1, 3.4);
//        DemoObject clone = (DemoObject) o.clone();
//        System.out.println("o == clone: " + o.equals(" "));
//        K k = new K();
//        o.printInfo("");

//        System.out.println(o);
//        System.exit(123);
        startCalculator();
        System.out.println("end of the program");
    }

    @Override
    protected Object clone() {

        return new DemoObject(id + 1, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof DemoObject) {
            return this.value == ((DemoObject) obj).value;
        }
        return false;
    }

    public int hashCode() {
        return (int) value;

    }

    @Override
    protected void finalize() {
        System.out.println("DemoObject: finalize()");
    }

    public void printInfo(Object obj) {
        if (obj == null) {
            return;
        }
        Class c = obj.getClass();
        Method[] am = c.getMethods();
        for (Method m : am) {

            System.out.println(
                    m.getReturnType().getName() + "" + m.getName());
        }
    }

    public String toString() {
        return super.toString() + " -> id :" + id + " - value: " + value;
    }

    public int getID() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public static void startCalculator() {
        try {
            Process p = Runtime.getRuntime().exec("calc");
           if(p.waitFor(5, TimeUnit.SECONDS)){
           
               System.out.println("ok!");
           } else {
           p.destroy();
           }
            System.out.println("Exit code :" + p.exitValue());
        } catch (IOException ex) {
            System.out.println("Error: #1");
        } catch (InterruptedException ex) {
            System.out.println("Error: #2");
        }

    }
}
