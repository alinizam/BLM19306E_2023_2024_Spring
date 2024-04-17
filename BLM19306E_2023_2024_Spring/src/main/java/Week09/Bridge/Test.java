/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Bridge;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Vehicle v=new Car(new PaintBlue());
        v.paintedWithColor();
    }
}
