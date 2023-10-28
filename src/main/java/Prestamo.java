import java.util.Date;
public class Prestamo {
	private Bibliotecario bibliotecario;
	private Usuario usuario;
	private Libro libro;
	private Date fechaInicio;
	private Date fechaTermino;



	public Prestamo(Bibliotecario bibliotecario, Object usuario_Usuario, Object libro_Libro, Date fechaInicio, Date fechaTerminp) {
		throw new UnsupportedOperationException();
	}

	public Bibliotecario getBibliotecario() {
		throw new UnsupportedOperationException();
	}

	public void setBibliotecario(String bibliotecario) {
		throw new UnsupportedOperationException();
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
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
}