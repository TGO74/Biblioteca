

import java.util.ArrayList;


public class Biblioteca {

    private ArrayList<Libro> listaDeLibros;
    private String nombreBiblioteca;
    private String direccionBiblioteca;




    //Constructor

    public Biblioteca(String nombreBiblioteca,String direccionBiblioteca){

        this.nombreBiblioteca= nombreBiblioteca;
        this.direccionBiblioteca= direccionBiblioteca;
        this.listaDeLibros= new ArrayList<>();

    }


    //getters and setters

    public String getNombreBiblioteca(){


        return nombreBiblioteca;

    }

    public String getDireccion(){


        return direccionBiblioteca;

    }

    public void setNombreBiblioteca(String nombreBiblioteca){

        this.nombreBiblioteca=nombreBiblioteca;

    }
    public void setDireccionBiblioteca(String direccionBiblioteca){

        this.direccionBiblioteca=direccionBiblioteca;

    }




public ArrayList<Libro> getLibros(){
    return listaDeLibros;
    }


    public boolean agregarLibro(Libro libro){

        if (!libroExiste(libro)) {
            this.listaDeLibros.add(libro);
            return true;   }
        else {
            System.out.println("El libro ya existe en la bibliotea" +nombreBiblioteca);
            return false;   }

    }

    public Libro buscarLibro(Libro libro){

        for (Libro l : listaDeLibros) {
            if(!libro.getNombreLibro().equals(l.getNombreLibro())) {
                System.out.println("El libro no se encuentra");
            }

        }

        System.out.println("El libro "+libro+"está disponible");

        return libro;

    }

    public ArrayList<Libro> obtenerLibroPorAutor(String autor){
        ArrayList<Libro> librosPorAutor = new ArrayList<>();

        for (Libro libro : this.listaDeLibros) {
            if(libro.getNombreAutor().equals((autor))) {
                librosPorAutor.add(libro);
            }
        }

        return listaDeLibros;
    }

    public boolean libroExiste(Libro libro){

        for (Libro l : listaDeLibros) {
            if(libro.getISBN().equals(l.getISBN())) {
                return true;
            }
        }

        return false;
    }
    
public Prestamo


}