/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Decorator;

/**
 *
 * @author ali.nizam
 */
public class AddTurboDecorator extends CarDecorator{

    public AddTurboDecorator(ICar car2Decorate) {
        super(car2Decorate);
    }

    @Override
    public void increaseSpeed() {
        car2Decorate.increaseSpeed();
        decorationMethod();
       
    }
    void decorationMethod(){
        System.out.println("Turbo speed.");
    }
    
}
