/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.SingleResponsibility;

/**
 *
 * @author ali.nizam
 */
// 
public class EmployeeWithEmbeddedClass {
    int id, pass;
    String firstName,lastName;
    //The method having different responsibility is indirectly implemented
    //Anonymous 
    class internalChecker implements Checker{
        public boolean checkID(int id,int pass){
           return (id==EmployeeWithEmbeddedClass.this.id && pass==EmployeeWithEmbeddedClass.this.pass);
       }
    
    }
            
}
