import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTareasTest {

    @Test
    public void testValidarTareaValida() {
        Tarea tarea = new Tarea("Tarea 1", "Descripción");
        assertTrue(ValidadorTareas.validarTarea(tarea));
    }

    @Test
    public void testValidarTareaInvalida() {
        assertFalse(ValidadorTareas.validarTarea(new Tarea("", "Desc")));
        assertFalse(ValidadorTareas.validarTarea(null));
    }

    @Test
    public void testValidarUsuarioValido() {
        Usuario usuario = new Usuario("Ana", "ana@mail.com");
        assertTrue(ValidadorTareas.validarUsuario(usuario));
    }

    @Test
    public void testValidarUsuarioInvalido() {
        Usuario u1 = new Usuario("B", "correoSinArroba");
        Usuario u2 = new Usuario("C", null);
        assertFalse(ValidadorTareas.validarUsuario(u1));
        assertFalse(ValidadorTareas.validarUsuario(u2));
    }
}
