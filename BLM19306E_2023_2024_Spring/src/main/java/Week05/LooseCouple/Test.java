/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.LooseCouple;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Subject s=new Subject();
        //Configuration
        ITopic t=new Topic("Hello loose couple");
        //Use
        s.useTopic(t);
        t=new SpecialTopic();
        s.useTopic(t);
    }
}
