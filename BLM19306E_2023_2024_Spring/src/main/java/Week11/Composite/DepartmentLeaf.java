/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Composite;

/**
 *
 * @author ali.nizam
 */
public class DepartmentLeaf implements IComponent{
    String name;

    public DepartmentLeaf(String name) {
        this.name = name;
    }
    
    @Override
    public void displayNameOperation() {
        System.out.println(name);
    }

    @Override
    public void getChildren() {
        this.displayNameOperation();
    }

    @Override
    public void addChild(IComponent component) {
        System.out.println("Leaf node");
    }
    
}
