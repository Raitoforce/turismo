/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaevaluacionturistica;

import javax.swing.UIManager;

/**
 *
 * @author Usuario
 */
public class SistemaEvaluacionTuristica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace();
        }
        
        VentanaInicio vi=new VentanaInicio();
        vi.setVisible(true);
    }
    
}
