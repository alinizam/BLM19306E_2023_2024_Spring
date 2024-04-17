/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Bridge;
 

/**
 *
 * @author ali.nizam
 */
public abstract class Vehicle implements IPaintColor{
    String color="";
    IPaintColor iColor;

    public Vehicle(IPaintColor iColor) {
        this.iColor = iColor;
    }
    
    @Override
    public void paintedWithColor() {
       iColor.paintedWithColor();
    }

}
