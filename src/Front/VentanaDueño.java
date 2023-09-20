/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;
import Back.*;
import BD.*;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class VentanaDueño extends javax.swing.JFrame {
    
    Dueño dñ=null;
    Camisa camisa=null;
    Login lg=null;
    Trabajador trbj=null;
    VentanaLogin v2=null;
    VentanaRegistroPrinci Vp=null;
    VentanaTienda Vt=null;
    VentanaTrabajadores Vtb=null;
    BD BD =null;

    

    /**
     * Creates new form VentanaDueño
     */
    public VentanaDueño() {
        initComponents();
        
    }
    
     public VentanaDueño(VentanaLogin v2,Dueño dñ) {
        
        trbj=new Trabajador();
        camisa=new Camisa();
        lg= new Login();
        
         this.v2=v2;
         this.dñ=dñ;
         BD = new BD ();
         BD.abrir_ConexionDñ();
         BD.cerrar_ConexionDñ();
      
         initComponents();
         pnlOpcAv.setVisible(false);
         nover.setVisible(false);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInventario = new javax.swing.JPanel();
        pnlAzul2 = new javax.swing.JPanel();
        lblInventario = new javax.swing.JLabel();
        lblIngresar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblVer = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        pnlEmpleados = new javax.swing.JPanel();
        pnlAzul = new javax.swing.JPanel();
        lblEmpleados = new javax.swing.JLabel();
        pnlIngresar = new javax.swing.JLabel();
        pnlVer = new javax.swing.JLabel();
        pnlEditar = new javax.swing.JLabel();
        imgT = new javax.swing.JLabel();
        imgT1 = new javax.swing.JLabel();
        pnlPrinci = new javax.swing.JPanel();
        pnlOpcAv = new javax.swing.JPanel();
        pnlTituloOpcAv = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkboxOpcAv1 = new javax.swing.JCheckBox();
        pnlUsuarioOpc = new javax.swing.JLabel();
        txtUsuarioOpc = new javax.swing.JTextField();
        pnlContraseñaOpc = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnActOpc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseñaOpc = new javax.swing.JPasswordField();
        ver = new javax.swing.JLabel();
        nover = new javax.swing.JLabel();
        lblNombreE = new javax.swing.JLabel();
        chkboxOpcAv = new javax.swing.JCheckBox();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuEmpleados = new javax.swing.JMenu();
        DirectEmpleados = new javax.swing.JMenuItem();
        DirectInventario = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAzul2.setBackground(new java.awt.Color(51, 51, 255));
        pnlAzul2.setOpaque(false);
        pnlInventario.add(pnlAzul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 470, 130));

        lblInventario.setFont(new java.awt.Font("Modern No. 20", 3, 24)); // NOI18N
        lblInventario.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario.setText("Inventario");
        pnlInventario.add(lblInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        lblIngresar.setFont(new java.awt.Font("Modern No. 20", 3, 18)); // NOI18N
        lblIngresar.setForeground(new java.awt.Color(255, 255, 255));
        lblIngresar.setText("- Ingresar Inventario");
        pnlInventario.add(lblIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 180, -1));

        lblEditar.setFont(new java.awt.Font("Modern No. 20", 3, 18)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("- Editar Inventario");
        pnlInventario.add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 180, -1));

        lblVer.setFont(new java.awt.Font("Modern No. 20", 3, 18)); // NOI18N
        lblVer.setForeground(new java.awt.Color(255, 255, 255));
        lblVer.setText("- Ver Inventario");
        pnlInventario.add(lblVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 180, -1));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/Inventario.jpg"))); // NOI18N
        img3.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        img3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img3MousePressed(evt);
            }
        });
        pnlInventario.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 470, 130));

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/TiendaO.jpg"))); // NOI18N
        pnlInventario.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnlInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 260));

        pnlEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAzul.setOpaque(false);
        pnlEmpleados.add(pnlAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 470, 130));

        lblEmpleados.setFont(new java.awt.Font("Modern No. 20", 3, 24)); // NOI18N
        lblEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        lblEmpleados.setText("Empleados");
        pnlEmpleados.add(lblEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        pnlIngresar.setFont(new java.awt.Font("Modern No. 20", 3, 18)); // NOI18N
        pnlIngresar.setForeground(new java.awt.Color(0, 0, 0));
        pnlIngresar.setText("- Ingresar Empleados");
        pnlEmpleados.add(pnlIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 180, -1));

        pnlVer.setFont(new java.awt.Font("Modern No. 20", 3, 18)); // NOI18N
        pnlVer.setForeground(new java.awt.Color(0, 0, 0));
        pnlVer.setText("-Ver Empleados");
        pnlEmpleados.add(pnlVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, -1));

        pnlEditar.setFont(new java.awt.Font("Modern No. 20", 3, 18)); // NOI18N
        pnlEditar.setForeground(new java.awt.Color(0, 0, 0));
        pnlEditar.setText("- Editar Empleados");
        pnlEmpleados.add(pnlEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 180, -1));

        imgT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/tienda111.jpg"))); // NOI18N
        imgT.setText("jLabel2");
        imgT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 0));
        imgT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgTMousePressed(evt);
            }
        });
        pnlEmpleados.add(imgT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 470, 130));

        imgT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/TIENDA22.jpg"))); // NOI18N
        pnlEmpleados.add(imgT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnlEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 260));

        pnlPrinci.setBackground(new java.awt.Color(51, 51, 51));
        pnlPrinci.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOpcAv.setBackground(new java.awt.Color(213, 195, 173));
        pnlOpcAv.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                pnlOpcAvPropertyChange(evt);
            }
        });
        pnlOpcAv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTituloOpcAv.setBackground(new java.awt.Color(99, 82, 62));

        jLabel1.setBackground(new java.awt.Color(187, 187, 187));
        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Opciones Avanzadas Dueño");

        chkboxOpcAv1.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        chkboxOpcAv1.setForeground(new java.awt.Color(0, 0, 0));
        chkboxOpcAv1.setText("Opciones Avanzadas");
        chkboxOpcAv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxOpcAv1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTituloOpcAvLayout = new javax.swing.GroupLayout(pnlTituloOpcAv);
        pnlTituloOpcAv.setLayout(pnlTituloOpcAvLayout);
        pnlTituloOpcAvLayout.setHorizontalGroup(
            pnlTituloOpcAvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloOpcAvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkboxOpcAv1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlTituloOpcAvLayout.setVerticalGroup(
            pnlTituloOpcAvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloOpcAvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloOpcAvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkboxOpcAv1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlOpcAv.add(pnlTituloOpcAv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlUsuarioOpc.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        pnlUsuarioOpc.setForeground(new java.awt.Color(0, 0, 0));
        pnlUsuarioOpc.setText("Usuario");
        pnlOpcAv.add(pnlUsuarioOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 82, 61, -1));

        txtUsuarioOpc.setBackground(new java.awt.Color(213, 195, 173));
        txtUsuarioOpc.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        txtUsuarioOpc.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuarioOpc.setBorder(null);
        pnlOpcAv.add(txtUsuarioOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 76, 361, 27));

        pnlContraseñaOpc.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        pnlContraseñaOpc.setForeground(new java.awt.Color(0, 0, 0));
        pnlContraseñaOpc.setText("Contraseña");
        pnlOpcAv.add(pnlContraseñaOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 145, 82, -1));

        jButton1.setBackground(new java.awt.Color(99, 82, 62));
        jButton1.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        jButton1.setText("Cambiar Dueño");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(99, 82, 62)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlOpcAv.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 212, 127, 42));

        btnActOpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/save.png"))); // NOI18N
        btnActOpc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActOpcMousePressed(evt);
            }
        });
        pnlOpcAv.add(btnActOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 226, 37, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        pnlOpcAv.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 113, 325, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        pnlOpcAv.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 177, 320, 10));

        txtContraseñaOpc.setBackground(new java.awt.Color(213, 195, 173));
        txtContraseñaOpc.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        txtContraseñaOpc.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseñaOpc.setText("************");
        txtContraseñaOpc.setBorder(null);
        pnlOpcAv.add(txtContraseñaOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 141, 286, 25));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verMousePressed(evt);
            }
        });
        pnlOpcAv.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 30, 30));

        nover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/nover.png"))); // NOI18N
        nover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                noverMouseReleased(evt);
            }
        });
        pnlOpcAv.add(nover, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 30, 30));

        pnlPrinci.add(pnlOpcAv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 260));

        lblNombreE.setFont(new java.awt.Font("Modern No. 20", 3, 36)); // NOI18N
        lblNombreE.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreE.setText("\"Nombre Empresa\"");
        lblNombreE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNombreE.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblNombreEPropertyChange(evt);
            }
        });
        pnlPrinci.add(lblNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 430, 60));

        chkboxOpcAv.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        chkboxOpcAv.setForeground(new java.awt.Color(0, 0, 0));
        chkboxOpcAv.setText("Opciones Avanzadas");
        chkboxOpcAv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxOpcAvActionPerformed(evt);
            }
        });
        pnlPrinci.add(chkboxOpcAv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/Camisas.jpg"))); // NOI18N
        pnlPrinci.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/Imagen1.jpg"))); // NOI18N
        pnlPrinci.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 250, -1));

        getContentPane().add(pnlPrinci, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 260));

        jMenuBar1.setBackground(new java.awt.Color(99, 82, 62));

        jMenu1.setBackground(new java.awt.Color(99, 82, 62));
        jMenu1.setText("Inventario / Empleados");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });

        MenuEmpleados.setText("Empleados");
        MenuEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuEmpleadosMousePressed(evt);
            }
        });
        MenuEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEmpleadosActionPerformed(evt);
            }
        });

        DirectEmpleados.setText("Ir directo a Ventana");
        DirectEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectEmpleadosActionPerformed(evt);
            }
        });
        MenuEmpleados.add(DirectEmpleados);

        jMenu1.add(MenuEmpleados);

        DirectInventario.setText("Inventario");
        DirectInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DirectInventarioMousePressed(evt);
            }
        });
        DirectInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectInventarioActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Ir directamente a Ventana");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        DirectInventario.add(jMenuItem2);

        jMenu1.add(DirectInventario);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNombreEPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblNombreEPropertyChange
        // TODO add your handling code here:
        BD.abrir_ConexionDñ();
        lblNombreE.setText(BD.NombreE());
        BD.cerrar_ConexionDñ();
        
        
    }//GEN-LAST:event_lblNombreEPropertyChange

    private void MenuEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEmpleadosActionPerformed
        // TODO add your handling code here:
        pnlEmpleados.setVisible(true);
        
       
    }//GEN-LAST:event_MenuEmpleadosActionPerformed

    private void DirectInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectInventarioActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_DirectInventarioActionPerformed

    private void DirectEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectEmpleadosActionPerformed
        // TODO add your handling code here:
         if(Vtb==null)
            Vtb=new VentanaTrabajadores(this,trbj);
        this.setVisible(false);
        Vtb.setVisible(true);
        
    }//GEN-LAST:event_DirectEmpleadosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if(Vt==null)
            Vt=new VentanaTienda(this,camisa);
        this.setVisible(false);
        Vt.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        pnlEmpleados.setVisible(false);
        pnlInventario.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void imgTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTMousePressed
        // TODO add your handling code here:
         if(Vtb==null)
            Vtb=new VentanaTrabajadores(this,trbj);
        this.setVisible(false);
        Vtb.setVisible(true);
        
    }//GEN-LAST:event_imgTMousePressed

    private void imgTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTMouseEntered
        // TODO add your handling code here:
        imgT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        pnlAzul.setBackground(new Color(0.0f, 1.0f, 1.0f, 0.2f));
        pnlAzul.setOpaque(true);
        
           
        
    }//GEN-LAST:event_imgTMouseEntered

    private void imgTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTMouseExited
        // TODO add your handling code here:
        imgT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 0));
        pnlAzul.setOpaque(false);
    }//GEN-LAST:event_imgTMouseExited

    private void MenuEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEmpleadosMousePressed
