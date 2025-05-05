import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testCrearUsuarioValido() {
        Usuario usuario = new Usuario("Kevin", "kevin@correo.com");
        assertEquals("Kevin", usuario.getNombre());
        assertEquals("kevin@correo.com", usuario.getCorreo());
    }
}
