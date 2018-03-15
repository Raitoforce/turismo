/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaevaluacionturistica;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleAnchor;

/**
 *
 * @author Usuario
 */
public class FuncionesEvaluacion {

    public int state = 1;
    public int val1_1 = -1, val1_2 = -1, val1_3 = -1, val1_4 = -1, val1_5 = -1;

    public int val2_1 = -1, val2_2 = -1, val2_3 = -1, val2_4 = -1;
    public int val3_1 = -1, val3_2 = -1, val3_3 = -1, val3_4 = -1;
    public int val4_1 = -1, val4_2 = -1, val4_3 = -1, val4_4 = -1;
    public List<Recursos> recursosCulturales=new ArrayList<>();
    public List<Recursos> recursosNaturales=new ArrayList<>();

    public String municipio = "";
    public String estado = "";
    public String img = "";

    public String comentario1_1 = "";
    public String comentario1_2 = "";
    public String comentario1_3 = "";
    public String comentario1_4 = "";
    public String comentario1_5 = "";
    public String comentario2_1 = "";
    public String comentario2_2 = "";
    public String comentario2_3 = "";
    public String comentario2_4 = "";
    public String comentario3_1 = "";
    public String comentario3_2 = "";
    public String comentario3_3 = "";
    public String comentario3_4 = "";
    public String comentario4_1 = "";
    public String comentario4_2 = "";
    public String comentario4_3 = "";
    public String comentario4_4 = "";
    public String ayuda1
            = "Existe una amplia variedad de atractivos que constituyen patrimonio natural y cultural de la región,"
            + "\ntal como elementos intangibles como el clima en lo natural y tradiciones en lo cultural y tangibles "
            + "\ncomo la biodiversidad, especies de flora y fauna en lo natural, como patrimonio cultural"
            + "\nconstruido, artesanías, gastronomía en lo cultural.";
    public String ayuda2
            = "Son los factores de distancia y tiempo de traslado que influyen en la toma de "
            + "\ndecisiones de los turistas regionales o nacionales, como también en las estrategias "
            + "\nde precio, promoción y comercialización para motivar el desplazamiento hacia el sitio";
    public String ayuda3
            = "Es el potencial para desarrollar una diversidad de productos turísticos combinado el\n"
            + "aprovechamiento sustentable de los atractivos naturales, una gama de actividades\n"
            + "realizables todo el año y accesibles para un amplio mercado, y el uso de infraestructura que\n"
            + "brinda servicios de calidad al visitante";
    public String ayuda4
            = "Entendiéndose como la unión de los esfuerzos de las autoridades estatales, municipales y\n"
            + "comunales y la participación conjunta hacia una misma visión del turismo en la región,\n"
            + "unificando objetivos";

    public String ayuda1_1
            = "Expresa el nivel de conservación o deterioro que presenta el entorno natural de la región y\n"
            + "sus atractivos afines como garantía de que el desarrollo turístico sea compatible con el\n"
            + "mantenimiento de los procesos ecológicos";
    public String ayuda1_2
            = "Refleja la existencia de atributos turísticos únicos que lo identifican y diferencian de otras\n"
            + "ofertas temáticas similares que existen en el mercado regional y nacional";
    public String ayuda1_3
            = "Refleja el número de atractivos naturales y culturales relevantes que posee el destino. Asi\n"
            + "como la multiplicidad de atractivos turísticos, de innovación y de creatividad, para el\n"
            + "desarrollo del turismo";
    public String ayuda1_4
            = "Refleja los recursos naturales (paisaje, flora y fauna silvestres) con una atracción turística\n"
            + "interesante, capaz de atraer turistas regionales, nacionales e internacionales.";
    public String ayuda1_5
            = "       Refleja los recursos culturales (patrimonio cultural construido, tradiciones,\n"
            + "gastronomía, fiestas e identidad local) que por su singularidad y valor son capaces de atraer\n"
            + "a los turistas y provocar que éstos estén motivados en conocer el patrimonio cultural de lugar";

