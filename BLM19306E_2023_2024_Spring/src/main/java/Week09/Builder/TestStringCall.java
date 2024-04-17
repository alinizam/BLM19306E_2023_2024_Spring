/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Builder;

/**
 *
 * @author ali.nizam
 */
public class TestStringCall {
    public static void main(String[] args) {
        String name="Ahmet";
        changeString(name);
        System.out.println(name);
        Employee e=new Employee.Builder()
                            .setFirstName("Ahmet")
                            .setLastName("Ak")
                            .setId(0)
                            .build();
        changeEmployee(e);
        System.out.println(e.firstName);
    }
    static void changeString(String s){
        s+=" Ak"; 
    }
    static void changeEmployee(Employee e){
        e.firstName="Mehmet";
    }
}
