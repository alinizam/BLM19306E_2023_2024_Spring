/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Interprater;

/**
 *
 * @author ali.nizam
 */
public class FirstDigitCheckTerminalExpression implements IExpression{

    @Override
    public boolean interprate(Context c) {
        return Character.isDigit(c.s.charAt(0));
                
    }
    
}
