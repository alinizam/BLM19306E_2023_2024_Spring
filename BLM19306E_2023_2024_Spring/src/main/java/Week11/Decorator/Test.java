/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Decorator;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        ICar c=new Togg();
        c.increaseSpeed();
        CarDecorator dc=new AddTurboDecorator(c);
        dc.increaseSpeed();
        System.out.println("----------------------------");
        ICar t=new Truck();
        CarDecorator dc1=new AddTurboDecorator(t);
        dc1.increaseSpeed();
        
        
    }
}
