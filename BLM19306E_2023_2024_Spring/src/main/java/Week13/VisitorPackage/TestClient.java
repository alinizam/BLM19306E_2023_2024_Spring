/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.VisitorPackage;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        ArrayList<IShape> shapes=new ArrayList<>();
        shapes.add(new Square(10));
        shapes.add(new Square(20));
        IVisitor p=new PerimeterVisitor();
        for (IShape shape : shapes) {
            shape.accept(p);
        }
        
        IVisitor a=new AreaVisitor();
        for (IShape shape : shapes) {
            shape.accept(a);
        }
        
    }
}