public class Libro {
	private String libro;
	private String autor;
	private String editorial;

	private String ISBN;

	public Libro(String libro,String ISBN, String autor, String editorial) {
		this.libro = libro;
		this.ISBN = ISBN;
		this.autor = autor;
		this.editorial = editorial;

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

	public String getISBN() {
		return this.ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
}