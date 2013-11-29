package pe.joedayz.javaee7.cdi.ejemplo16;


public class Libro16 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private String titulo;
  private Float precio;
  private String descripcion;
  private String isbn;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Libro16() {
  }

  public Libro16(String title, Float price, String description) {
    this.titulo = title;
    this.precio = price;
    this.descripcion = description;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  
  
  public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

  // ======================================
  // =         hash, equals, toString     =
  // ======================================

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("Libro16");
    sb.append(", titulo='").append(titulo).append('\'');
    sb.append(", precio=").append(precio);
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append(", isbn='").append(isbn).append('\'');
    sb.append('}');
    return sb.toString();
  }


}