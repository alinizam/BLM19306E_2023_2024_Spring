/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.StrategyPackage;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Context {
    ArrayList<Integer> numbers=new ArrayList<>();
    void displayElement(IStrategy filter){
        for (Integer number : numbers) {
            if(filter.filter(number)){
                System.out.println(number);
            }
        }
        
    }
}
