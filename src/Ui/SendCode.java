/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Database.DatabaseHelper;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN ASUS
 */
public class SendCode extends javax.swing.JFrame {

    int RamDom;

    /**
     * Creates new form SendCode
     */
    public SendCode() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icon/Sharingan.jpg")));
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        btn_xacnhan = new javax.swing.JButton();
        btn_send = new javax.swing.JButton();
        lbl_trolai = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUÊN MẬT KHẨU");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUYÊN MẬT KHẨU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nhập Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã Xác Nhận");

        txtcode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tf_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });

        btn_xacnhan.setBackground(new java.awt.Color(255, 255, 51));
        btn_xacnhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_xacnhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Accept.png"))); // NOI18N
        btn_xacnhan.setText("Xác nhận");
        btn_xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xacnhanActionPerformed(evt);
            }
        });

        btn_send.setBackground(new java.awt.Color(255, 255, 51));
        btn_send.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Mail.png"))); // NOI18N
        btn_send.setText("Gửi");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        lbl_trolai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/trolai.png"))); // NOI18N
        lbl_trolai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_trolaiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_xacnhan)
                            .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_trolai)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_send, btn_xacnhan});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_trolai)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_send))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xacnhan))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_email, txtcode});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_send, btn_xacnhan});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xacnhanActionPerformed
        try {
            if (txtcode.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập mã xác nhận");
                txtcode.setBackground(Color.yellow);
                return;

            }
            if (Integer.valueOf(txtcode.getText()) == RamDom) {
                this.dispose();
                Reset rs = new Reset(tf_email.getText());
                rs.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Sai mã xác nhận");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_xacnhanActionPerformed

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        String email = tf_email.getText().trim();
        boolean check = false;
        try {
            Connection conn = DatabaseHelper.getConnection("EduSys");
            String sql = "select email from nhanvien where trangthai = 0";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (email.equalsIgnoreCase(rs.getString(1))) {
                    check = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        final String username = "tuehvph13476@fpt.edu.vn";
        final String password = "hoangtue1998";
        Random rd = new Random();
        RamDom = rd.nextInt(999999);
        Properties prop = new Properties();
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            if (tf_email.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "chưa nhập Email");
                tf_email.setBackground(Color.yellow);
                return;

            }
            if (check == false) {
                JOptionPane.showMessageDialog(this, "Email không tồn tại trên hệ thống!");
                tf_email.setBackground(Color.yellow);
                return;
            } else {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("tuehvph13476@fpt.edu.vn"));
                message.setRecipients(
                        Message.RecipientType.TO,
                        InternetAddress.parse(tf_email.getText())
                );
                message.setSubject("Reset Mail");
                String Htmlcode = "<h1> Mã xác nhận của bạn: </h1> ";
                message.setContent(Htmlcode + RamDom, "text/html");

                Transport.send(message);
                JOptionPane.showMessageDialog(this, "Mã xác nhận đã được gửi đến Email!");
            }
        } catch (MessagingException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_sendActionPerformed

    private void lbl_trolaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_trolaiMouseClicked
        System.out.println("trở lại");
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_lbl_trolaiMouseClicked

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SendCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SendCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SendCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SendCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SendCode().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_send;
    private javax.swing.JButton btn_xacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_trolai;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField txtcode;
    // End of variables declaration//GEN-END:variables
}