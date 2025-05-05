import java.util.List;
import java.util.stream.Collectors;

public class ReporteTareas {

    public static List<Tarea> tareasConPrioridadAlta(List<TareaProgramada> tareas) {
        return tareas.stream()
                .filter(t -> t.getPrioridad() == Prioridad.ALTA)
                .collect(Collectors.toList());
    }

    public static long contarTareasPorPrioridad(List<TareaProgramada> tareas, Prioridad prioridad) {
        return tareas.stream()
                .filter(t -> t.getPrioridad() == prioridad)
                .count();
    }
}
