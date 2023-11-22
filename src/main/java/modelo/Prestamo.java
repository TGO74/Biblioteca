package modelo;
import java.util.Date;
public class Prestamo {
	private Bibliotecario bibliotecario;

	private Biblioteca biblioteca;
	private Usuario usuario;
	private Libro libro;
	private Date fechaInicio;
	private Date fechaTermino;



	public Prestamo(Bibliotecario bibliotecario, Usuario usuario, Libro libro, Date fechaInicio, Date fechaTerminp) {
		this.bibliotecario = bibliotecario;
		this.usuario = usuario;
		this.libro = libro;
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;

	}
	public Bibliotecario getBibliotecarioPrestamo() {
		throw new UnsupportedOperationException();
	}

	public void setBibliotecarioPrestamo(String bibliotecario) {
		throw new UnsupportedOperationException();
	}


	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaTermino() {
		return this.fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Usuario getUsuarioPrestamo() {
		return this.usuario;
	}

	public void setUsuarioPrestamo(Usuario usuario) {
		this.usuario = usuario;
	}

	public Biblioteca getBiblioteca() {
		return this.biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	public String toString() {
		System.out.println("Prestamo de libro");
		System.out.println("Biblioteca: " + this.biblioteca.getNombreBiblioteca());
		System.out.println("Fecha: " + this.fechaInicio.toString());
		System.out.println(this.usuario.toString());
		System.out.println("-------------------------------------------------");
		System.out.println("Libro: " + this.libro.toString());
		System.out.println(this.libro.toString());
		System.out.println("Vendedor: " + this.bibliotecario.getNombre());
		return "";

	}

}