/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.ObserverPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ali.nizam
 */
public class FrameObserver {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton b=new JButton("Notify");
        f.getContentPane().add(b);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello");
            }
        });
                
    }
}
