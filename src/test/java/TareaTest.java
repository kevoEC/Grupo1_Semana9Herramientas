import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TareaTest {

    @Test
    public void testCrearTareaValida() {
        Tarea tarea = new Tarea("Estudiar", "Preparar examen");
        assertEquals("Estudiar", tarea.getTitulo());
        assertEquals("Preparar examen", tarea.getDescripcion());
    }

    @Test
    public void testSetTituloValido() {
        Tarea tarea = new Tarea("x", "y");
        tarea.setTitulo("Nuevo título");
        assertEquals("Nuevo título", tarea.getTitulo());
    }

    @Test
    public void testTituloNuloLanzaExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Tarea(null, "desc");
        });
        assertTrue(exception.getMessage().contains("no puede ser vacío"));
    }
}
