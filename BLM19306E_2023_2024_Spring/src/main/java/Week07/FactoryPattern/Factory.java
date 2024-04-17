/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.FactoryPattern;

/**
 *
 * @author ali.nizam
 */
public class Factory {
    IProduct createProduct(String type){
        IProduct p=null;
        if (type.equals("TOGG")){
            p=new Togg();
        }else if (type.equals("HONDA")){
            p=new Honda();
        }else if (type.equals("YELLOW TOGG")){
            p=new Togg("Yellow"); 
        }
        return p;
    };
}
