
public class Tarea {

  private String titulo;
  private String descripcion; // Variable no utilizada.

  public void setTitulo(String titulo) {
    if (titulo == null) {
      throw new NullPointerException("El título no puede ser nulo"); // Introducir posible NullPointerException.
    }
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void metodoInutil() { // Método innecesario.
    System.out.println("Este método no hace nada relevante.");
  }
}