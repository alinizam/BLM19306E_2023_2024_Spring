/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06.OpenCloseProblem;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Calculator {
    ArrayList<Shape> shapes=new ArrayList<>();
    double calculateTotalArea(){
        double total=0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle){
                total+=((Rectangle)shape).a*((Rectangle)shape).b;
            }else if (shape instanceof Triangle){
                total+=(((Triangle)shape).a*((Triangle)shape).b)/2;
            }
        }
        return total;
    }
}
