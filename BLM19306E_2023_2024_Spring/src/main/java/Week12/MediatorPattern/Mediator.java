/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.MediatorPattern;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Mediator implements IMediator{
    ArrayList<IUser> users=new ArrayList<>();
    @Override
    public void sendMessage2User(IUser u, String message) {
        u.receiveMessage(u, message);
    }

    @Override
    public void sendMessage2AllUser(String message) {
        for (IUser user : users) {
            user.receiveMessage(user, message);
        }
    }

    @Override
    public void addUser(IUser u) {
        users.add(u);
    }
     
}
