/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.CommandPattern;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        RemoteControl rc=new RemoteControl();
        Ligth l=new Ligth();
        rc.setCommand(new LigthOnCommand(l));
        rc.executeCommand();
        
        rc.setCommand(new LigthOffCommand(l));
        rc.executeCommand();
        
        
    }
}
