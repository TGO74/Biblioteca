

import java.util.ArrayList;


public class Biblioteca {

    private ArrayList<Libro> listaDeLibros;
    private String nombreBiblioteca;
    private String direccionBiblioteca;

    //Constructor

    public Biblioteca(String nombreBiblioteca,String direccion){

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






}