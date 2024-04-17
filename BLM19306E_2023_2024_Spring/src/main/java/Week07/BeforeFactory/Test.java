/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.BeforeFactory;
 

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        //Input
        String type="HONDA";

        Product p=null;
        if (type.equals("TOGG")){
            p=new Togg();
        }else if (type.equals("HONDA")){
            p=new Honda();
        }
        //Output
        System.out.println(p.getClass());
    }
}
