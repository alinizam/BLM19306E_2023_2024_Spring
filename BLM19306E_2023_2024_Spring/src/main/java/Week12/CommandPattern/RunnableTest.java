/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.CommandPattern;

/**
 *
 * @author ali.nizam
 */
public class RunnableTest {
    public static void main(String[] args) {
        RunnableRemoteControl rc=new RunnableRemoteControl();
        Ligth l=new Ligth();
        rc.setCommand(l::setOn);
        rc.executeButton();
        rc.setCommand(l::setOff);
        rc.executeButton();
        
        
    }
    
    
}
