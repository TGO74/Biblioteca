import java.util.ArrayList;

public class Biblioteca {
	private String nombreBiblioteca;
	private java.util.ArrayList<Libro> listaDeLibros;
	private String direccionBiblioteca;
	private ArrayList<Usuario> usuarios;
	public Usuario unnamed_Usuario_;
	public Bibliotecario unnamed_Bibliotecario_;
	public ArrayList<Libro> libros = new ArrayList<Libro>();

	/**
	 * Constructor
	 */
	public Biblioteca(String nombreBiblioteca, String direccionBiblioteca) {
		throw new UnsupportedOperationException();
	}

	public String getDireccion() {
		throw new UnsupportedOperationException();
	}

	public java.util.ArrayList<Libro> getLibros() {
		throw new UnsupportedOperationException();
	}

	public void generarPrestamo(Object bibliotecario_bibliotecario, Object usuario_usuario, Object libro_libro, Object date_fechaInicio, Object date_fechaTermino) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Usuario> getUsuarios() {
		throw new UnsupportedOperationException();
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		throw new UnsupportedOperationException();
	}

	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}

	public String getNombreBiblioteca() {
		return this.nombreBiblioteca;
	}

	public void setDireccionBiblioteca(String direccionBiblioteca) {
		this.direccionBiblioteca = direccionBiblioteca;
	}
}