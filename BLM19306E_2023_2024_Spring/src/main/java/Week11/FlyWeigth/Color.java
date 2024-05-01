/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.FlyWeigth;

/**
 *
 * @author ali.nizam
 */
public class Color implements IColorFlyWeigth{
    String colorName;

    public Color(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public void displayColor() {
        System.out.println(colorName);
    } 
}
