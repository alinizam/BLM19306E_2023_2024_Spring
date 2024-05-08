/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Interprater;

/**
 *
 * @author ali.nizam
 */
public class AndNonTerminalExpression implements IExpression{
    IExpression left;
    IExpression right;

    public AndNonTerminalExpression(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }
    
    
    @Override
    public boolean interprate(Context c) {
        return left.interprate(c)&&right.interprate(c);
    }
    
}
