/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.StudentPack;

/**
 *
 * @author ali.nizam
 */
public class test {
    public static void main(String[] args) {
        CEStudent cs1=new CEStudent();
        cs1.LastName="";
        
        IGrade grade=() -> {System.out.println("CS Student Grade setted.");};
        Student s=new Student();
        s.grade=grade;
        s.grade.setGrade();
        cs1.grade.setGrade();
    }
}
