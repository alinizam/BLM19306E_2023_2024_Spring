/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.ObserverPackage;

/**
 *
 * @author ali.nizam
 */
public interface ISubject {
    void notifyObserver();
    void addObserver(IObserver observer);
    void setState(String state);
}
