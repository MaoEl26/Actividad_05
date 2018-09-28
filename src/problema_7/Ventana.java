/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_7;

/**
 *
 * @author Gerardo Villalobos
 */

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Ventana extends JFrame{
    
    public void createAndShowUI() {
        JFrame frame = new JFrame("Principal");
        JButton display = new JButton("Ventana Ayuda (F1)");
        JButton exit = new JButton("Salir");
        display.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                  if(e.getKeyCode() == KeyEvent.VK_F1)
                  {
                     System.out.println("F1 fue presionada...");
                     JFrameDisplay frm = JFrameDisplay.getInstance();
                     frm.createAndShowUI();
                  }
            }
            

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
        });
         
        
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());
        frame.add(display);
        frame.add(exit);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
}

public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ventana().createAndShowUI();
            }
        });
    }
}

// La clase singleton 
class JFrameDisplay extends JFrame {
    private static JFrameDisplay _instance;
    
    private JFrameDisplay() {
        
    }
    
    public static synchronized JFrameDisplay getInstance() {
        if(_instance == null) {
            _instance = new JFrameDisplay();
        }
        
        return _instance;
    }
    
    public void createAndShowUI() {
        setTitle("Ayuda");
        setSize(new Dimension(400,400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
