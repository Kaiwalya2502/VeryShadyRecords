
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaiwalya
 */
public class DeleteSales extends javax.swing.JFrame {

    /**
     * Creates new form delete_sales
     */
    public DeleteSales() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 216, 180, -1));

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 254, 70, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete By Sale Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medical Store.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jComboBox1.removeAllItems();
        try {Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/recordLabel","root","Kaiwalya@1910");
        Statement stmt = (Statement) con.createStatement();
        String query = "select * from sales;";
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next())
        {
          String a = rs.getString("sale_id");
          jComboBox1.addItem(a);}
        }
catch (Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());}        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String saleid = (String) jComboBox1.getSelectedItem();
try {Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/recordLabel","root","Kaiwalya@1910");
        Statement stmt = (Statement) con.createStatement();
        String query = "delete from sales where sale_id = '"+saleid+"';";
        stmt.executeUpdate(query);
        JOptionPane.showMessageDialog(this,"Done");}
catch (Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());}
jComboBox1.removeAllItems();
        try {Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/recordLabel","root","Kaiwalya@1910");
        Statement stmt = (Statement) con.createStatement();
        String query = "select * from sales;";
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next())
        {
          String a = rs.getString("sale_id");
          jComboBox1.addItem(a);}
        }
catch (Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
SalesRecords s = new SalesRecords();
s.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
