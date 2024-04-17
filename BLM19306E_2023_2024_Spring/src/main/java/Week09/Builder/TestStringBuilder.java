/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Builder;

/**
 *
 * @author ali.nizam
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("a");
        for (int i = 0; i < 1000000; i++) {
            s.append("a");
        }
        System.out.println("end"); 
    }
}
