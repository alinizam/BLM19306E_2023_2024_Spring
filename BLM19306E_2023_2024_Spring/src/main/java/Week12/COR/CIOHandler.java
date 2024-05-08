/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.COR;

/**
 *
 * @author ali.nizam
 */
public class CIOHandler extends Handler{
    
    public CIOHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void process(Request request) {
        if(request.amount>5000 && request.amount<100000){
            System.out.println("The advance is approved by CIO");
        }else{
            System.out.println("The advance is rejected");
        }
            
    }
  
    
}
