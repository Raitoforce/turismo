/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaevaluacionturistica;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

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
    
    
    public String ayuda1= 
            "Existe una amplia variedad de atractivos que constituyen patrimonio natural y cultural de la región,"
            + "\ntal como elementos intangibles como el clima en lo natural y tradiciones en lo cultural y tangibles "
            + "\ncomo la biodiversidad, especies de flora y fauna en lo natural, como patrimonio cultural"
            + "\nconstruido, artesanías, gastronomía en lo cultural.";
    public String ayuda2=
           "Son los factores de distancia y tiempo de traslado que influyen en la toma de "
            + "\ndecisiones de los turistas regionales o nacionales, como también en las estrategias "
            + "\nde precio, promoción y comercialización para motivar el desplazamiento hacia el sitio"
            ;
    public String ayuda3= 
            "Es el potencial para desarrollar una diversidad de productos turísticos combinado el\n"
            + "aprovechamiento sustentable de los atractivos naturales, una gama de actividades\n"
            + "realizables todo el año y accesibles para un amplio mercado, y el uso de infraestructura que\n"
            + "brinda servicios de calidad al visitante"
            ;
    public String ayuda4=
            "Entendiéndose como la unión de los esfuerzos de las autoridades estatales, municipales y\n"
            + "comunales y la participación conjunta hacia una misma visión del turismo en la región,\n"
            + "unificando objetivos"
            ;
    
    public String ayuda1_1=
            "Expresa el nivel de conservación o deterioro que presenta el entorno natural de la región y\n"
            + "sus atractivos afines como garantía de que el desarrollo turístico sea compatible con el\n"
            + "mantenimiento de los procesos ecológicos"
            ;
    public String ayuda1_2=
            "Refleja la existencia de atributos turísticos únicos que lo identifican y diferencian de otras\n"
            + "ofertas temáticas similares que existen en el mercado regional y nacional"
            ;
    public String ayuda1_3=
            "Refleja el número de atractivos naturales y culturales relevantes que posee el destino. Asi\n"
            + "como la multiplicidad de atractivos turísticos, de innovación y de creatividad, para el\n"
            + "desarrollo del turismo"
            ;
    public String ayuda1_4=
            "Refleja los recursos naturales (paisaje, flora y fauna silvestres) con una atracción turística\n"
            + "interesante, capaz de atraer turistas regionales, nacionales e internacionales."
            ;
    public String ayuda1_5=
            "       Refleja los recursos culturales (patrimonio cultural construido, tradiciones,\n"
            + "gastronomía, fiestas e identidad local) que por su singularidad y valor son capaces de atraer\n"
            + "a los turistas y provocar que éstos estén motivados en conocer el patrimonio cultural de lugar"
            ;
    
    public String ayuda2_1=
            "Expresa las condiciones de transito que tiene la(s) vía(s) de acceso al destino, desde el\n"
            + "centro receptor (centro turístico consolidado) o emisor (centro poblacional mediano a\n"
            + "grande) más cercano, en cuánto a tipo de camino y su estado de mantenimiento y\n"
            + "conservación"
            ;
    public String ayuda2_2=
            "Refleja el tiempo que demoran los visitantes en desplazarse desde el centro receptor (centro\n"
            + "turístico consolidado) o emisor regional turístico (centro población mediano o grande) más\n"
            + "cercano hasta el punto de inicio del destino"
            ;
    public String ayuda2_3=
            "Mide las posibilidades de encadenamiento o de generación de demanda que tiene el destino\n"
            + "y sus recursos afines y complementarios, con los principales mercados emisores nacionales\n"
            + "y regionales"
            ;
    public String ayuda2_4=
            "Refleja si los atractivos por sí sólo generan motivaciones de desplazamientos a partir de las\n"
            + "características únicas que tienen y las hagan competitivas"
            ;
    public String ayuda3_1=
            "Evalúa los periodos del año (estaciones, meses) que el destino y sus recursos están\n"
            + "disponibles para el uso público, expresa la variación de la demanda a través de las\n"
            + "estaciones del año"
            ;
    public String ayuda3_2=
            "Evalúa el abanico de turistas regionales, nacionales e internacionales (por el rango de edad)\n"
            + "al cual se le ofrecen o pueden ofrecer las actividades y atractivos actuales y potenciales del\n"
            + "destino, lo que permitirá identificar el segmento de mercado concreto al cual ofertar\n"
            + "principalmente servicios turísticos"
            ;
   public String ayuda3_3=
           "Refleja el número de actividades actuales y potenciales que ofrece el destino, que son\n"
           + "afines al turismo o que pueden ser complementarios a ella"
           ;
   public String ayuda3_4=
           "Son los servicios, superestructura y requerimientos con los que cuentan los sitios turísticos\n"
           + "muchos de ellos son para satisfacer las necesidades básicas (Comercio diario, seguridad,\n"
           + "casas de cambio, etc.) y otros complementarias o de comodidad para el visitante."        
           ;
   public String ayuda4_1=
           "Entendiéndose como la unión de los esfuerzos de las autoridades estatales, municipales y\n"
           + "comunales y la participación conjunta hacia una misma visión del turismo en la región,\n"
           + "unificando objetivos"
           ;
   public String ayuda4_2=
           "Es el conocimiento, claridad y aceptación del uso, límites, reglamentación y status de la\n"
           + "propiedad de la tierra, que permita identificar el potencial de inversión en la región"
           ;
   public String ayuda4_3=
           "Son los problemas de intereses que pudieran surgir por el uso o desarrollo de un sitio a\n"
           + "nivel comunitario o regional que puedan afectar al sector turístico"
           ;
   public String ayuda4_4=
           "Es la confianza que se le brinda al visitante para que sienta la libertad de estar en la región\n"
           + "sin algún riesgo físico por violencia directa o indirecta"
           ;
    
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
   
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
        return (p1+p2+p3+p4)*100;
    }
    
    public double P1(){
         double v1=(double) ((double)sumaP1()/25.0);
         return (double) (v1*0.30);
    }
    
    public double P2(){
         double v2=(double) ((double)sumaP2()/20.0);
         return (double) (v2*0.15);
    }
    
    public double P3(){
         double v3=(double) ((double)sumaP3()/20.0);
         return (double) (v3*0.15);
    }
    
     public double P4(){
         double v4=(double) ((double)sumaP4()/20.0);
         return (double) (v4*0.40);
    }
    
    public void CrearGrafica(){
        JFreeChart grafica= null;
        DefaultCategoryDataset data= new DefaultCategoryDataset();
        
        data.addValue(val1_1,"Conservacion Ambiental","1.1");
        data.addValue(val1_2,"Singularidad del Destino","1.2");
        data.addValue(val1_3,"Diversidad del Entorno","1.3");
        data.addValue(val1_4,"Atractivos Naturales","1.4");
        data.addValue(val1_5,"Atractivos Culturales","1.5");
        data.addValue(val2_1,"Accesibilidad","2.1");
        data.addValue(val2_2,"Proximidad","2.2");
        data.addValue(val2_3,"Inserción a la oferta turística","2.3");
        data.addValue(val2_4,"Atractividad","2.4");
        data.addValue(val3_1,"Estacionalidad","3.1");
        data.addValue(val3_2,"Tipo de Turista","3.2");
        data.addValue(val3_3,"Número de Actividades","3.3");
        data.addValue(val3_4,"Servicios Básicos","3.4");
        data.addValue(val4_1,"Compromiso de Autoridades","4.1");
        data.addValue(val4_2,"Tenencia de la Tierra","4.2");
        data.addValue(val4_3,"Conflictos en la región","4.3");
        data.addValue(val4_4,"Seguridad","4.4");
        
        grafica= ChartFactory.createBarChart3D("Caracteristicas del estado","Aspecto"
                ,"Puntuaje",data, PlotOrientation.HORIZONTAL,true, true,false);
        
        //Se crea la ventana para lanzarla
        ChartPanel panel=new ChartPanel(grafica);
        JFrame ventana=new JFrame("Grafica");
        ventana.getContentPane().add(panel);
        ventana.pack();
        ventana.setVisible(true);
        //return  ventana;
    }
    
    public void MostrarResultado(){
        VentanaR vr=new VentanaR(this);
        vr.setAlwaysOnTop(true);
        vr.pack();
        vr.setVisible(true);
    }
    
    public boolean checarCampos(){
        boolean band=true;
        if(val1_1==-1){
            band=false;
        }
        if(val1_2==-1){
            band=false;
        }
        if(val1_3==-1){
            band=false;
        }
        if(val1_4==-1){
            band=false;
        }
        if(val1_5==-1){
            band=false;
        }
        if(val2_1==-1){
            band=false;
        }
        if(val2_2==-1){
            band=false;
        }
        if(val2_3==-1){
            band=false;
        }
        if(val2_4==-1){
            band=false;
        }
        if(val3_1==-1){
            band=false;
        }
        if(val3_2==-1){
            band=false;
        }
        if(val3_3==-1){
            band=false;
        }
        if(val3_4==-1){
            band=false;
        }
        if(val4_1==-1){
            band=false;
        }
        if(val4_2==-1){
            band=false;
        }
        if(val4_3==-1){
            band=false;
        }
        if(val4_4==-1){
            band=false;
        }
        return band;
    }
}
