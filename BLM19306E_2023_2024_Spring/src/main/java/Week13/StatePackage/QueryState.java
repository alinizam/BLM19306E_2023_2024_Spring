/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.StatePackage;

/**
 *
 * @author ali.nizam
 */
public class QueryState implements IState {

    public QueryState() {
    }

    @Override
    public void doModify(DBRecordContext record) {
        record.setState(new ModifyState());
    }

    @Override
    public void doCommit(DBRecordContext record) {
        System.out.println("Already committed");
    }
    
}
