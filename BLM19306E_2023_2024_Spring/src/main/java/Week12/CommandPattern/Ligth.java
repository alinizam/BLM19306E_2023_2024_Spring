/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.CommandPattern;

/**
 *
 * @author ali.nizam
 */
public class Ligth {
    String state;

    public void setOn() {
        System.out.println("On");
        this.state = "ON";
    }
    public void setOff() {
        System.out.println("Off");
        this.state = "Off";
    }
    
}
