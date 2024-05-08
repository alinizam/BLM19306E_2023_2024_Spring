/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.CommandPattern;

/**
 *
 * @author ali.nizam
 */
public class RunnableRemoteControl {
    Runnable r;

    void setCommand(Runnable r) {
        this.r = r;
    }
    void executeButton(){
        r.run();
    } 
}
