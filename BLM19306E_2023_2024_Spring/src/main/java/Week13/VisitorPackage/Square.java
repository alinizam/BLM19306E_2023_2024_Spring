/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.VisitorPackage;

/**
 *
 * @author ali.nizam
 */

public class Square implements IShape{
    int edge;

    public Square(int edge) {
        this.edge = edge;
    }
    

    public void accept(IVisitor v) {
        v.visit(this);
    }

    @Override
    public int getEdge() {
        return this.edge;
    }

   
    
}