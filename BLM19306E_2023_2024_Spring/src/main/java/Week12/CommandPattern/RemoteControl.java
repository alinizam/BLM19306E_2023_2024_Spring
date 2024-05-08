/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.CommandPattern;

/**
 *
 * @author ali.nizam
 */
public class RemoteControl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    void executeCommand(){
         command.execute();
    }
    
}
