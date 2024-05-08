/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.MediatorPattern;

/**
 *
 * @author ali.nizam
 */
public interface IMediator {
    void sendMessage2User(IUser u,String message);
    void sendMessage2AllUser(String message);
    void addUser(IUser u);        
}
