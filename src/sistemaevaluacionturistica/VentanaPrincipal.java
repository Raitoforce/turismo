package sistemaevaluacionturistica;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }
    public FuncionesEvaluacion fe= new FuncionesEvaluacion();
   public void FormatoCampo(JTextField txt,int contenido){
       if(contenido!=-1)
        txt.setText(String.valueOf(contenido));
       else
           txt.setText("");
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        label_1 = new javax.swing.JLabel();
        label_2 = new javax.swing.JLabel();
        label_3 = new javax.swing.JLabel();
        label_4 = new javax.swing.JLabel();
        label_5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txt_1 = new javax.swing.JTextField();
        txt_2 = new javax.swing.JTextField();
        txt_3 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        txt_5 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btn_coment_1 = new javax.swing.JButton();
        btn_coment_2 = new javax.swing.JButton();
        btn_coment_3 = new javax.swing.JButton();
        btn_coment_4 = new javax.swing.JButton();
        btn_coment_5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_calcular = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evaluación Turistica");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btn_1.setText("Patrimonio Natural y Cultural");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1);

        btn_2.setText("Potencial de Vinculacion");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2);

        btn_3.setText("Diversidad de Oportunidades");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3);

        btn_4.setText("Legalidad e Institucionalidad");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aspectos a Evaluar"));

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new java.awt.GridLayout(5, 0, 5, 5));

        label_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_1.setText(" Conservación Ambiental");
        label_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(label_1);

        label_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_2.setText("Singularidad del Destino");
        label_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(label_2);

        label_3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_3.setText(" Diversidad del Entorno");
        label_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(label_3);

        label_4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_4.setText(" Atractivos Naturales");
        label_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(label_4);

        label_5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_5.setText("Atractivos Culturales");
        jPanel4.add(label_5);

        jPanel6.setLayout(new java.awt.GridLayout(5, 0));

        txt_1.setColumns(3);
        txt_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_1FocusLost(evt);
            }
        });
        txt_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_1KeyTyped(evt);
            }
        });
        jPanel6.add(txt_1);

        txt_2.setColumns(3);
        txt_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_2FocusLost(evt);
            }
        });
        txt_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_2KeyTyped(evt);
            }
        });
        jPanel6.add(txt_2);

        txt_3.setColumns(3);
        txt_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_3FocusLost(evt);
            }
        });
        txt_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_3KeyTyped(evt);
            }
        });
        jPanel6.add(txt_3);

        txt_4.setColumns(3);
        txt_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_4FocusLost(evt);
            }
        });
        txt_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_4KeyTyped(evt);
            }
        });
        jPanel6.add(txt_4);

        txt_5.setColumns(3);
        txt_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_5.setNextFocusableComponent(btn_calcular);
        txt_5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_5FocusLost(evt);
            }
        });
        txt_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_5KeyTyped(evt);
            }
        });
        jPanel6.add(txt_5);

        jPanel7.setLayout(new java.awt.GridLayout(5, 1));

        btn_coment_1.setText("Comentario");
        btn_coment_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(btn_coment_1);

        btn_coment_2.setText("Comentario");
        btn_coment_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(btn_coment_2);

        btn_coment_3.setText("Comentario");
        btn_coment_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(btn_coment_3);

        btn_coment_4.setText("Comentario");
        btn_coment_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(btn_coment_4);

        btn_coment_5.setText("Comentario");
        btn_coment_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(btn_coment_5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_calcular.setText("Calcular Total");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(btn_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(150, 150, 150)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_calcular)
                    .addContainerGap()))
        );

        jMenu1.setText("Archivo");
        jMenu1.setContentAreaFilled(false);
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem5.setText("Nuevo");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(jMenuItem5);

        jMenuItem1.setText("Abrir");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar Como");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Cerrar");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        fe.state=2;
         label_1.setText("Accesibilidad");
        label_2.setText("Proximidad");
        label_3.setText("Inserción a la oferta turística");
        label_4.setText("Atractividad");
        label_5.setVisible(false);
        txt_5.setVisible(false);
        btn_coment_5.setVisible(false);
        
      FormatoCampo(txt_1,fe.val2_1);
      FormatoCampo(txt_2,fe.val2_2);
      FormatoCampo(txt_3,fe.val2_3);
      FormatoCampo(txt_4,fe.val2_4);
        
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        fe.state=1;
        label_1.setText("Conservación Ambiental");
        label_2.setText("Singularidad del Destino");
        label_3.setText("Diversidad del Entorno");
        label_4.setText("Atractivos Naturales");
        label_5.setText("Atractivos Culturales");
        
        btn_coment_5.setVisible(true);
        
        label_5.setVisible(true);
        txt_5.setVisible(true);
        
      FormatoCampo(txt_1,fe.val1_1);
      FormatoCampo(txt_2,fe.val1_2);
      FormatoCampo(txt_3,fe.val1_3);
      FormatoCampo(txt_4,fe.val1_4);
      FormatoCampo(txt_5,fe.val1_5);
      
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        fe.state=3;
        label_1.setText("Estacionalidad");
        label_2.setText("Tipo de Turista");
        label_3.setText("Número de Actividades");
        label_4.setText("Servicios Básicos");
        btn_coment_5.setVisible(false);
        label_5.setVisible(false);
        txt_5.setVisible(false);
        
        FormatoCampo(txt_1,fe.val3_1);
        FormatoCampo(txt_2,fe.val3_2);
        FormatoCampo(txt_3,fe.val3_3);
        FormatoCampo(txt_4,fe.val3_4);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        fe.state=4;
         label_1.setText("Compromiso de Autoridades");
        label_2.setText("Tenencia de la Tierra");
        label_3.setText("Conflictos en la región");
        label_4.setText("Seguridad del Turista");
        btn_coment_5.setVisible(false);
        label_5.setVisible(false);
        txt_5.setVisible(false);
        
        FormatoCampo(txt_1,fe.val4_1);
        FormatoCampo(txt_2,fe.val4_2);
        FormatoCampo(txt_3,fe.val4_3);
        FormatoCampo(txt_4,fe.val4_4);
        
    }//GEN-LAST:event_btn_4ActionPerformed

    private void txt_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_1KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
        if(txt_1.getCaretPosition()>0)
            evt.consume();
    }//GEN-LAST:event_txt_1KeyTyped

    private void txt_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_2KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }else{
            try{
        if(fe.state==1 && txt_2.getText()!=null){
            fe.val1_2=Integer.getInteger(txt_1.getText());
        }
        if(fe.state==2 && txt_2.getText()!=null){
            fe.val2_2=Integer.getInteger(txt_1.getText());
        }
        if(fe.state==3 && txt_2.getText()!=null){
            fe.val3_2=Integer.getInteger(txt_1.getText());
        }
        if(fe.state==4 && txt_2.getText()!=null){
            fe.val4_2=Integer.getInteger(txt_1.getText());
        }
        }catch(Exception e){}
        
        }
        
        if(txt_2.getCaretPosition()>0)
            evt.consume();
        
    }//GEN-LAST:event_txt_2KeyTyped

    private void txt_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_3KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
        if(txt_3.getCaretPosition()>0)
            evt.consume();
    }//GEN-LAST:event_txt_3KeyTyped

    private void txt_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_4KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
        if(txt_4.getCaretPosition()>0)
            evt.consume();
    }//GEN-LAST:event_txt_4KeyTyped

    private void txt_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_5KeyTyped
        // TODO add your handling code here:
        char c;
        c = evt.getKeyChar();
        if(!(c==KeyEvent.VK_0 || c==KeyEvent.VK_1 || c==KeyEvent.VK_2 || c==KeyEvent.VK_3 || c==KeyEvent.VK_4 || c==KeyEvent.VK_5 || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
        if(txt_5.getCaretPosition()>0)
            evt.consume();
    }//GEN-LAST:event_txt_5KeyTyped

    private void txt_1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_1FocusLost
        // TODO add your handling code here:
         try {
           if(fe.state==1)
                fe.val1_1=Integer.parseInt(txt_1.getText());
           if(fe.state==2)
                fe.val2_1=Integer.parseInt(txt_1.getText());
           if(fe.state==3)
                fe.val3_1=Integer.parseInt(txt_1.getText());
           if(fe.state==4)
                fe.val4_1=Integer.parseInt(txt_1.getText());
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_1FocusLost

    private void txt_2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_2FocusLost
        // TODO add your handling code here:
        try {
           if(fe.state==1)
                fe.val1_2=Integer.parseInt(txt_2.getText());
           if(fe.state==2)
                fe.val2_2=Integer.parseInt(txt_2.getText());
           if(fe.state==3)
                fe.val3_2=Integer.parseInt(txt_2.getText());
           if(fe.state==4)
                fe.val4_2=Integer.parseInt(txt_2.getText());
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_2FocusLost

    private void txt_3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_3FocusLost
        // TODO add your handling code here:
        try {
           if(fe.state==1)
                fe.val1_3=Integer.parseInt(txt_3.getText());
           if(fe.state==2)
                fe.val2_3=Integer.parseInt(txt_3.getText());
           if(fe.state==3)
                fe.val3_3=Integer.parseInt(txt_3.getText());
           if(fe.state==4)
                fe.val4_3=Integer.parseInt(txt_3.getText());
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_3FocusLost

    private void txt_4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_4FocusLost
        // TODO add your handling code here:
        try {
           if(fe.state==1)
                fe.val1_4=Integer.parseInt(txt_4.getText());
           if(fe.state==2)
                fe.val2_4=Integer.parseInt(txt_4.getText());
           if(fe.state==3)
                fe.val3_4=Integer.parseInt(txt_4.getText());
           if(fe.state==4)
               fe.val4_4=Integer.parseInt(txt_4.getText());
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_4FocusLost

    private void txt_5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_5FocusLost
        // TODO add your handling code here:
        try {
           if(fe.state==1)
                fe.val1_5=Integer.parseInt(txt_5.getText());
        } catch (Exception e){
        }
    }//GEN-LAST:event_txt_5FocusLost

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,String.valueOf(fe.Ptotal())+"%","Calculo",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btn_calcularActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_coment_1;
    private javax.swing.JButton btn_coment_2;
    private javax.swing.JButton btn_coment_3;
    private javax.swing.JButton btn_coment_4;
    private javax.swing.JButton btn_coment_5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel label_3;
    private javax.swing.JLabel label_4;
    private javax.swing.JLabel label_5;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JTextField txt_5;
    // End of variables declaration//GEN-END:variables
}
