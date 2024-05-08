/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Interprater;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Context c=new Context("1a");
        IExpression checkNumber=new AndNonTerminalExpression(
                                    new FirstDigitCheckTerminalExpression(),
                                    new LastDigitCheckTerminalExpression());
        System.out.println(checkNumber.interprate(c));
        
                
    
    }
}
