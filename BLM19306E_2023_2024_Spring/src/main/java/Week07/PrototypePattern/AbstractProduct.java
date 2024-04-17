/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.PrototypePattern;
 

/**
 *
 * @author ali.nizam
 */
public abstract class AbstractProduct implements Cloneable{
    abstract String getColor(); 
    @Override
    public AbstractProduct clone() throws CloneNotSupportedException {
        return (AbstractProduct)super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
