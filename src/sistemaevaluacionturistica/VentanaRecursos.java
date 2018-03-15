/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaevaluacionturistica;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentanaRecursos extends javax.swing.JDialog {

    private FuncionesEvaluacion fe;
    private String name;
    DefaultListModel<Recursos> modelo=new DefaultListModel();
    VentanaInicio frame;

    /**
     * Creates new form VentanaRecursos
     */
    public void ActualizarLista(){
        List<Recursos> recursos=null;
        if(name.compareTo("4")==0)recursos=fe.recursosNaturales;
        else recursos=fe.recursosCulturales;
        try {
            modelo.clear();
            for (Recursos recurso : recursos) {
                modelo.addElement(recurso);
            }
            jList1.setModel(modelo);
            jList1.setCellRenderer(new RecursoRender());
        } catch (Exception e) {
        }
    }
    
    public VentanaRecursos(FuncionesEvaluacion fe, String name,VentanaInicio frame) {
        super(frame);
        this.frame=frame;
        initComponents();
        this.fe=fe;
        this.name=name;
        this.setModalityType(ModalityType.DOCUMENT_MODAL);
        this.ActualizarLista();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_evaluar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbl_vpatrimonial1 = new javax.swing.JLabel();
        lbl_vexplotacion1 = new javax.swing.JLabel();
        lbl_total1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btn_GVS = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recursos");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel10.setLayout(new java.awt.GridLayout(1, 1));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel5.setText("Recursos");

        btn_evaluar.setText("Evaluar");
        btn_evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_evaluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(btn_evaluar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)))
                        .addGap(47, 47, 47)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_evaluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.add(jPanel13);

        jTabbedPane2.addTab("Recursos", jPanel10);

        jPanel12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel12ComponentShown(evt);
            }
        });
        jPanel12.setLayout(new java.awt.GridLayout(2, 0));

        jPanel14.setLayout(new java.awt.GridLayout(3, 2));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Valor Patrimonial");
        jPanel14.add(jLabel20);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Valor Explotación");
        jPanel14.add(jLabel22);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Valor del Recurso");
        jPanel14.add(jLabel23);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("55%");
        jPanel14.add(jLabel24);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("45%");
        jPanel14.add(jLabel25);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel14.add(jLabel26);

        lbl_vpatrimonial1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel14.add(lbl_vpatrimonial1);

        lbl_vexplotacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel14.add(lbl_vexplotacion1);

        lbl_total1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel14.add(lbl_total1);

        jPanel12.add(jPanel14);

        btn_GVS.setText("Grafica VS");
        btn_GVS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_GVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GVSActionPerformed(evt);
            }
        });

        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btn_GVS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_GVS)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        jPanel12.add(jPanel15);

        jTabbedPane2.addTab("Valor Turistico de la Región", jPanel12);

        getContentPane().add(jTabbedPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        int index=jList1.getSelectedIndex();
        if(index!=-1){
            if(name.compareTo("4")==0){
                fe.recursosNaturales.remove(index);
            }else
                fe.recursosCulturales.remove(index);
            this.ActualizarLista();
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione un recurso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_GVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GVSActionPerformed
        // TODO add your handling code here:
        if(modelo.size()!=0){
            if (fe.checarRecursosN() && name.compareTo("4")==0) {
                fe.CrearGraficaVS("4", this);
            }else if(fe.checarRecursosC()){
                fe.CrearGraficaVS("5", this);
            }else
                JOptionPane.showMessageDialog(this, "Hay recursos sin evaluar", "Mensaje de Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this, "No hay recursos añadidos", "Mensaje de Advertencia", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_GVSActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(modelo.getSize()!=0){
            if(name.compareTo("4")==0){
                if(fe.checarRecursosN()){
                    fe.val1_4=Math.round(fe.vTuristico4());
                    frame.txt_4.setText(String.valueOf(fe.val1_4));
                    this.dispose();
                }else
                    JOptionPane.showMessageDialog(this, "Hay recursos sin evaluar", "Mensaje de Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(fe.checarRecursosC()){
                    fe.val1_5=Math.round(fe.vTuristico5());            
                    frame.txt_5.setText(String.valueOf(fe.val1_5));
                    this.dispose();
                }else
                    JOptionPane.showMessageDialog(this, "Hay recursos sin evaluar", "Mensaje de Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }       
        }else
            JOptionPane.showMessageDialog(this, "Recursos no agregados", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPanel12ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel12ComponentShown
        // TODO add your handling code here:
        try{
            if (name.compareTo("4") == 0){
                if(modelo.size()!=0){
                    lbl_vpatrimonial1.setText(String.valueOf(fe.vPatrimonio4()));
                    lbl_vexplotacion1.setText(String.valueOf(fe.vUso4()));
                    lbl_total1.setText(String.valueOf(fe.vTuristico4()));   
                }
            } else {
                if(modelo.size()!=0){
                    lbl_vpatrimonial1.setText(String.valueOf(fe.vPatrimonio5()));
                    lbl_vexplotacion1.setText(String.valueOf(fe.vUso5()));
                    lbl_total1.setText(String.valueOf(fe.vTuristico5()));
                }
            }   
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jPanel12ComponentShown

    private void btn_evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_evaluarActionPerformed
        // TODO add your handling code here:
        int index=jList1.getSelectedIndex();
        if(index!=-1){
            ValorTuristico vt=new ValorTuristico(index,jList1.getSelectedValue().getNombre(),fe,name,this);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un recurso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_evaluarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        try{
                String namer;
                namer=JOptionPane.showInputDialog("Nombre del Recurso");
                Recursos recurso=new Recursos();
                recurso.setNombre(namer);
                if(!modelo.contains(recurso)){   
                    this.modelo.addElement(recurso);
                    if(name.compareTo("4")==0){
                        fe.recursosNaturales.add(new Recursos());
                        fe.recursosNaturales.get(modelo.getSize()-1).setNombre(namer);
                    }else{
                        fe.recursosCulturales.add(new Recursos());
                        fe.recursosCulturales.get(modelo.getSize()-1).setNombre(namer);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Existe otro Recurso con este Nombre", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
                this.jList1.setModel(modelo);
        }catch(Exception e){}
    }//GEN-LAST:event_btn_agregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GVS;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_evaluar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<Recursos> jList1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lbl_total1;
    private javax.swing.JLabel lbl_vexplotacion1;
    private javax.swing.JLabel lbl_vpatrimonial1;
    // End of variables declaration//GEN-END:variables
}
