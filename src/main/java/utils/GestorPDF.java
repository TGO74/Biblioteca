package utils;
import modelo.Prestamo;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.IOException;
import java.util.Date;

public class GestorPDF {
    public void generarPrestamoPDF(Prestamo prestamo)
            throws IOException {
        //Se crea un nuevo documento
        PDDocument documento = new PDDocument();
        //Al documento se le crea y agrega una nueva página, en este caso en formato A6
        PDPage pagina = new PDPage(PDRectangle.A6);
        documento.addPage(pagina);
        //Se genera un arreglo de líneas que va a tener el archivo PDF
        String[] lineasPdf = this.obtenerLíneasPdf(prestamo);
        this.rellenarPDF(documento, pagina, lineasPdf);
        //Se guarda el documento en la ubicación descrita
        documento.save(this.generarNombrePdf(prestamo.getFechaInicio()));
        documento.close();
    }

    public void rellenarPDF(PDDocument documento, PDPage pagina, String[] lineasPDF) {
        //Por cada linea del arreglo, se irá agregando texto
        try (PDPageContentStream contenidoPagina = new PDPageContentStream(documento, pagina)) {
            for (int linea = 0; linea < lineasPDF.length; linea++) {
                contenidoPagina.beginText();
                //Se define en que posición del documento estará el texto
                contenidoPagina.newLineAtOffset(10, pagina.getMediaBox().getHeight() - (10 * linea));
                contenidoPagina.setFont(PDType1Font.HELVETICA_BOLD, 8f);
                //Agrega el texto al documento
                contenidoPagina.showText(lineasPDF[linea]);
                contenidoPagina.endText();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public String[] obtenerLíneasPdf(Prestamo prestamo){
        String[] lineasPdf= new String[8];
        lineasPdf[0]="Prestamo de libro";
        lineasPdf[1]="Biblioteca: "+prestamo.getBiblioteca().getNombreBiblioteca();
        lineasPdf[2]="Fecha: "+prestamo.getFechaInicio().toString();
        lineasPdf[3]=prestamo.getUsuarioPrestamo().toString(); lineasPdf[4]="-------------------------------------------------";
        lineasPdf[5]="Libro: "+prestamo.getLibro().toString();
        lineasPdf[6]=prestamo.getLibro().toString();
        lineasPdf[7]="Vendedor: "+prestamo.getBibliotecarioPrestamo().getNombre();
        return lineasPdf;

    }

        private String generarNombrePdf(Date fecha){
            System.out.println(fecha.toString());
            String fechaArchivo = fecha.toString();
            fechaArchivo = fechaArchivo.replace(" ", "").replace(":", "");
            String nombreArchivo = "target/" + "Prestamo" + fechaArchivo + ".pdf";
            return nombreArchivo;

        }

    }
