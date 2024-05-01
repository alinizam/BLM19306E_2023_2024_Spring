/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Proxy;

/**
 *
 * @author ali.nizam
 */
public class SecurityProxy implements Proxy{
    Proxy request;

    public SecurityProxy(Proxy p) {
        this.request = p;
    }

    @Override
    public void operation() {
        checkSecurity();
        request.operation();
        
    }
    void checkSecurity(){
        System.out.println("Security check");
    }
    
}
