/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.MediatorPattern;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        IMediator m=new Mediator();
        IUser u1=new User("A", m);
        IUser u2=new User("B", m);
        m.addUser(u1);
        m.addUser(u2);
        u1.sendMessage(u2, "Hello");
        System.out.println("------------");
        u1.sendMessage2AllUser("Hello everyone");
    }
}
