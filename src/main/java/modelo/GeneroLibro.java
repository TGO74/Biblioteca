package modelo;

public enum GeneroLibro {
    CIENCIA_FICCION("Ciencia Ficcion"),
    DRAMA("Drama"),
    TERROR("Terror"),
    AVENTURA("Aventura"),
    HISTORIA("Historia"),
    ROMANCE("Romance"),
    AUTOAYUDA("Autoayuda"),
    INFANTIL("Infantil");

    private final String generoLibro;

    GeneroLibro(String generoLibro) {
        this.generoLibro = generoLibro;
    }

    public String getGeneroLibro() {
        return this.generoLibro;
    }
}
