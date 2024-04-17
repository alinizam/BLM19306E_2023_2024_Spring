/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Adaptor;

/**
 *
 * @author ali.nizam
 */
public class TestWithoutAdapter {
    public static void main(String[] args) {
        INewPlay np=new NewPlayer();
        np.newPlayMethod();
        IOldPlay op=new OldPlayer();
        op.oldPlayMethod();
    }
}
