/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.COR;

/**
 *
 * @author ali.nizam
 */
public class ClientTest {
    public static void main(String[] args) {
        
        Handler chain=new ManagerHandler(new ManagerHandler(new CIOHandler(null)));
        chain.process(new Request(1000000));
        
    }
}
