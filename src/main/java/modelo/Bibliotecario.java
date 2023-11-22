package modelo;
import java.util.ArrayList;

public class Bibliotecario extends Persona{

	private int idBibliotecario;
	private String jornada;

	private float sueldo;


	ArrayList<Prestamo> prestamosBibliotecario = new ArrayList<Prestamo>();



	public Bibliotecario(String nombre,String apellido,int edad,String rut,String direccion,String numeroTelefonico) {
		super(nombre,apellido,rut,edad,direccion,numeroTelefonico);


	}

	public int getIdBibliotecario() {
		return this.idBibliotecario;
	}

	public void setIdBibliotecario(int idBibliotecario) {
		this.idBibliotecario = idBibliotecario;
	}

	public String getJornada() {
		return this.jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public float getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public ArrayList<Prestamo> getPrestamosBibliotecario() {
		return this.prestamosBibliotecario;
	}

	public void setPrestamosBibliotecario(ArrayList<Prestamo> prestamosBibliotecario) {
		this.prestamosBibliotecario = prestamosBibliotecario;
	}

	//Método agregar un prestamo a la lista de prestamos del usuario


	public void agregarPrestamoBibliotecario(Prestamo prestamo) {
		this.prestamosBibliotecario.add(prestamo);
	}





	public String obtenerDatosPersona() {
			return "Nombre: " + this.nombre + " " + this.apellido + "\n" + "Rut: " + this.rut + "\n" + "Edad: " + this.edad + "\n" + "Dirección: " + this.direccion + "\n" + "Número telefónico: " + this.numeroTelefonico + "Biblioteca: " + this.biblioteca.getNombreBiblioteca() + "\n" + "ID bibliotecario: " + this.idBibliotecario + "\n" + "Jornada: " + this.jornada + "\n" + "Sueldo: " + this.sueldo + "\n" + "Lista de libros prestados: " + this.prestamosBibliotecario + "\n" + "Lista de correos: " + this.correos;


	}



}