    public String ayuda2_1
            = "Expresa las condiciones de transito que tiene la(s) vía(s) de acceso al destino, desde el\n"
            + "centro receptor (centro turístico consolidado) o emisor (centro poblacional mediano a\n"
            + "grande) más cercano, en cuánto a tipo de camino y su estado de mantenimiento y\n"
            + "conservación";
    public String ayuda2_2
            = "Refleja el tiempo que demoran los visitantes en desplazarse desde el centro receptor (centro\n"
            + "turístico consolidado) o emisor regional turístico (centro población mediano o grande) más\n"
            + "cercano hasta el punto de inicio del destino";
    public String ayuda2_3
            = "Mide las posibilidades de encadenamiento o de generación de demanda que tiene el destino\n"
            + "y sus recursos afines y complementarios, con los principales mercados emisores nacionales\n"
            + "y regionales";
    public String ayuda2_4
            = "Refleja si los atractivos por sí sólo generan motivaciones de desplazamientos a partir de las\n"
            + "características únicas que tienen y las hagan competitivas";
    public String ayuda3_1
            = "Evalúa los periodos del año (estaciones, meses) que el destino y sus recursos están\n"
            + "disponibles para el uso público, expresa la variación de la demanda a través de las\n"
            + "estaciones del año";
    public String ayuda3_2
            = "Evalúa el abanico de turistas regionales, nacionales e internacionales (por el rango de edad)\n"
            + "al cual se le ofrecen o pueden ofrecer las actividades y atractivos actuales y potenciales del\n"
            + "destino, lo que permitirá identificar el segmento de mercado concreto al cual ofertar\n"
            + "principalmente servicios turísticos";
    public String ayuda3_3
            = "Refleja el número de actividades actuales y potenciales que ofrece el destino, que son\n"
            + "afines al turismo o que pueden ser complementarios a ella";
    public String ayuda3_4
            = "Son los servicios, superestructura y requerimientos con los que cuentan los sitios turísticos\n"
            + "muchos de ellos son para satisfacer las necesidades básicas (Comercio diario, seguridad,\n"
            + "casas de cambio, etc.) y otros complementarias o de comodidad para el visitante.";
    public String ayuda4_1
            = "Entendiéndose como la unión de los esfuerzos de las autoridades estatales, municipales y\n"
            + "comunales y la participación conjunta hacia una misma visión del turismo en la región,\n"
            + "unificando objetivos";
    public String ayuda4_2
            = "Es el conocimiento, claridad y aceptación del uso, límites, reglamentación y status de la\n"
            + "propiedad de la tierra, que permita identificar el potencial de inversión en la región";
    public String ayuda4_3
            = "Son los problemas de intereses que pudieran surgir por el uso o desarrollo de un sitio a\n"
            + "nivel comunitario o regional que puedan afectar al sector turístico";
    public String ayuda4_4
            = "Es la confianza que se le brinda al visitante para que sienta la libertad de estar en la región\n"
            + "sin algún riesgo físico por violencia directa o indirecta";

    public int sumaP1() {
        return val1_1 + val1_2 + val1_3 + val1_4 + val1_5;
    }

    public int sumaP2() {
        return val2_1 + val2_2 + val2_3 + val2_4;
    }

    public int sumaP3() {
        return val3_1 + val3_2 + val3_3 + val3_4;
    }

    public int sumaP4() {
        return val4_1 + val4_2 + val4_3 + val4_4;
    }

    public float Ptotal() {
        float v1 = (float) ((float) sumaP1() / 25.0);
        float v2 = (float) ((float) sumaP2() / 20.0);
        float v3 = (float) ((float) sumaP3() / 20.0);
        float v4 = (float) ((float) sumaP4() / 20.0);

        float p1 = (float) (v1 * 0.30);
        float p2 = (float) (v2 * 0.15);
        float p3 = (float) (v3 * 0.15);
        float p4 = (float) (v4 * 0.40);
        return (p1 + p2 + p3 + p4) * 100;
    }

    public float P1() {
        float v1 = (float) ((float) sumaP1() / 25.0);
        return (float) (v1 * 0.30);
    }

    public double P2() {
        float v2 = (float) ((float) sumaP2() / 20.0);
        return (float) (v2 * 0.15);
    }

    public float P3() {
        float v3 = (float) ((float) sumaP3() / 20.0);
        return (float) (v3 * 0.15);
    }

    public float P4() {
        float v4 = (float) ((float) sumaP4() / 20.0);
        return (float) (v4 * 0.40);
    }

