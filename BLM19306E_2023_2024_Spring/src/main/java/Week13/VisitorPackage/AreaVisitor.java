/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.VisitorPackage;

/**
 *
 * @author ali.nizam
 */
public class AreaVisitor implements IVisitor {

    public AreaVisitor() {
    }

    @Override
    public void visit(IShape shape) {
        System.out.println(shape.getEdge()*shape.getEdge());    
    }
    
}
