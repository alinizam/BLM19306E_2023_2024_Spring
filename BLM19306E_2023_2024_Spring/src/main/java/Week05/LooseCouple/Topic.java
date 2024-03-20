/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.LooseCouple;

/**
 *
 * @author ali.nizam
 */
public class Topic implements ITopic{
    String written;

    public Topic(String written) {
        this.written = written;
    }
    
    @Override
    public void writeSubject() {
        System.out.println(written);
    }
    
}