    public float vPatrimonio4() {
        float criterio1,c1=0;
        float criterio2,c2=0;
        float criterio3,c3=0;
        float criterio4,c4=0;
        int size = recursosNaturales.size();
        for (Recursos recurso : recursosNaturales){
            if(!recurso.get_State()){
                c1+=recurso.getCriterio1();
                c2+=recurso.getCriterio2();
                c3+=recurso.getCriterio3();
                c4+=recurso.getCriterio4();
            }else
                size--;
        }
        criterio1=c1/size;
        criterio2=c2/size;
        criterio3=c3/size;
        criterio4=c4/size;
        return (float) (((float) criterio1 * 0.4) + ((float) criterio2 * 0.3) + ((float) criterio3 * 0.1) + ((float) criterio4 * 0.2));
    }

    public float vPatrimonio5() {
        float criterio1,c1=0;
        float criterio2,c2=0;
        float criterio3,c3=0;
        float criterio4,c4=0;
        int size = recursosCulturales.size();
        for (Recursos recurso : recursosCulturales){
            if(!recurso.get_State()){
                c1+=recurso.getCriterio1();
                c2+=recurso.getCriterio2();
                c3+=recurso.getCriterio3();
                c4+=recurso.getCriterio4();
            }else
                size--;
        }
        criterio1=c1/size;
        criterio2=c2/size;
        criterio3=c3/size;
        criterio4=c4/size;
        return (float) (((float) criterio1 * 0.4) + ((float) criterio2 * 0.3) + ((float) criterio3 * 0.1) + ((float) criterio4 * 0.2));
    }

    public float vUso4() {
        float criterio5,c5=0;
        float criterio6,c6=0;
        float criterio7,c7=0;
        float criterio8,c8=0;
        float criterio9,c9=0;
        float criterio10,c10=0;
        
        int size = recursosNaturales.size();
        for (Recursos recurso : recursosNaturales){
            if(!recurso.get_State()){
                c5+=recurso.getCriterio5();
                c6+=recurso.getCriterio6();
                c7+=recurso.getCriterio7();
                c8+=recurso.getCriterio8();
                c9+=recurso.getCriterio9();
                c10+=recurso.getCriterio10();
            }else
                size--;
        }
        criterio5=c5/size;
        criterio6=c6/size;
        criterio7=c7/size;
        criterio8=c8/size;
        criterio9=c9/size;
        criterio10=c10/size;
        return (float) (((float) criterio5 * 0.1) + ((float) criterio6 * 0.1) + ((float) criterio7 * 0.2) + ((float) criterio8 * 0.3) + ((float) criterio9 * 0.2) + ((float) criterio10 * 0.1));
    }

    public float vUso5() {
        float criterio5,c5=0;
        float criterio6,c6=0;
        float criterio7,c7=0;
        float criterio8,c8=0;
        float criterio9,c9=0;
        float criterio10,c10=0;
        
        int size = recursosCulturales.size();
        for (Recursos recurso : recursosCulturales){
            if(!recurso.get_State()){
                c5+=recurso.getCriterio5();
                c6+=recurso.getCriterio6();
                c7+=recurso.getCriterio7();
                c8+=recurso.getCriterio8();
                c9+=recurso.getCriterio9();
                c10+=recurso.getCriterio10();
            }else
                size--;
        }
        criterio5=c5/size;
        criterio6=c6/size;
        criterio7=c7/size;
        criterio8=c8/size;
        criterio9=c9/size;
        criterio10=c10/size;
        return (float) (((float) criterio5 * 0.1) + ((float) criterio6 * 0.1) + ((float) criterio7 * 0.2) + ((float) criterio8 * 0.3) + ((float) criterio9 * 0.2) + ((float) criterio10 * 0.1));
    }

    public float vTuristico4() {
        return (float) ((vPatrimonio4() * 0.55) + (vUso4() * 0.45));
    }

    public float vTuristico5() {
        return (float) ((vPatrimonio5() * 0.55) + (vUso5() * 0.45));
    }
    
    public JFreeChart g1(){
        JFreeChart grafica;
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        data.addValue(val1_1, "Conservación Ambiental", "");
        data.addValue(val1_2, "Singularidad del Destino", "");
        data.addValue(val1_3, "Diversidad del Entorno", "");
        data.addValue(val1_4, "Atractivos Naturales", "");
        data.addValue(val1_5, "Atractivos Culturales", "");
        grafica = ChartFactory.createBarChart3D("Patrimonio Natural y Cultural " + municipio + "," + estado, "Aspecto",
                "Puntuaje", data, PlotOrientation.VERTICAL, true, true, false);
        return grafica;
    }
    
