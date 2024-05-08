/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.COR;

/**
 *
 * @author ali.nizam
 */
public class ManagerHandler extends Handler{
    
    public ManagerHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void process(Request request) {
        if (request.amount<5000){
            System.out.println("Manager approved");
        }else{
            System.out.println("The amount is exceeded manager limits.");
            super.process(request); 
        }
    }
    
    
}
