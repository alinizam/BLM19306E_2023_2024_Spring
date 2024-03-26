/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06.LSPProblem;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class GenericProblem {
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList();
        integers.add(10);
        // numbers.add("10"); catched error by Generic usage
        for (Object integer : integers) {
            System.out.println((Integer)integer);
        }
       // ArrayList<Number> numbers=integers;  //LSP Violation
        
    }
}
