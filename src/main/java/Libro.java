import java.util.ArrayList;

public class Libro {

    private String libro;
    private String autor;

    private String ISBN;

    private String editorial;

    public Libro(String libro,String autor, String editorial){

        this.libro= libro;
        this.autor= autor;
        this.editorial=editorial;


    }

    //getters and setters

    public String getNombreLibro(){


        return libro;

    }

    public String getNombreAutor(){


        return autor;

    }

    public String getEditorial(){


        return editorial;

    }

    public String getISBN(){


        return ISBN;

    }

    public void setNombreLibro(String libro){

        this.libro=libro;

    }

    public void setNombreAutor(String autor){

        this.autor=autor;

    }
    public void setEditorial(String editorial){

        this.editorial=editorial;

    }
    public void setISBN(String ISBN){

        this.ISBN=ISBN;

    }
}
