public class Libro {
	private String libro;
	private String autor;
	private String editorial;

	public Libro(String libro, String autor, String editorial) {
		throw new UnsupportedOperationException();
	}

	/**
	 * getters and setters
	 */
	public String getNombreLibro() {
		throw new UnsupportedOperationException();
	}

	public String getNombreAutor() {
		throw new UnsupportedOperationException();
	}

	public void setNombreLibro(String libro) {
		throw new UnsupportedOperationException();
	}

	public void setNombreAutor(String autor) {
		throw new UnsupportedOperationException();
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEditorial() {
		return this.editorial;
	}
}