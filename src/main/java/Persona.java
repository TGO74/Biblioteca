
import java.util.ArrayList;
public class Persona {
    protected String nombre;
    protected String apellido;
    protected String rut;

    protected int edad;

    protected String direccion;

    protected String numeroTelefonico;


    //Constructor
    public Persona(String nombre, String apellido, String rut, int edad, String direccion, String numeroTelefonico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    //Getters y Setters
    public  String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getRut() {
        return this.rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }

    //Método para cambiar numero telefonico
    public void cambiarNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    //Método para cambiar direccion
    public void cambiarDireccion(String direccion) {
        this.direccion = direccion;
    }






}
