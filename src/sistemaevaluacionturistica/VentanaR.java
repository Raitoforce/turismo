/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaevaluacionturistica;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Usuario
 */
public class VentanaR extends javax.swing.JFrame {

    /**
     * Creates new form VentanaR
     */
    public FuncionesEvaluacion fe = null;
    public static boolean vg = false;

    public void asignarValores() {
        lbl1_1.setText(String.valueOf(fe.val1_1));
        lbl1_2.setText(String.valueOf(fe.val1_2));
        lbl1_3.setText(String.valueOf(fe.val1_3));
        lbl1_4.setText(String.valueOf(fe.val1_4));
        lbl1_5.setText(String.valueOf(fe.val1_5));

        lbl2_1.setText(String.valueOf(fe.val2_1));
        lbl2_2.setText(String.valueOf(fe.val2_2));
        lbl2_3.setText(String.valueOf(fe.val2_3));
        lbl2_4.setText(String.valueOf(fe.val2_4));

        lbl2_1.setText(String.valueOf(fe.val2_1));
        lbl2_2.setText(String.valueOf(fe.val2_2));
        lbl2_3.setText(String.valueOf(fe.val2_3));
        lbl2_4.setText(String.valueOf(fe.val2_4));

        lbl3_1.setText(String.valueOf(fe.val3_1));
        lbl3_2.setText(String.valueOf(fe.val3_2));
        lbl3_3.setText(String.valueOf(fe.val3_3));
        lbl3_4.setText(String.valueOf(fe.val3_4));

        lbl4_1.setText(String.valueOf(fe.val4_1));
        lbl4_2.setText(String.valueOf(fe.val4_2));
        lbl4_3.setText(String.valueOf(fe.val4_3));
        lbl4_4.setText(String.valueOf(fe.val4_4));

        t1.setText(String.valueOf(fe.val1_1 + fe.val1_2 + fe.val1_3 + fe.val1_4 + fe.val1_5));
        t2.setText(String.valueOf(fe.val2_1 + fe.val2_2 + fe.val2_3 + fe.val2_4));
        t3.setText(String.valueOf(fe.val3_1 + fe.val3_2 + fe.val3_3 + fe.val3_4));
        t4.setText(String.valueOf(fe.val4_1 + fe.val4_2 + fe.val4_3 + fe.val4_4));

        p1.setText(String.valueOf(fe.P1()));
        p2.setText(String.valueOf(fe.P2()));
        p3.setText(String.valueOf(fe.P3()));
        p4.setText(String.valueOf(fe.P4()));

        lbl_resultadofinal.setText(String.valueOf(fe.Ptotal()));
    }

    public VentanaR(FuncionesEvaluacion fe) {
        initComponents();
        this.fe = fe;
        asignarValores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        p1 = new javax.swing.JLabel();
        lbl1_1 = new javax.swing.JLabel();
        lbl1_2 = new javax.swing.JLabel();
        lbl1_3 = new javax.swing.JLabel();
        lbl1_4 = new javax.swing.JLabel();
        lbl1_5 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        p2 = new javax.swing.JLabel();
        lbl2_1 = new javax.swing.JLabel();
        lbl2_2 = new javax.swing.JLabel();
        lbl2_3 = new javax.swing.JLabel();
        lbl2_4 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        p3 = new javax.swing.JLabel();
        lbl3_1 = new javax.swing.JLabel();
        lbl3_2 = new javax.swing.JLabel();
        lbl3_3 = new javax.swing.JLabel();
        lbl3_4 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        p4 = new javax.swing.JLabel();
        lbl4_1 = new javax.swing.JLabel();
        lbl4_2 = new javax.swing.JLabel();
        lbl4_3 = new javax.swing.JLabel();
        lbl4_4 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        lbl_resultadofinal = new javax.swing.JLabel();
        Botones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(5, 1, 0, 1));

        jPanel2.setLayout(new java.awt.GridLayout(7, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("1. Patrimonio Natural y Cultural de la Región");
        jPanel2.add(jLabel1);

        jLabel2.setText("1.1 Conservación Ambiental");
        jPanel2.add(jLabel2);

        jLabel3.setText("1.2 Singularidad del Destino");
        jPanel2.add(jLabel3);

        jLabel4.setText("1.3. Diversidad del Entorno");
        jPanel2.add(jLabel4);

        jLabel5.setText("1.4 Atractivos Naturales");
        jPanel2.add(jLabel5);

        jLabel6.setText("1.5 Atractivos Culturales");
        jPanel2.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("Total");
        jPanel2.add(jLabel7);

        jPanel3.setLayout(new java.awt.GridLayout(7, 0, 0, 1));

        p1.setBackground(new java.awt.Color(204, 0, 0));
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setOpaque(true);
        jPanel3.add(p1);

        lbl1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbl1_1);

        lbl1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbl1_2);

