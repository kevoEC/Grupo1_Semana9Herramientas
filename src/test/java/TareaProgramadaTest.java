import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TareaProgramadaTest {

    @Test
    public void testCrearTareaProgramada() {
        TareaProgramada tarea = new TareaProgramada(
                "Estudiar", "Preparar examen",
                LocalDate.of(2025, 5, 10), Prioridad.ALTA);

        assertEquals("Estudiar", tarea.getTitulo());
        assertEquals("Preparar examen", tarea.getDescripcion());
        assertEquals(LocalDate.of(2025, 5, 10), tarea.getFechaLimite());
        assertEquals(Prioridad.ALTA, tarea.getPrioridad());
    }
}
