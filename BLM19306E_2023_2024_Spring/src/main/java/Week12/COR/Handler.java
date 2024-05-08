/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.COR;

/**
 *
 * @author ali.nizam
 */
public abstract class Handler {
    Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    void process(Request request){
        if (nextHandler!=null){
            nextHandler.process(request);
        }
    }
    
}
