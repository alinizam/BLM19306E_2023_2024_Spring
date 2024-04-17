/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.AbstractFactoryPattern;


/**
 *
 * @author ali.nizam
 */
public class Honda implements ICar{

   String color;

    public Honda() {
    }

    public Honda(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
       this.color=color;
    }
    
    
}
