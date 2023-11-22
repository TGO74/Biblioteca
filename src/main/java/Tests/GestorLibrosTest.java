package Tests;
import dato.GestorLibros;
import modelo.Biblioteca;
import modelo.Libro;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class GestorLibrosTest {

    public static void main(String[] args) {
        testLeerArchivoLibros();
    }

    private static void testLeerArchivoLibros() {
        // Crear una biblioteca para la prueba
        Biblioteca biblioteca = new Biblioteca("Biblioteca de Prueba", "Dirección de Prueba");

        // Se asume que hay un archivo de prueba con datos válidos
        String direccionArchivo = "src/test/resources/libros_prueba.txt";

        try {
            // Leer el archivo de libros
            GestorLibros.leerArchivoLibros(biblioteca, direccionArchivo);

            // Verificar que se hayan cargado libros en la biblioteca
            if (biblioteca.getLibros().size() > 0) {
                System.out.println("Prueba de leerArchivoLibros exitosa. Libros cargados correctamente.");
            } else {
                System.err.println("Error en la prueba de leerArchivoLibros. No se cargaron libros.");
            }
        } catch (IOException e) {
            System.err.println("Error en la prueba de leerArchivoLibros. Excepción: " + e.getMessage());
        }
    }
}
