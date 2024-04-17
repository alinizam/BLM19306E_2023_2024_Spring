/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Singleton;

/**
 *
 * @author ali.nizam
 */
public class SingleObjectEager {
    static SingleObjectEager instance;

    public static SingleObjectEager getInstance() {
        return instance;
    }

    private SingleObjectEager() {
    }
    String getName(){
        return "Single";
    }
    //Eager initialization
    static{
        instance=new SingleObjectEager();
    }
    
}
