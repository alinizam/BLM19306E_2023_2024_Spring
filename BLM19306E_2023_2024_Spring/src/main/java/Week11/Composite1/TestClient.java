/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Composite1;
 

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        CompanyComposite c=new CompanyComposite("FSMVÜ");
        c.addChild(new DepartmentLeaf("IT"));
        c.addChild(new DepartmentLeaf("HR"));
        CompanyComposite subCompany=new CompanyComposite("Sub Company");
        subCompany.addChild(new DepartmentLeaf("Sub Dept"));
        c.addChild(subCompany);
        c.displayNameOperation();
    }
}
