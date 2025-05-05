import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReporteTareasTest {

    @Test
    public void testContarTareasPorPrioridad() {
        List<TareaProgramada> tareas = List.of(
                new TareaProgramada("T1", "desc", LocalDate.now(), Prioridad.ALTA),
                new TareaProgramada("T2", "desc", LocalDate.now(), Prioridad.MEDIA),
                new TareaProgramada("T3", "desc", LocalDate.now(), Prioridad.ALTA));

        long alta = ReporteTareas.contarTareasPorPrioridad(tareas, Prioridad.ALTA);
        long media = ReporteTareas.contarTareasPorPrioridad(tareas, Prioridad.MEDIA);
        long baja = ReporteTareas.contarTareasPorPrioridad(tareas, Prioridad.BAJA);

        assertEquals(2, alta);
        assertEquals(1, media);
        assertEquals(0, baja);
    }

    @Test
    public void testFiltrarTareasAlta() {
        List<TareaProgramada> tareas = List.of(
                new TareaProgramada("Alta", "1", LocalDate.now(), Prioridad.ALTA),
                new TareaProgramada("Media", "2", LocalDate.now(), Prioridad.MEDIA));

        List<Tarea> resultado = ReporteTareas.tareasConPrioridadAlta(tareas);
        assertEquals(1, resultado.size());
        assertEquals("Alta", resultado.get(0).getTitulo());
    }
}
