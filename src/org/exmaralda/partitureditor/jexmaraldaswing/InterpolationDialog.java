/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InterpolationDialog.java
 *
 * Created on 29.10.2009, 11:30:17
 */

package org.exmaralda.partitureditor.jexmaraldaswing;

/**
 *
 * @author thomas
 */
public class InterpolationDialog extends javax.swing.JDialog {

    public boolean approved = false;

    /** Creates new form InterpolationDialog */
    public InterpolationDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(okButton);                
    }

    public boolean getLinearInterpolation(){
        return linearRadioButton.isSelected();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        characterRadioButton = new javax.swing.JRadioButton();
        linearRadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interpolation");

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        buttonGroup.add(characterRadioButton);
        characterRadioButton.setSelected(true);
        characterRadioButton.setText("Character Count Interpolation (clever)");
        jPanel1.add(characterRadioButton);

        buttonGroup.add(linearRadioButton);
        linearRadioButton.setText("Linear Interpolation (fast)");
        jPanel1.add(linearRadioButton);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        okButton.setText("OK");
        okButton.setMaximumSize(new java.awt.Dimension(65, 23));
        okButton.setMinimumSize(new java.awt.Dimension(65, 23));
        okButton.setPreferredSize(new java.awt.Dimension(65, 23));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        jPanel2.add(okButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cancelButton);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        approved = true;
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterpolationDialog dialog = new InterpolationDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton characterRadioButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton linearRadioButton;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

}
