/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.AbstractFactoryPattern;

/**
 *
 * @author ali.nizam
 */
public class ComputerFactory implements AbstractFactory{
    @Override
    public IProduct createProduct(Type t) {
        IProduct p=null;
        if (t==Type.LAPTOP){
            p=new Laptop();
        }else if (t==Type.PC){
            p=new PC();
        }else{
            System.out.println("Unsupported type for Computer factory");
        }
        return p;
    }
}
