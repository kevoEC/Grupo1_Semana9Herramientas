import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorUsuariosTest {

    @Test
    public void testRegistrarYObtenerUsuario() {
        GestorUsuarios gestor = new GestorUsuarios();
        Usuario usuario = new Usuario("Laura", "laura@correo.com");

        gestor.registrarUsuario(usuario);
        Usuario obtenido = gestor.obtenerUsuario("laura@correo.com");

        assertNotNull(obtenido);
        assertEquals("Laura", obtenido.getNombre());
    }

    @Test
    public void testRegistrarUsuarioDuplicadoLanzaExcepcion() {
        GestorUsuarios gestor = new GestorUsuarios();
        Usuario usuario = new Usuario("Ana", "ana@correo.com");
        gestor.registrarUsuario(usuario);

        assertThrows(IllegalArgumentException.class, () -> {
            gestor.registrarUsuario(new Usuario("Ana2", "ana@correo.com"));
        });
    }
}
