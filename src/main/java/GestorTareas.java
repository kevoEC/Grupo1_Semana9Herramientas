import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

  private List<Tarea> tareas = new ArrayList<>();

  public void agregarTarea(Tarea tarea) {
    if (tarea == null || tarea.getTitulo() == null) {
      throw new IllegalArgumentException("La tarea o su título no puede ser nula");
    }
    tareas.add(tarea);
  }

  public int obtenerTotalTareas() {
    return tareas.size();
  }

  public void eliminarTarea(int index) {
    if (index < 0 || index >= tareas.size()) {
      throw new IndexOutOfBoundsException("Índice fuera de rango");
    }
    tareas.remove(index);
  }

  public List<Tarea> obtenerTodasLasTareas() {
    return new ArrayList<>(tareas); // retornar copia para evitar mutación externa
  }

  public void limpiarTareas() {
    tareas.clear();
  }
}
