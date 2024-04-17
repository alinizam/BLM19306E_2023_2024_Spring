/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Adaptor;

/**
 *
 * @author ali.nizam
 */
public class TestWithAdaptor {
    public static void main(String[] args) {
        INewPlay player=new Adaptor(new OldPlayer());
        player.newPlayMethod();
        player=new NewPlayer();
        player.newPlayMethod();
        //((Adaptor)player).newPlayMethod();
    }
}
