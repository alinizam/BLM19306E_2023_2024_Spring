/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Facade;

/**
 *
 * @author ali.nizam
 */
public class FacadeClass {
    void callSubSystems(){
        SubSystemClassA sA=new SubSystemClassA();
        SubSystemClassB sB=new SubSystemClassB();
        sA.callA();
        sB.callB();
    }
}