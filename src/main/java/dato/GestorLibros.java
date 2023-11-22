package dato;

import modelo.*;

import java.io.*;

    public class GestorLibros{

    public static void leerArchivoLibros(Biblioteca biblioteca, String direccionArchivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(direccionArchivo))) {
            String textoArchivo;
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                biblioteca.getLibros().add(new Libro(data[0], data[1], data[2], data[3]));
            }
        } catch (IOException e) {
            throw new IOException("Error al leer el archivo de libros", e);
        }
    }

    public static boolean registrarDato(Libro libro, String direccionArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivo, true))) {
            // Si el documento no es nuevo y tiene datos registrados, añadir una nueva línea
            if (new File(direccionArchivo).exists()) {
                bw.newLine();
            }
            bw.write(libro.toString());
            return true;
        } catch (IOException e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }
}
