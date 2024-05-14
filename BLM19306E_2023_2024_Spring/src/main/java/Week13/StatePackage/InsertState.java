/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.StatePackage;

/**
 *
 * @author ali.nizam
 */
public class InsertState implements IState {

    public InsertState() {
    }

    @Override
    public void doModify(DBRecordContext record) {
        System.out.println("");
    }

    @Override
    public void doCommit(DBRecordContext record) {
        record.setState(new QueryState());
    }
    
}
