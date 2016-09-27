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
public enum User{
    student, tutor ("Tutor"), administrator ("Administrator");
    
    String name;
    
    User () {
    name = "Student";
    }
    User (String name){
        this.name= name;
}
public void printName (){
    System.out.println(name);
}
}
