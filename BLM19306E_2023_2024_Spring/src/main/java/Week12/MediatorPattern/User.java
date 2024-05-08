/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.MediatorPattern;

/**
 *
 * @author ali.nizam
 */
class User implements IUser{
    String name;
    IMediator mediator;

    public User(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    

    @Override
    public void sendMessage(IUser u, String message) {
        mediator.sendMessage2User(u, message); 
    }

    @Override
    public void sendMessage2AllUser(String message) {
        mediator.sendMessage2AllUser(message); 
    }

    @Override
    public void receiveMessage(IUser u, String message) {
        System.out.println(name+"is received "+message);
    }
    
    
}
