/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.StatePackage;

/**
 *
 * @author ali.nizam
 */
public class ModifyState implements IState{

    @Override
    public void doModify(DBRecordContext record) {
        System.out.println("Already modified");
    }

    @Override
    public void doCommit(DBRecordContext record) {
        record.setState(new QueryState());
    }
    
}
