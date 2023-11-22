package modelo;
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

//Método para cambiar edad
    public void cambiarEdad(int edad) {
        this.edad = edad;
    }

    //Método para cambiar nombre
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    //Método para cambiar apellido
    public void cambiarApellido(String apellido) {
        this.apellido = apellido;
    }

    //Método para cambiar rut
    public void cambiarRut(String rut) {
        this.rut = rut;
    }

    //Método para obtener numero telefonico
    public String obtenerNumeroTelefonico() {
        return this.numeroTelefonico;
    }

    //Método para obtener direccion
    public String obtenerDireccion() {
        return this.direccion;
    }

    //Método para obtener edad
    public int obtenerEdad() {
        return this.edad;
    }

    //Método para obtener nombre
    public String obtenerNombre() {
        return this.nombre;
    }

    //Método para obtener apellido
    public String obtenerApellido() {
        return this.apellido;
    }

    //Método para obtener rut
    public String obtenerRut() {
        return this.rut;
    }

    //Método para obtener nombre completo
    public String obtenerNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    //Método para obtener datos
    public String obtenerDatos() {
        return "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido + "\n" + "Rut: " + this.rut + "\n" + "Edad: " + this.edad + "\n" + "Dirección: " + this.direccion + "\n" + "Número telefónico: " + this.numeroTelefonico;
    }

    //Método para obtener datos de persona
    public String obtenerDatosPersona() {
        return "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido + "\n" + "Rut: " + this.rut + "\n" + "Edad: " + this.edad + "\n" + "Dirección: " + this.direccion + "\n" + "Número telefónico: " + this.numeroTelefonico;
    }






}
