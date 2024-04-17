/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Adaptor;

/**
 *
 * @author ali.nizam
 */
public class Adaptor implements INewPlay{
    IOldPlay op;

    public Adaptor(IOldPlay op) {
        this.op = op;
    }
   
    @Override
    public void newPlayMethod() {
        op.oldPlayMethod();
    }
    
}
