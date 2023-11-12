import java.util.Date;
import java.util.ArrayList;

public class Biblioteca {
	private String nombreBiblioteca;
	private java.util.ArrayList<Libro> listaDeLibros;

	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	private String direccionBiblioteca;
	public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	public ArrayList<Libro> librosPrestados = new ArrayList<Libro>();
	public ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();


	/**
	 * Constructor
	 */
	public Biblioteca(String nombreBiblioteca, String direccionBiblioteca) {

		this.nombreBiblioteca = nombreBiblioteca;
		this.direccionBiblioteca = direccionBiblioteca;
		this.listaDeLibros = new ArrayList<Libro>();
		this.usuarios = new ArrayList<Usuario>();
		this.prestamos = new ArrayList<Prestamo>();
		this.bibliotecarios = new ArrayList<Bibliotecario>();

	}

	public String getDireccion() {
		return this.direccionBiblioteca;
	}

	public java.util.ArrayList<Libro> getLibros() {
		return this.listaDeLibros;
	}


	public ArrayList<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}

	public String getNombreBiblioteca() {
		return this.nombreBiblioteca;
	}

	public String getDireccionBiblioteca() {
		return this.direccionBiblioteca;
	}

	public void setDireccionBiblioteca(String direccionBiblioteca) {
		this.direccionBiblioteca = direccionBiblioteca;
	}


	public void setListaDeLibros(ArrayList<Libro> listaDeLibros) {
		this.listaDeLibros = listaDeLibros;
	}

	public ArrayList<Libro> getListaDeLibros() {
		return this.listaDeLibros;
	}

	public void setBibliotecarios(ArrayList<Bibliotecario> bibliotecarios) {
		this.bibliotecarios = bibliotecarios;
	}

	public ArrayList<Bibliotecario> getBibliotecarios() {
		return this.bibliotecarios;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return this.prestamos;
	}

	public ArrayList<Libro> obtenerLibroPorAutor(String autor) {
		ArrayList<Libro> librosPorAutor = new ArrayList<>();

		for (Libro libro : this.listaDeLibros) {
			if (libro.getNombreAutor().equals((autor))) {
				librosPorAutor.add(libro);
			}
		}

		return listaDeLibros;
	}

	public boolean agregarLibro(Libro libro) {
		if (!libroExiste(libro)) {
			this.listaDeLibros.add(libro);
			return true;
		} else {
			System.out.println("El libro ya existe en la bibliotea" + nombreBiblioteca);
			return false;
		}

	}

	public Libro buscarLibro(Libro libro) {

		for (Libro l : listaDeLibros) {
			if (!libro.getNombreLibro().equals(l.getNombreLibro())) {
				System.out.println("El libro no se encuentra");
			}

		}

		System.out.println("El libro " + libro + "está disponible");

		return libro;

	}

	public boolean libroExiste(Libro libro) {

		for (Libro l : listaDeLibros) {
			if (libro.getISBN().equals(l.getISBN())) {
				return true;
			}
		}

		return false;
	}

	public Prestamo generarPrestamo(Bibliotecario bibliotecario, Usuario usuario, Libro libro, Date fechaInicio, Date fechaTermino) {
		Prestamo prestamo = new Prestamo(bibliotecario, usuario, libro, fechaInicio, fechaTermino);

		// Agregar libro a la lista de libros prestados
		librosPrestados.add(libro);

		// Agregar el préstamo a la lista de préstamos del usuario
		usuario.agregarPrestamoUsuario(prestamo);

		//Cambiar estado del libro
		libro.setEstadoLibro("Prestado");

		return prestamo;
	}

}