    public JFreeChart g2(){
        JFreeChart grafica;
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        data.addValue(val2_1, "Accesibilidad", "");
        data.addValue(val2_2, "Proximidad", "");
        data.addValue(val2_3, "Inserción a la oferta turística", "");
        data.addValue(val2_4, " Atractividad", "");
        grafica = ChartFactory.createBarChart3D("Potencial de Vinculación " + municipio + "," + estado, "Aspecto",
                "Puntuaje", data, PlotOrientation.VERTICAL, true, true, false);
        return grafica;
    }
    
    public JFreeChart g3(){
        JFreeChart grafica;
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        data.addValue(val3_1, "Estacionalidad", "");
        data.addValue(val3_2, "Tipo de Turista", "");
        data.addValue(val3_3, "Número de Actividades", "");
        data.addValue(val3_4, "Servicios Básicos", "");
        grafica = ChartFactory.createBarChart3D("Diversidad de Oportuniadades " + municipio + "," + estado, "Aspecto",
                "Puntuaje", data, PlotOrientation.VERTICAL, true, true, false);
        return grafica;
    }
    
    public JFreeChart g4(){
        JFreeChart grafica;
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        data.addValue(val4_1, "Compromiso de Autoridades", "");
        data.addValue(val4_2, "Tenencia de la Tierra", "");
        data.addValue(val4_3, "Conflictos en la región", "");
        data.addValue(val4_4, "Seguridad del Turista", "");
        grafica = ChartFactory.createBarChart3D("Legalidad e Institucionalidad " + municipio + "," + estado, "Aspecto",
                "Puntuaje", data, PlotOrientation.VERTICAL, true, true, false);
        return grafica;
    }
    
    public JFreeChart grafica(){
        JFreeChart grafica = null;
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        data.addValue(((float)sumaP1()/25)*100, "Patrimonio Natural y Cultural", "");
        data.addValue(((float)sumaP2()/20)*100, "Potencial de Vinculación", "");
        data.addValue(((float)sumaP3()/20)*100, "Diversidad de Oportunidades", "");
        data.addValue(((float)sumaP4()/20)*100, "Legalidad e Institucionalidad", "");
        data.addValue(Ptotal(), "Potencial de la Región", "");
        
        ValueMarker marker=new ValueMarker(55);
        marker.setPaint(Color.red);
        marker.setLabel("Linea minima de Potencial");
        marker.setLabelAnchor(RectangleAnchor.CENTER);
        
        grafica = ChartFactory.createBarChart3D("Caracteristicas de " + municipio + "," + estado, "Aspecto",
                "Puntuaje", data, PlotOrientation.VERTICAL, true, true, false);
        grafica.getCategoryPlot().addRangeMarker(marker);
        return grafica;
    }

    public void CrearGrafica(VentanaR vr) {
        //Se crea la ventana para lanzarla
        ChartPanel panel = new ChartPanel(grafica());
        panel.setDomainZoomable(false);
        panel.setRangeZoomable(false);
        panel.setPopupMenu(null);
        panel.addChartMouseListener(new ChartMouseListener() {
            @Override
            public void chartMouseClicked(ChartMouseEvent cme){
                try{
                boolean e1=cme.getEntity().getToolTipText().contains("Patrimonio");
                boolean e2=cme.getEntity().getToolTipText().contains("Vinculación");
                boolean e3=cme.getEntity().getToolTipText().contains("Diversidad");
                boolean e4=cme.getEntity().getToolTipText().contains("Legalidad");
                if (e1){
                    panel.setChart(g1());
                    panel.repaint();
                }
                else if (e2){
                    panel.setChart(g2());
                    panel.repaint();
                }
                else if (e3){
                    panel.setChart(g3());
                    panel.repaint();
                }
                else if (e4){
                    panel.setChart(g4());
                    panel.repaint();
                }else{
                    panel.setChart(grafica());
                    panel.repaint();
                }
                panel.setDomainZoomable(false);
                panel.setRangeZoomable(false);
                panel.setPopupMenu(null);
                }catch(Exception e){
                    panel.setChart(grafica());
                    panel.repaint();
                    panel.setDomainZoomable(false);
                    panel.setRangeZoomable(false);
                    panel.setPopupMenu(null);
                }
            }
            @Override
            public void chartMouseMoved(ChartMouseEvent cme){
            }
        });
        
        JDialog ventana = new JDialog(vr);
        ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }

