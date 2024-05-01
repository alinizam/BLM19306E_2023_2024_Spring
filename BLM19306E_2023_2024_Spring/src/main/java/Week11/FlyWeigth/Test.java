/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.FlyWeigth;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        FlyWeigthFactory f=new FlyWeigthFactory();
        f.getColorObject("Blue");
        f.getColorObject("Blue");
        f.getColorObject("Yellow");
        f.colorStore.forEach((k,v)->v.displayColor());
    }
}
