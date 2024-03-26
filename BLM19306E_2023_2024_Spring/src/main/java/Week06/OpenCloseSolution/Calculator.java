/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06.OpenCloseSolution;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Calculator {
    ArrayList<IShape> shapes=new ArrayList<>();
    double calculateTotalArea(){
        double total=0;
        for (IShape shape : shapes) {
            total+=shape.getArea();
        }
        return total;
    }
}
