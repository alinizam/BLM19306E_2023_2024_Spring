/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.AbstractFactoryPattern;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory f=new CarFactory();
        System.out.println(f.createProduct(Type.PC));
        f=new ComputerFactory();
        System.out.println(f.createProduct(Type.PC));
        f=new CarFactory("Blue");
        ICar c=(ICar)f.createProduct(Type.TOGG);
        System.out.println(c+" "+c.getColor());

    }
   
}
