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
public class Recursos {
   private String nombre;
   private int criterio1=-1;
   private int criterio2=-1;
   private int criterio3=-1;
   private int criterio4=-1;
   private int criterio5=-1;
   private int criterio6=-1;
   private int criterio7=-1;
   private int criterio8=-1;
   private int criterio9=-1;
   private int criterio10=-1;
   private boolean c1=false,c2=false,c3=false,c4=false,c5=false,c6=false,c7=false,c8=false,c9=false,c10=false;

    public Recursos() {
    }
    
    public boolean get_State(){
        boolean band=true;
        if(c1)band=false;
        if(c2)band=false;
        if(c3)band=false;
        if(c4)band=false;
        if(c5)band=false;
        if(c6)band=false;
        if(c7)band=false;
        if(c8)band=false;
        if(c9)band=false;
        if(c10)band=false;
        return band;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCriterio1() {
        return criterio1;
    }

    public void setCriterio1(int criterio1) {
        this.criterio1 = criterio1;
        c1=true;
    }

    public int getCriterio2() {
        return criterio2;
    }

    public void setCriterio2(int criterio2) {
        this.criterio2 = criterio2;
        c2=true;
    }

    public int getCriterio3() {
        return criterio3;
    }

    public void setCriterio3(int criterio3) {
        this.criterio3 = criterio3;
        c3=true;
    }

    public int getCriterio4() {
        return criterio4;
    }

    public void setCriterio4(int criterio4) {
        this.criterio4 = criterio4;
        c4=true;
    }

    public int getCriterio5() {
        return criterio5;
    }

    public void setCriterio5(int criterio5) {
        this.criterio5 = criterio5;
        c5=true;
    }

    public int getCriterio6() {
        return criterio6;
    }

    public void setCriterio6(int criterio6) {
        this.criterio6 = criterio6;
        c6=true;
    }

    public int getCriterio7() {
        return criterio7;
    }

    public void setCriterio7(int criterio7) {
        this.criterio7 = criterio7;
        c7=true;
    }
    
    public int getCriterio8() {
        return criterio8;
    }

    public void setCriterio8(int criterio8) {
        this.criterio8 = criterio8;
        c8=true;
    }

    public int getCriterio9() {
        return criterio9;
    }

    public void setCriterio9(int criterio9) {
        this.criterio9 = criterio9;
        c9=true;
    }

    public int getCriterio10() {
        return criterio10;
    }

    public void setCriterio10(int criterio10) {
        this.criterio10 = criterio10;
        c10=true;
    }
    
    public float vPatrimonio(){
        return (float) (((float) criterio1 * 0.4) + ((float) criterio2 * 0.3) + ((float) criterio3 * 0.1) + ((float) criterio4 * 0.2));
    }
    
    public float vUso(){
        return (float) (((float) criterio5 * 0.1) + ((float) criterio6 * 0.1) + ((float) criterio7 * 0.2) + ((float) criterio8 * 0.3) + ((float) criterio9 * 0.2) + ((float) criterio10 * 0.1));
    }
    
    public float vTuristico(){
        return (float) ((vPatrimonio() * 0.55) + (vUso() * 0.45));
    }
    
    @Override
    public boolean equals(Object o){
        Recursos r=(Recursos) o;
        boolean band=false;
        if (r.getNombre() == null ? getNombre() == null : r.getNombre().equals(getNombre()))
            band=true;
        return band;
    }
    
}
