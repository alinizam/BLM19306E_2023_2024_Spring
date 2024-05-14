/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.StatePackage;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        DBRecordContext record=new DBRecordContext();
        System.out.println(record.getState());
        record.doModify();
          
        System.out.println(record.getState());
        record.doModify();
        System.out.println(record.getState());
        
        record.doCommit();
        System.out.println(record.getState());
        record.doModify();
        System.out.println(record.getState());

        
    }
}
