/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Decorator;

/**
 *
 * @author ali.nizam
 */
public abstract class CarDecorator implements ICar{
    ICar car2Decorate;

    public CarDecorator(ICar car2Decorate) {
        this.car2Decorate = car2Decorate;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Speed İncreased");
    }
    
    
    

    
    
}
