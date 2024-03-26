/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06.OpenCloseProblem;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.shapes.add(new Rectangle(3,5));
        c.shapes.add(new Rectangle(4,5));
        System.out.println(c.calculateTotalArea());
    }
}
