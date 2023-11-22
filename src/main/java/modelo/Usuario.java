package modelo;

import java.util.ArrayList;
public class Usuario extends Persona{

	private ArrayList<Prestamo> prestamosUsuario = new ArrayList<Prestamo>();
	private Biblioteca biblioteca;


	public Usuario(String nombre,String apellido,int edad,String rut,String direccion,String numeroTelefonico, Biblioteca biblioteca) {
		super(nombre, apellido, rut, edad, direccion, numeroTelefonico);

		this.biblioteca = biblioteca;

	}

	public ArrayList<Prestamo> getPrestamos() {
		return this.prestamosUsuario;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamosUsuario) {
		this.prestamosUsuario = prestamosUsuario;
	}

	//Método agregar un prestamo a la lista de prestamos del usuario
	public void agregarPrestamoUsuario(Prestamo prestamo) {
		this.prestamosUsuario.add(prestamo);
	}


public String obtenerDatosPersona() {
	return "Nombre: " + this.nombre + " " + this.apellido + "\n" + "Rut: " + this.rut + "\n" + "Edad: " + this.edad + "\n" + "Dirección: " + this.direccion + "\n" + "Número telefónico: " + this.numeroTelefonico + "Biblioteca: " + this.biblioteca.getNombreBiblioteca() + "\n" +"Lista de libros prestados: " + this.prestamosUsuario + "\n" + "Lista de correos: " + this.correos;


}
}