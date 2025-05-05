public class Tarea {
  private String titulo;
  private String descripcion;

  public Tarea(String titulo, String descripcion) {
    if (titulo == null || titulo.isBlank()) {
      throw new IllegalArgumentException("El título no puede ser vacío o nulo");
    }
    this.titulo = titulo;
    this.descripcion = descripcion;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setTitulo(String titulo) {
    if (titulo == null || titulo.isBlank()) {
      throw new IllegalArgumentException("Título inválido");
    }
    this.titulo = titulo;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}