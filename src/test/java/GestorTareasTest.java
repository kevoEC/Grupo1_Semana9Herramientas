import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTareasTest {

  @Test
  public void testAgregarTareaValida() {
    GestorTareas gestor = new GestorTareas();
    Tarea tarea = new Tarea("Comprar pan", "Ir a la panadería antes de las 10");
    gestor.agregarTarea(tarea);
    assertEquals(1, gestor.obtenerTotalTareas());
  }

  @Test
  public void testEliminarTareaValida() {
    GestorTareas gestor = new GestorTareas();
    gestor.agregarTarea(new Tarea("A", "B"));
    gestor.eliminarTarea(0);
    assertEquals(0, gestor.obtenerTotalTareas());
  }

  @Test
  public void testEliminarTareaInvalidaLanzaExcepcion() {
    GestorTareas gestor = new GestorTareas();
    Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
      gestor.eliminarTarea(5);
    });
    assertTrue(exception.getMessage().contains("fuera de rango"));
  }

  @Test
  public void testLimpiarTareas() {
    GestorTareas gestor = new GestorTareas();
    gestor.agregarTarea(new Tarea("A", "B"));
    gestor.limpiarTareas();
    assertEquals(0, gestor.obtenerTotalTareas());
  }
}
