/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.VisitorPackage;

/**
 *
 * @author ali.nizam
 */
 
public interface IShape {
    void accept(IVisitor v);
    int getEdge();
}