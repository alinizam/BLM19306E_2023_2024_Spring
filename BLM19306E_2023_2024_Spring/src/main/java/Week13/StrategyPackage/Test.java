/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.StrategyPackage;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Context c=new Context();
        c.numbers.add(10);
        c.numbers.add(5);
        c.numbers.add(8);
        c.displayElement(new IStrategy() {
            @Override
            public boolean filter(Integer element) {
                return (element%2==0);
            }
        });
        System.out.println("-----------");
        c.displayElement((i)->i>5);
        System.out.println("-----------");
        c.displayElement((i)->i%5==0);
    }
}
