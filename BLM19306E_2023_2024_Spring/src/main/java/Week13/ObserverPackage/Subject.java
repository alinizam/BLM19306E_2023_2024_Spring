/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.ObserverPackage;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Subject implements ISubject{
    ArrayList<IObserver> observers=new ArrayList<>();
    String state;

    @Override
    public void setState(String state) {
        this.state = state;
        notifyObserver();
    }

    public String getState() {
        return state;
    }
    
    
    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
                
    }
    
}
