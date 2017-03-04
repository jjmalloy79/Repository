package helpDesk;

import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshuamalloy
 */
public class java extends javax.swing.JPanel {

    /**
     * Creates new form java
     */
    public java() {
        initComponents();
JEditorPane jep = new JEditorPane();
jep.setEditable(false);   

try {
  jep.setPage("HelpCenter.html");
}catch (IOException e) {
  jep.setContentType("text/html");
  jep.setText("<html>Could not load</html>");
} 

    JScrollPane scrollPane = new JScrollPane(jep);     
    JFrame f = new JFrame("Test HTML");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(scrollPane);
    f.setPreferredSize(new Dimension(800,600));
    f.setVisible(true);
    }


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
