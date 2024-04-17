/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Singleton;

/**
 *
 * @author ali.nizam
 */
public class SingleObjectLazy {
    static SingleObjectLazy instance;
    private SingleObjectLazy() {
    }

    public static SingleObjectLazy getInstance() {
        if (instance==null){
            instance=new SingleObjectLazy();
        }
        return instance;
    }
    
}
