/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;
import Back.*;
import javax.swing.JOptionPane;
import BD.BD;
import java.awt.Color;
/**
 *
 * @author alanm
 */
public class VentanaLogin extends javax.swing.JFrame {
VentanaRegistroPrinci v1=null;
Login lg=null;
Dueño dñ=null;
Login lg1 = new Login();
VentanaDueño Vd=null;
BD BD=null;




    /**
     * Creates new form Ventana2
     */
 public VentanaLogin() {
        initComponents();
        
          
 }

    public VentanaLogin(VentanaRegistroPrinci v1,Login lg,Dueño dñ) {
        this.v1=v1;
        this.lg=lg;
        this.dñ=dñ;
        BD= new BD();
   
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

        pnlLogin = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        lblpassword = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        ver = new javax.swing.JLabel();
        nover = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" ");
        setBackground(new java.awt.Color(51, 0, 255));
        setLocation(new java.awt.Point(500, 200));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 260));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 225));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLogin.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlLogin.setPreferredSize(new java.awt.Dimension(400, 225));
        pnlLogin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                pnlLoginPropertyChange(evt);
            }
        });
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin.setBackground(new java.awt.Color(173, 159, 141));
        btnlogin.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(0, 0, 0));
        btnlogin.setText("Iniciar Sesion");
        btnlogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(150, 138, 123), 2, true));
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.setMaximumSize(new java.awt.Dimension(104, 27));
        btnlogin.setMinimumSize(new java.awt.Dimension(104, 27));
        btnlogin.setPreferredSize(new java.awt.Dimension(104, 27));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 125, -1));

        lblpassword.setFont(new java.awt.Font("MS UI Gothic", 3, 24)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Contraseña");
        pnlLogin.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, -1));

        lblUsuario1.setFont(new java.awt.Font("MS UI Gothic", 3, 24)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario1.setText("Usuario");
        pnlLogin.add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, -1));

        txtusuario.setBackground(new java.awt.Color(213, 195, 173));
        txtusuario.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(153, 153, 153));
        txtusuario.setText("Ingrese nombre de Usuario");
        txtusuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 175, 155), 2, true));
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        pnlLogin.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 209, 30));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verMousePressed(evt);
            }
        });
        pnlLogin.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 30, 30));

        nover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/nover.png"))); // NOI18N
        nover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                noverMouseReleased(evt);
            }
        });
        pnlLogin.add(nover, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 30, 30));

        password.setBackground(new java.awt.Color(213, 195, 173));
        password.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("************");
        password.setToolTipText("");
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 175, 155), 2, true));
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        pnlLogin.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, 30));

        Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/local tienda.jpg"))); // NOI18N
        pnlLogin.add(Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:

        lg1.setContraseña(password.getText());
        lg1.setUsuario(txtusuario.getText());

        BD.abrir_ConexionDñ();
        if(BD.Login(lg1.getContraseña(), lg1.getUsuario()) ==0){
            JOptionPane.showMessageDialog(null,"La contraseña o el Usuario son incorrectos");
            BD.cerrar_ConexionDñ();
        }
        else{
            BD.cerrar_ConexionDñ();
            if(Vd==null)
            Vd=new VentanaDueño(this,dñ);

            this.setVisible(false);
            Vd.setVisible(true);

        }

    }//GEN-LAST:event_btnloginActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtusuarioMouseClicked

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        // TODO add your handling code here:
        if(txtusuario.getText().equals("Ingrese nombre de Usuario")){
        txtusuario.setText("");
        txtusuario.setForeground(Color.black);}
    }//GEN-LAST:event_txtusuarioMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
        // TODO add your handling code here:
        if(password.getText().equals("************")){
        password.setText("");
        password.setForeground(Color.black);
        }
       
    }//GEN-LAST:event_passwordMousePressed

    private void verMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMousePressed
        // TODO add your handling code here:
        ver.setVisible(false);
        nover.setVisible(true);
        password.setEchoChar((char)0);
        
        
    }//GEN-LAST:event_verMousePressed

    private void noverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noverMouseReleased
        // TODO add your handling code here:
        ver.setVisible(true);
        nover.setVisible(false);
        password.setEchoChar('*');
    }//GEN-LAST:event_noverMouseReleased

    private void pnlLoginPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pnlLoginPropertyChange
        // TODO add your handling code here:
        nover.setVisible(false);
        
    }//GEN-LAST:event_pnlLoginPropertyChange

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel nover;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}