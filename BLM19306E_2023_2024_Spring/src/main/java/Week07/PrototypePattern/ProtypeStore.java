/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.PrototypePattern;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class ProtypeStore {
    static Map<String, Object> objects=new HashMap<>();
    static{
        objects.put("Honda", new Honda());
        objects.put("Togg", new Togg()); 
    }
    
    AbstractProduct cloneObject(String type){
        AbstractProduct p=null;
        Object o=objects.get(type);
        try {
            p=((AbstractProduct)o).clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ProtypeStore.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
    
    
    
    
}
