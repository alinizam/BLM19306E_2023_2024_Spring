/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Composite;

/**
 *
 * @author ali.nizam
 */
public interface IComponent {
    void getChildren();
    void displayNameOperation();
    void addChild(IComponent component);
}