pnlInventario.setVisible(false);
        pnlEmpleados.setVisible(true);   
        chkboxOpcAv.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_MenuEmpleadosMousePressed

    private void img3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseEntered
        // TODO add your handling code here:
          img3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        pnlAzul2.setBackground(new Color(0.0f, 1.0f, 1.0f, 0.2f));
        pnlAzul2.setOpaque(true);
        
        
        
    }//GEN-LAST:event_img3MouseEntered

    private void img3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseExited
        // TODO add your handling code here:
        img3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 0));
        pnlAzul2.setOpaque(false);
    }//GEN-LAST:event_img3MouseExited

    private void img3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MousePressed
        // TODO add your handling code here:
         if(Vt==null)
            Vt=new VentanaTienda(this,camisa);
        this.setVisible(false);
        Vt.setVisible(true);
    }//GEN-LAST:event_img3MousePressed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        // TODO add your handling code here:
       pnlInventario.setVisible(false);
       pnlEmpleados.setVisible(false);
       chkboxOpcAv.setVisible(true);
        
    }//GEN-LAST:event_jMenu1MousePressed

    private void DirectInventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DirectInventarioMousePressed
        // TODO add your handling code here:
        pnlEmpleados.setVisible(false);
        pnlInventario.setVisible(true);
        chkboxOpcAv.setVisible(false);
    }//GEN-LAST:event_DirectInventarioMousePressed

    private void pnlOpcAvPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pnlOpcAvPropertyChange
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_pnlOpcAvPropertyChange

    private void btnActOpcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActOpcMousePressed
        // TODO add your handling code here:
        
        lg.setUsuario(txtUsuarioOpc.getText());
        lg.setContraseña(txtContraseñaOpc.getText());
       
        dñ.setLg(lg);
        
        BD.abrir_ConexionDñ();
        BD.actualizar_Dueño(dñ);
        BD.cerrar_ConexionDñ();
        JOptionPane.showMessageDialog(this,"Usuario y Contraseña Cambiados correctamente");
         txtUsuarioOpc.setText("");
        txtContraseñaOpc.setText("");
        
    }//GEN-LAST:event_btnActOpcMousePressed

    private void chkboxOpcAvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxOpcAvActionPerformed
        // TODO add your handling code here:
        BD.abrir_ConexionDñ();
        lg=BD.consultar_Login();
        BD.cerrar_ConexionDñ();
        
        txtUsuarioOpc.setText(lg.getUsuario());
        txtContraseñaOpc.setText(lg.getContraseña());
        
        pnlOpcAv.setVisible(true);
        chkboxOpcAv1.setSelected(true);
        
    }//GEN-LAST:event_chkboxOpcAvActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int confirm=JOptionPane.showConfirmDialog(this,"¿Esta Seguro de Cambiar de Dueño? Esto que se Elimine la Base de Datos del Dueño ");
        if(confirm==0){
            
        BD.abrir_ConexionDñ();
        BD.eliminar_Dueño(dñ);
        BD.cerrar_ConexionDñ();
        JOptionPane.showMessageDialog(this, "El Programa se cerrar favor de volver a iniciar");
       System.exit(0);
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkboxOpcAv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxOpcAv1ActionPerformed
        // TODO add your handling code here:
         chkboxOpcAv.setSelected(false);
          pnlOpcAv.setVisible(false);
    }//GEN-LAST:event_chkboxOpcAv1ActionPerformed

    private void noverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noverMouseReleased
        // TODO add your handling code here:
        ver.setVisible(true);
        nover.setVisible(false);
        txtContraseñaOpc.setEchoChar('*');
    }//GEN-LAST:event_noverMouseReleased

    private void verMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMousePressed
        // TODO add your handling code here:
        ver.setVisible(false);
        nover.setVisible(true);
        txtContraseñaOpc.setEchoChar((char)0);

    }//GEN-LAST:event_verMousePressed

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
            java.util.logging.Logger.getLogger(VentanaDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DirectEmpleados;
    private javax.swing.JMenu DirectInventario;
    private javax.swing.JMenu MenuEmpleados;
    private javax.swing.JLabel btnActOpc;
    private javax.swing.JCheckBox chkboxOpcAv;
    private javax.swing.JCheckBox chkboxOpcAv1;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel imgT;
    private javax.swing.JLabel imgT1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblNombreE;
    private javax.swing.JLabel lblVer;
    private javax.swing.JLabel nover;
    private javax.swing.JPanel pnlAzul;
    private javax.swing.JPanel pnlAzul2;
    private javax.swing.JLabel pnlContraseñaOpc;
    private javax.swing.JLabel pnlEditar;
    private javax.swing.JPanel pnlEmpleados;
    private javax.swing.JLabel pnlIngresar;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlOpcAv;
    private javax.swing.JPanel pnlPrinci;
    private javax.swing.JPanel pnlTituloOpcAv;
    private javax.swing.JLabel pnlUsuarioOpc;
    private javax.swing.JLabel pnlVer;
    private javax.swing.JPasswordField txtContraseñaOpc;
    private javax.swing.JTextField txtUsuarioOpc;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
