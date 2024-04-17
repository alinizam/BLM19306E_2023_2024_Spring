/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Bridge;

/**
 *
 * @author ali.nizam
 */
public class TestAnonym {
    public static void main(String[] args) {
        //local
        class redLocalClass implements IPaintColor{
            @Override
            public void paintedWithColor() {
                System.out.println("Painted with red");
            }
        }
        IPaintColor redLocalParam=new redLocalClass(); 
        
        //anonim class
        IPaintColor red=new IPaintColor() {
            @Override
            public void paintedWithColor() {
                System.out.println("Painted with red");
            }
        };
        
        IPaintColor redLambda=() -> {System.out.println("Painted with red");};
        Vehicle v=new Car(redLambda);
        v.paintedWithColor();
        
        Vehicle v1=new Car(() -> {System.out.println("Painted with red");});
        v1.paintedWithColor(); 
        
    }
}
