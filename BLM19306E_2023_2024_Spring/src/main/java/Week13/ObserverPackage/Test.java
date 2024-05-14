/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.ObserverPackage;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        ISubject subject=new Subject();
        subject.addObserver(new IObserver() {
            @Override
            public void update() {
                System.out.println("State Updated for observer 1");
            }
        });
        subject.addObserver(() -> System.out.println("State Updated for observer 2"));
        subject.setState("State 1");
    }
}
