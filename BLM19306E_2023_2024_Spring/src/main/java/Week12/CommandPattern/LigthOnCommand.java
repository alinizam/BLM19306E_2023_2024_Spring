/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.CommandPattern;

/**
 *
 * @author ali.nizam
 */
public class LigthOnCommand implements Command{
    Ligth ligth;

    public LigthOnCommand(Ligth ligth) {
        this.ligth = ligth;
    }
    
    @Override
    public void execute() {
        ligth.setOn();
    }
}
