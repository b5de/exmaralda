/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exmaralda.orthonormal.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import org.exmaralda.exakt.search.swing.RegularExpressionTextField;


/**
 *
 * @author Schmidt
 */
public class SearchInDirectoryDialog extends javax.swing.JDialog {

    public boolean approved = false;
    
    /**
     * Creates new form SearchInDirectoryDialog
     * @param parent
     * @param modal
     */
    public SearchInDirectoryDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        ActionListener enterKeyListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                searchButtonActionPerformed(actionEvent);
            }
        };
        KeyStroke enterStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
        getRootPane().registerKeyboardAction(enterKeyListener, enterStroke, JComponent.WHEN_IN_FOCUSED_WINDOW);
        
    }
    
    public File getDirectory(){
        return new File(directoryTextField.getText());
    }
    
    public String getTranscribedRegex(){
        return wordTextField.getText();
    }
    
    public String getNormalizedRegex(){
        return normalTextField.getText();
    }
    
    public String getLemmaRegex(){
        return lemmaTextField.getText();
    }
    
    public String getPOSRegex(){
        return posTextField.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        wordPanel = new javax.swing.JPanel();
        wordLabel = new javax.swing.JLabel();
        wordTextField = new RegularExpressionTextField();
        normalPanel = new javax.swing.JPanel();
        normalLabel = new javax.swing.JLabel();
        normalTextField = new RegularExpressionTextField();
        lemmaPanel = new javax.swing.JPanel();
        lemmaLabel = new javax.swing.JLabel();
        lemmaTextField = new RegularExpressionTextField();
        posPanel = new javax.swing.JPanel();
        posLabel = new javax.swing.JLabel();
        posTextField = new RegularExpressionTextField();
        directoryPanel = new javax.swing.JPanel();
        directoryLabel = new javax.swing.JLabel();
        directoryTextField = new javax.swing.JTextField();
        directoryBrowseButton = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verzeichnis durchsuchen");

        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.Y_AXIS));

        wordPanel.setLayout(new javax.swing.BoxLayout(wordPanel, javax.swing.BoxLayout.LINE_AXIS));

        wordLabel.setText("Transcribed: ");
        wordPanel.add(wordLabel);

        wordTextField.setMaximumSize(new java.awt.Dimension(300, 25));
        wordTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        wordTextField.setPreferredSize(new java.awt.Dimension(200, 25));
        wordPanel.add(wordTextField);

        mainPanel.add(wordPanel);

        normalPanel.setLayout(new javax.swing.BoxLayout(normalPanel, javax.swing.BoxLayout.LINE_AXIS));

        normalLabel.setText("Normalized: ");
        normalLabel.setMaximumSize(new java.awt.Dimension(63, 14));
        normalLabel.setMinimumSize(new java.awt.Dimension(63, 14));
        normalLabel.setPreferredSize(new java.awt.Dimension(63, 14));
        normalPanel.add(normalLabel);

        normalTextField.setMaximumSize(new java.awt.Dimension(300, 25));
        normalTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        normalTextField.setPreferredSize(new java.awt.Dimension(200, 25));
        normalPanel.add(normalTextField);

        mainPanel.add(normalPanel);

        lemmaPanel.setLayout(new javax.swing.BoxLayout(lemmaPanel, javax.swing.BoxLayout.LINE_AXIS));

        lemmaLabel.setText("Lemma: ");
        lemmaLabel.setMaximumSize(new java.awt.Dimension(63, 14));
        lemmaLabel.setMinimumSize(new java.awt.Dimension(63, 14));
        lemmaLabel.setPreferredSize(new java.awt.Dimension(63, 14));
        lemmaPanel.add(lemmaLabel);

        lemmaTextField.setMaximumSize(new java.awt.Dimension(300, 25));
        lemmaTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        lemmaTextField.setPreferredSize(new java.awt.Dimension(200, 25));
        lemmaPanel.add(lemmaTextField);

        mainPanel.add(lemmaPanel);

        posPanel.setLayout(new javax.swing.BoxLayout(posPanel, javax.swing.BoxLayout.LINE_AXIS));

        posLabel.setText("POS: ");
        posLabel.setMaximumSize(new java.awt.Dimension(63, 14));
        posLabel.setMinimumSize(new java.awt.Dimension(63, 14));
        posLabel.setPreferredSize(new java.awt.Dimension(63, 14));
        posPanel.add(posLabel);

        posTextField.setMaximumSize(new java.awt.Dimension(300, 25));
        posTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        posTextField.setPreferredSize(new java.awt.Dimension(200, 25));
        posPanel.add(posTextField);

        mainPanel.add(posPanel);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        directoryLabel.setText("Directory: ");
        directoryPanel.add(directoryLabel);

        directoryTextField.setMaximumSize(new java.awt.Dimension(600, 25));
        directoryTextField.setMinimumSize(new java.awt.Dimension(300, 25));
        directoryTextField.setPreferredSize(new java.awt.Dimension(400, 25));
        directoryPanel.add(directoryTextField);

        directoryBrowseButton.setText("Browse...");
        directoryBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directoryBrowseButtonActionPerformed(evt);
            }
        });
        directoryPanel.add(directoryBrowseButton);

        getContentPane().add(directoryPanel, java.awt.BorderLayout.PAGE_START);

        searchButton.setText("Search...");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(searchButton);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void directoryBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directoryBrowseButtonActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int approved = jf.showOpenDialog(getParent());
        if (approved==JFileChooser.APPROVE_OPTION){
            directoryTextField.setText(jf.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_directoryBrowseButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        approved = true;
        dispose();
    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchInDirectoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchInDirectoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchInDirectoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchInDirectoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SearchInDirectoryDialog dialog = new SearchInDirectoryDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton directoryBrowseButton;
    private javax.swing.JLabel directoryLabel;
    private javax.swing.JPanel directoryPanel;
    private javax.swing.JTextField directoryTextField;
    private javax.swing.JLabel lemmaLabel;
    private javax.swing.JPanel lemmaPanel;
    private javax.swing.JTextField lemmaTextField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel normalLabel;
    private javax.swing.JPanel normalPanel;
    private javax.swing.JTextField normalTextField;
    private javax.swing.JLabel posLabel;
    private javax.swing.JPanel posPanel;
    private javax.swing.JTextField posTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel wordLabel;
    private javax.swing.JPanel wordPanel;
    private javax.swing.JTextField wordTextField;
    // End of variables declaration//GEN-END:variables

    public void setDirectory(String lastDir) {
        directoryTextField.setText(lastDir);
    }
}
