/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.PrototypePattern;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        ProtypeStore p=new ProtypeStore();
        AbstractProduct t=p.cloneObject("Honda");
        System.out.println(t); 
        AbstractProduct t1=p.cloneObject("Togg");
        System.out.println(t1);         
    }
}
