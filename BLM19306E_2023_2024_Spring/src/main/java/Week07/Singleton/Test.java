/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Singleton;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
       // SingleObject s;
        System.out.println(SingleObjectEager.instance.getName());
        //Lazy test 
        System.out.println(SingleObjectLazy.getInstance());
        System.out.println(SingleObjectLazy.instance);
        System.out.println(SingleEnum.instance);
    }

}
