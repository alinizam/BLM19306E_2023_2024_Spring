/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.StudentPack;

/**
 *
 * @author ali.nizam
 */
class Student {
    IGrade grade;
    String firstName;

    String LastName;

    /**
     * 
     */
    int employeeId;

    public Student() {
    }

    public Student(String firstName, String LastName, int employeeId) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.employeeId = employeeId;
    }
    
}