            private void formWindowClosing(WindowEvent evt) {
                //To change body of generated methods, choose Tools | Templates.
                VentanaR.vg = false;
            }
        });
        ventana.getContentPane().add(panel);
        ventana.pack();
        ventana.setLocation(600,50);
        ventana.setModal(true);
        ventana.setVisible(true);
        //return  ventana;
    }

    private XYDataset creaDataset(List<Recursos> recursos) {
        XYSeriesCollection dataset = new XYSeriesCollection();

        XYSeries s1 = new XYSeries("Valor del patrimonio vs Valor de explotación");
        for (Recursos recurso : recursos) {
            s1.add(recurso.vUso(), recurso.vPatrimonio());
        }
        dataset.addSeries(s1);
        return dataset;
    }

    public void CrearGraficaVS(String name,VentanaRecursos vr) {
        JFreeChart grafica = null;
        XYDataset data = null;
        if(name.compareTo("4")==0)
            data=creaDataset(recursosNaturales);
        else
            data=creaDataset(recursosCulturales);
        
        grafica = ChartFactory.createScatterPlot("Grafica VS", "Valor de Aprovechamiento", "Valor Patrimonio", data, PlotOrientation.HORIZONTAL, true, false, false);
        grafica.getXYPlot().getDomainAxis().setRange(0.0,5.0);
        grafica.getXYPlot().getRangeAxis().setRange(0.0,5.0);
        
        //Se crea la ventana para lanzarla
        ChartPanel panel = new ChartPanel(grafica);
        panel.setDomainZoomable(false);
        panel.setRangeZoomable(false);
        panel.setPopupMenu(null);
        JDialog ventana = new JDialog(vr);
        ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }

            private void formWindowClosing(WindowEvent evt) {
                //To change body of generated methods, choose Tools | Templates.
                VentanaR.vg = false;
            }
        });
        ventana.getContentPane().add(panel);
        ventana.pack();
        ventana.setLocation(600,50);
        ventana.setModal(true);
        ventana.setVisible(true);
        //return  ventana;
    }

    public void MostrarResultado() {
        VentanaR vr = new VentanaR(this);
        //vr.setAlwaysOnTop(true);
        vr.setLocation(100,20);
        vr.pack();
        vr.setVisible(true);
    }

    public boolean checarCampos() {
        boolean band = true;
        if (val1_1 == -1) {
            band = false;
        }
        if (val1_2 == -1) {
            band = false;
        }
        if (val1_3 == -1) {
            band = false;
        }
        if (val1_4 == -1) {
            band = false;
        }
        if (val1_5 == -1) {
            band = false;
        }
        if (val2_1 == -1) {
            band = false;
        }
        if (val2_2 == -1) {
            band = false;
        }
        if (val2_3 == -1) {
            band = false;
        }
        if (val2_4 == -1) {
            band = false;
        }
        if (val3_1 == -1) {
            band = false;
        }
        if (val3_2 == -1) {
            band = false;
        }
        if (val3_3 == -1) {
            band = false;
        }
        if (val3_4 == -1) {
            band = false;
        }
        if (val4_1 == -1) {
            band = false;
        }
        if (val4_2 == -1) {
            band = false;
        }
        if (val4_3 == -1) {
            band = false;
        }
        if (val4_4 == -1) {
            band = false;
        }
        return band;
    }

    public boolean checarDatos() {
        boolean band = true;
        if (estado.compareTo("") == 0) {
            band = false;
        }
        if (municipio.compareTo("") == 0) {
            band = false;
        }
        return band;
    }
    
    public boolean checarRecursosN(){
        boolean band=true;
        for (Recursos recurso : recursosNaturales) {
            if(recurso.get_State()){
                band=false;
                break;
            }     
        }
        return band;
    }
    
    public boolean checarRecursosC(){
        boolean band=true;
        for (Recursos recurso : recursosNaturales) {
            if(recurso.get_State()){
                band=false;
                break;
            }     
        }
        return band;
    }
}
