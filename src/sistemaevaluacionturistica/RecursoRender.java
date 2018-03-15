/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaevaluacionturistica;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Usuario
 */
public class RecursoRender extends JLabel implements ListCellRenderer<Recursos>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Recursos> jlist, Recursos recurso, int i, boolean bln, boolean bln1) {
        setText(recurso.getNombre());
        setOpaque(true);
        if (bln) {
            setBackground(jlist.getSelectionBackground());
            setForeground(jlist.getSelectionForeground());
        } else {
            if(!recurso.get_State())
            setBackground(Color.GREEN);
            else
                setBackground(Color.ORANGE);
            } 
        
        return this;
    }
    
}
