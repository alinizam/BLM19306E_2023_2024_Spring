/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Singleton;

/**
 *
 * @author ali.nizam
 */
public enum SingleEnum {
    instance;
   
    @Override
    public String toString() {
        return Integer.toString(instance.hashCode());
    }
}
