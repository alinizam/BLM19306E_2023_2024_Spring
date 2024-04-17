/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Builder;

 
/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        //Employee.Builder b=new Employee.Builder();
        Employee e=new Employee.Builder()
                            .setFirstName("Ahmet")
                            .setLastName("Ak")
                            .setId(0)
                            .build();
        System.out.println(e.firstName+" "+e.lastName);
        

        Employee e1=new Employee.Builder()
                            .build();
        System.out.println(e1.firstName+" "+e1.lastName);
        Staff s=(Staff)(new Staff.Builder()
                .setFirstName("AHmet")
                .setLastName("Ak").build());
        System.out.println(s.firstName+" "+s.lastName);
    }
}
