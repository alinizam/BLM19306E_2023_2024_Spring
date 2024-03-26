/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06.OpenCloseSolution;

/**
 *
 * @author ali.nizam
 */
public class Triangle implements IShape{
    double a,h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (a*h)/2;
    }
    
    
}
