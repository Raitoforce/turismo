/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaevaluacionturistica;

/**
 *
 * @author Usuario
 */
public class FuncionesEvaluacion {
    public int state=1;
    public int val1_1=-1,val1_2=-1,val1_3=-1,val1_4=-1,val1_5=-1;
    public int val2_1=-1,val2_2=-1,val2_3=-1,val2_4=-1;
    public int val3_1=-1,val3_2=-1,val3_3=-1,val3_4=-1;
    public int val4_1=-1,val4_2=-1,val4_3=-1,val4_4=-1;
    public String cadena1_1,cadena1_2,cadena1_3,cadena1_4,cadena1_5;
    public String cadena2_1,cadena2_2,cadena2_3,cadena2_4;
    public String cadena3_1,cadena3_2,cadena3_3,cadena3_4;
    public String cadena4_1,cadena4_2,cadena4_3,cadena4_4;
    
    
    public int sumaP1(){
        return val1_1+val1_2+val1_3+val1_4+val1_5;
    }
    public int sumaP2(){
        return val2_1+val2_2+val2_3+val2_4;
    }
    public int sumaP3(){
        return val3_1+val3_2+val3_3+val3_4;
    }
    public int sumaP4(){
        return val4_1+val4_2+val4_3+val4_4;
    }
    
    public double Ptotal(){
        double v1=(double) ((double)sumaP1()/25.0);
        double v2=(double) ((double)sumaP2()/20.0);
        double v3=(double) ((float)sumaP3()/20.0);
        double v4=(double) ((double)sumaP4()/20.0);
        
        double p1=(double) (v1*0.30);
        double p2=(double) (v2*0.15);
        double p3=(double) (v3*0.15);
        double p4=(double) (v4*0.40);
   
        return (p1+p2+p3+p4)*100;
    }
}
