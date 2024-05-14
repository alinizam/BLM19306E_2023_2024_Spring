/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.StatePackage;

/**
 *
 * @author ali.nizam
 */
public class MementoPatternDemo {
   public static void main(String[] args) {
   
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      originator.setState("State #1");
      careTaker.add(originator.saveStateToMemento());
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());
      
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      careTaker.add(originator.saveStateToMemento());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
   }
}

