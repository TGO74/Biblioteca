
import java.util.ArrayList;

public class Bibliotecario extends Persona{

	private int idBibliotecario;
	private String jornada;

	private float sueldo;


	ArrayList<Prestamo> prestamosBibliotecario = new ArrayList<Prestamo>();



	public Bibliotecario(String nombre,String apellido,int edad,String rut,String direccion,String numeroTelefonico) {
		super(nombre,apellido,rut,edad,direccion,numeroTelefonico);


	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}