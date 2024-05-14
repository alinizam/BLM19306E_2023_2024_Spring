/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.StatePackage;

/**
 *
 * @author ali.nizam
 */
public class DBRecordContext {
    private IState state=new NewState();

    public void setState(IState state) {
        this.state = state;
    }

    public IState getState() {
        return state;
    }
   
    public void doModify() {
        state.doModify(this);
    }

 
    public void doCommit( ) {
        state.doCommit(this);
    }
    
    
    /*doModify(){
        if (state=='NEW' )
        
    
    }*/
}
