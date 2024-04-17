/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.AbstractFactoryPattern;

/**
 *
 * @author ali.nizam
 */
public class CarFactory implements AbstractFactory{
    
    String color;

    public CarFactory(String color) {
        this.color = color;
    }

    public CarFactory() {
    }
    
    
    @Override
    public IProduct createProduct(Type t) {
        ICar p=null;
        if (t==Type.HONDA){
            p=new Honda();
        }else if (t==Type.TOGG){
            p=new Togg();
        }else{
            System.out.println("Unsupported type for Car factory");
        }
        if (color!=null){p.setColor(color);}
        return p;
    }
    
}
