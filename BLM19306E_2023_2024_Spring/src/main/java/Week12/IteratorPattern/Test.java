/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.IteratorPattern;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Names n=new Names();
        while(n.hasNext()){
            System.out.println(n.next());   
        }
        System.out.println(n.next());
    }
}
