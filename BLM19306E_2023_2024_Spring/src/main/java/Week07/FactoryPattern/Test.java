/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.FactoryPattern;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
 
        Factory f=new Factory();
        IProduct p=f.createProduct("YELLOW TOGG");
        
        
        System.out.println(p.getColor());
    }
}
