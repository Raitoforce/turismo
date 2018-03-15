package sistemaevaluacionturistica;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.jfree.chart.ChartUtilities;

public class GenerarPDF {
    String PATH;
    FuncionesEvaluacion fe;

    public GenerarPDF(String PATH, FuncionesEvaluacion fe) {
        this.PATH = PATH;
        this.fe = fe;
    }
    
    
    private PdfPCell Celda(String contenido, BaseColor color){
        PdfPCell cell=new PdfPCell(new Phrase(contenido));
        cell.setBackgroundColor(color);
        return cell;
    }
    
    public void nuevo() throws FileNotFoundException, DocumentException{
        //Preparando Documento
        Document documento = new Document();
        FileOutputStream ficheroPdf = new FileOutputStream(PATH);
        PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(5);
        
        documento.open();
        //Llenar PDF
       documento.addTitle("Evaluación de "+fe.estado+","+fe.municipio);
        Paragraph p = new Paragraph("Datos de la región "+fe.estado+","+fe.municipio,
                FontFactory.getFont("arial",   // fuente
                        22,                            // tamaño
                        Font.BOLD,                   // estilo
                        BaseColor.BLUE));
       p.setAlignment(Chunk.ALIGN_CENTER);
       documento.add(p);
       p = new Paragraph(" ");
       documento.add(p);
        try {
            Image foto = Image.getInstance("src/iconos/logo_buap.jpg");
            foto.scaleToFit(500, 290);
            foto.setAlignment(Chunk.ALIGN_MIDDLE);
	documento.add(foto);
        } catch (BadElementException ex) {
            Logger.getLogger(GenerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GenerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        p = new Paragraph(" ");
        documento.add(p);
        PdfPTable tabla=new PdfPTable(2);
        //Llenado de tabla
        tabla.addCell(Celda("Criterios Especificos",BaseColor.CYAN));
        tabla.addCell(Celda("Valor", BaseColor.CYAN));
        tabla.addCell("I. Patrimonio natural y cultural de la región");
        tabla.addCell(Celda(String.valueOf(fe.P1()),BaseColor.RED));
        tabla.addCell("1. Conservación Ambiental");
        tabla.addCell(String.valueOf(fe.val1_1));
        tabla.addCell("2. Singularidad del Destino");
        tabla.addCell(String.valueOf(fe.val1_2));
        tabla.addCell("3. Diversidad del Entorno");
        tabla.addCell(String.valueOf(fe.val1_3));
        tabla.addCell("4. Atractivos Naturales");
        tabla.addCell(String.valueOf(fe.val1_4));
        tabla.addCell("5. Atractivos Culturales");
        tabla.addCell(String.valueOf(fe.val1_5));
        tabla.addCell("Total");
        tabla.addCell(Celda(String.valueOf(fe.val1_1 + fe.val1_2 + fe.val1_3 + fe.val1_4 + fe.val1_5),BaseColor.ORANGE));
        
        tabla.addCell("II. Potencial de vinculación con los mercados regionales y nacionales");
        tabla.addCell(Celda(String.valueOf(fe.P2()),BaseColor.RED));
        tabla.addCell("1. Accesibilidad");
        tabla.addCell(String.valueOf(fe.val2_1));
        tabla.addCell("2. Proximidad");
        tabla.addCell(String.valueOf(fe.val2_2));
        tabla.addCell("3. Inserción a la oferta turística.");
        tabla.addCell(String.valueOf(fe.val2_3));
        tabla.addCell("4. Atractividad");
        tabla.addCell(String.valueOf(fe.val2_4));
        tabla.addCell("Total");
        tabla.addCell(Celda(String.valueOf(fe.val2_1 + fe.val2_2 + fe.val2_3 + fe.val2_4),BaseColor.ORANGE));
        
        tabla.addCell("III. Diversidad de oportunidades para el desarrollo del turismo");
        tabla.addCell(Celda(String.valueOf(fe.P3()),BaseColor.RED));
        tabla.addCell("1. Estacionalidad");
        tabla.addCell(String.valueOf(fe.val3_1));
        tabla.addCell("2. Tipo de Turista");
        tabla.addCell(String.valueOf(fe.val3_2));
        tabla.addCell("3. Número de Actividades");
        tabla.addCell(String.valueOf(fe.val3_3));
        tabla.addCell("4. Servicios Básicos");
        tabla.addCell(String.valueOf(fe.val3_4));
        tabla.addCell("Total");
        tabla.addCell(Celda(String.valueOf(fe.val3_1 + fe.val3_2 + fe.val3_3 + fe.val3_4),BaseColor.ORANGE));
        
        tabla.addCell("IV. Legalidad e institucionalidad territorial");
        tabla.addCell(Celda(String.valueOf(fe.P4()),BaseColor.RED));
        tabla.addCell("1. Compromiso de Autoridades");
        tabla.addCell(String.valueOf(fe.val4_1));
        tabla.addCell("2. Tenencia de la Tierra");
        tabla.addCell(String.valueOf(fe.val4_2));
        tabla.addCell("3. Conflictos en la región");
        tabla.addCell(String.valueOf(fe.val4_3));
        tabla.addCell("4. Seguridad del Turista");
        tabla.addCell(String.valueOf(fe.val4_4));
        tabla.addCell("Total");
        tabla.addCell(Celda(String.valueOf(fe.val4_1 + fe.val4_2 + fe.val4_3 + fe.val4_4),BaseColor.ORANGE));
        
        tabla.addCell("Ponderación Total del Destino:");
        tabla.addCell(Celda(String.valueOf(fe.Ptotal())+"%",BaseColor.RED));
        
        float[] medidaCeldas = {2f, 1f};
        tabla.setWidths(medidaCeldas);
        
        documento.add(tabla);
        
        documento.newPage();
         try {
            BufferedImage bufferedImage = fe.grafica().createBufferedImage(500, 290);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            Image foto=Image.getInstance(baos.toByteArray());
            foto.scaleToFit(500, 290);
            foto.setAlignment(Chunk.ALIGN_MIDDLE);
	documento.add(foto);
        } catch (BadElementException ex) {
            Logger.getLogger(GenerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GenerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       //Cierre
       documento.close();
        
    }
    
}
