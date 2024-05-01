/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Composite;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class CompanyComposite implements IComponent{
    ArrayList<IComponent> children=new ArrayList<>();
    String name;

    public CompanyComposite(String name) {
        this.name = name;
    }
    
    @Override
    public void getChildren() {
        this.displayNameOperation();
        for (IComponent component : children) {
            component.getChildren();
        }
    }

    @Override
    public void displayNameOperation() {
        System.out.println(name);
    }

    @Override
    public void addChild(IComponent component) {
        children.add(component);
    }
    
}
