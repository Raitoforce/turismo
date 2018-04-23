/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaevaluacionturistica;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.UIManager;

/**
 *
 * @author Usuario
 */
public class SistemaEvaluacionTuristica {

    /**
     * @param args the command line arguments
     */
    public static int tamaño=11;
    
    public static void main(String[] args) {
        // TODO code application logic here
        leerTamaño();
        try {
                Font buttonFont = new Font("Tahoma", Font.PLAIN,tamaño);
                Font labelFont = new Font("Tahoma", Font.PLAIN,tamaño);

                UIManager.put("Button.font",buttonFont);
                UIManager.put("Menu.font",buttonFont);
                UIManager.put("Label.font",labelFont);
                UIManager.put("TabbedPane.font",labelFont);
            
            UIManager.put("nimbusBase", new Color(89,169,106));
            UIManager.put("nimbusBlueGrey", new Color(155,222,172));
            UIManager.put("control", new Color(129,233,121));
            UIManager.put("text", new Color(42,71,71));
            //UIManager.put("Menu.background", new Color(89,169,106));
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace();
        }
        
        VentanaInicio vi=new VentanaInicio();
        vi.setVisible(true);
    }
    
    public static void escribirTamaño(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("configuracion.txt");
            pw = new PrintWriter(fichero);
            pw.println(tamaño);
            fichero.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void leerTamaño(){
        try{
            File archivo = new File ("configuracion.txt");
            Scanner entrada = new Scanner(archivo);
            

            SistemaEvaluacionTuristica.tamaño=entrada.nextInt();
        }catch(Exception e){System.out.println(e.getMessage());}
    }
    
}
