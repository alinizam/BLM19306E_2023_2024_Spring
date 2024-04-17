/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.PrototypePattern;

/**
 *
 * @author ali.nizam
 */
public class Togg extends AbstractProduct {
    String color;

    public Togg() {
    }

    public Togg(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    } 
    
}
