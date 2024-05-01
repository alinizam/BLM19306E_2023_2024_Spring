/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Proxy;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Proxy request = new Request();
        request.operation();
        Proxy securityProxy=new SecurityProxy(request);
        securityProxy.operation();
         
    }
}
