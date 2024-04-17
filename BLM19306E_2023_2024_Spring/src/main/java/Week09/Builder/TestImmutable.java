/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Builder;

/**
 *
 * @author ali.nizam
 */
public class TestImmutable {
    public static void main(String[] args) {
        String s="a";
        for (int i = 0; i < 1000000; i++) {
            s+="a";
        }
        System.out.println("end");    
    }
}
