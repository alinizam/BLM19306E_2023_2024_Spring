/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Week12.MediatorPattern;

/**
 *
 * @author ali.nizam
 */
interface IUser {
    void sendMessage(IUser u,String message);
    void sendMessage2AllUser(String message);
    void receiveMessage(IUser u,String message);
}