        lbl1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbl1_3);

        lbl1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbl1_4);

        lbl1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbl1_5);

        t1.setBackground(new java.awt.Color(255, 153, 51));
        t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t1.setOpaque(true);
        jPanel3.add(t1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        jPanel5.setLayout(new java.awt.GridLayout(7, 0));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("2. Potencial de vinculación con los mercados regionales y nacionales");
        jPanel5.add(jLabel15);

        jLabel16.setText("2.1 Accesibilidad");
        jPanel5.add(jLabel16);

        jLabel17.setText("2.2 Proximidad");
        jPanel5.add(jLabel17);

        jLabel18.setText("2.3 Inserción a la oferta turística");
        jPanel5.add(jLabel18);

        jLabel19.setText("2.4 Atractividad");
        jPanel5.add(jLabel19);

        jLabel21.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel21.setText("Total");
        jPanel5.add(jLabel21);

        jPanel6.setLayout(new java.awt.GridLayout(7, 0, 0, 1));

        p2.setBackground(new java.awt.Color(204, 0, 0));
        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setOpaque(true);
        jPanel6.add(p2);

        lbl2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(lbl2_1);

        lbl2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(lbl2_2);

        lbl2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(lbl2_3);

        lbl2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(lbl2_4);

        t2.setBackground(new java.awt.Color(255, 153, 51));
        t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t2.setOpaque(true);
        jPanel6.add(t2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);

        jPanel8.setLayout(new java.awt.GridLayout(7, 0));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("3. Diversidad de oportunidades para el desarrollo del turismo");
        jPanel8.add(jLabel29);

        jLabel30.setText("3.1 Estacionalidad");
        jPanel8.add(jLabel30);

        jLabel31.setText("3.2 Tipo de Turista");
        jPanel8.add(jLabel31);

        jLabel32.setText("3.3 Número de Actividades");
        jPanel8.add(jLabel32);

        jLabel33.setText("3.4 Servicios Básicos");
        jPanel8.add(jLabel33);

        jLabel35.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel35.setText("Total");
        jPanel8.add(jLabel35);

        jPanel9.setLayout(new java.awt.GridLayout(7, 0, 0, 1));

        p3.setBackground(new java.awt.Color(204, 0, 0));
        p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.setOpaque(true);
        jPanel9.add(p3);

        lbl3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.add(lbl3_1);

        lbl3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.add(lbl3_2);

        lbl3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.add(lbl3_3);

        lbl3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.add(lbl3_4);

        t3.setBackground(new java.awt.Color(255, 153, 51));
        t3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t3.setOpaque(true);
        jPanel9.add(t3);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7);

        jPanel11.setLayout(new java.awt.GridLayout(7, 0));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("4. Legalidad e institucionalidad territorial");
        jPanel11.add(jLabel43);

        jLabel44.setText("4.1 Compromiso de Autoridades");
        jPanel11.add(jLabel44);

        jLabel45.setText("4.2 Tenencia de la Tierra");
        jPanel11.add(jLabel45);

        jLabel46.setText("4.3 Conflictos en la región");
        jPanel11.add(jLabel46);

        jLabel47.setText("4.4 Seguridad del Turista");
        jPanel11.add(jLabel47);

        jLabel49.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel49.setText("Total");
        jPanel11.add(jLabel49);

        jLabel48.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel48.setText("Ponderacion Total del destino");
        jPanel11.add(jLabel48);

        jPanel12.setLayout(new java.awt.GridLayout(7, 0, 0, 1));

        p4.setBackground(new java.awt.Color(204, 0, 0));
        p4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.setOpaque(true);
        jPanel12.add(p4);

        lbl4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(lbl4_1);

        lbl4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(lbl4_2);

        lbl4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(lbl4_3);

        lbl4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(lbl4_4);

        t4.setBackground(new java.awt.Color(255, 153, 51));
        t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t4.setOpaque(true);
        jPanel12.add(t4);

        lbl_resultadofinal.setBackground(new java.awt.Color(255, 51, 0));
        lbl_resultadofinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_resultadofinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_resultadofinal.setOpaque(true);
        jPanel12.add(lbl_resultadofinal);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Grafica");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(Botones);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (!vg) {
            fe.CrearGrafica();
            vg = true;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        VentanaInicio.vro = false;
    }//GEN-LAST:event_formWindowClosed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int resultado;

        CargarFoto ventana = new CargarFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("PDF", "pdf");
        ventana.jcargafoto.setFileFilter(filtro);
        ventana.jcargafoto.setApproveButtonText("Guardar");
        ventana.setAlwaysOnTop(true);
        resultado = ventana.jcargafoto.showOpenDialog(null);
        try {
            if (JFileChooser.APPROVE_OPTION == resultado) {
                File f = ventana.jcargafoto.getSelectedFile();
                String PATH = f.getAbsolutePath();

                if (!(PATH.endsWith(".pdf"))) {
                    File temp = new File(PATH + ".pdf");
                    f.renameTo(temp);
                    PATH = temp.getAbsolutePath();
                }
                //Crear PDF
                GenerarPDF gpdf=new GenerarPDF(PATH, fe);
                gpdf.nuevo();
                JOptionPane.showMessageDialog(null, "PDF Creado en "+PATH);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al Crear PDF " + ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl1_1;
    private javax.swing.JLabel lbl1_2;
    private javax.swing.JLabel lbl1_3;
    private javax.swing.JLabel lbl1_4;
    private javax.swing.JLabel lbl1_5;
    private javax.swing.JLabel lbl2_1;
    private javax.swing.JLabel lbl2_2;
    private javax.swing.JLabel lbl2_3;
    private javax.swing.JLabel lbl2_4;
    private javax.swing.JLabel lbl3_1;
    private javax.swing.JLabel lbl3_2;
    private javax.swing.JLabel lbl3_3;
    private javax.swing.JLabel lbl3_4;
    private javax.swing.JLabel lbl4_1;
    private javax.swing.JLabel lbl4_2;
    private javax.swing.JLabel lbl4_3;
    private javax.swing.JLabel lbl4_4;
    private javax.swing.JLabel lbl_resultadofinal;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    // End of variables declaration//GEN-END:variables
}
