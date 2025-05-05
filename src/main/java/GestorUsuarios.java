import java.util.HashMap;
import java.util.Map;

public class GestorUsuarios {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void registrarUsuario(Usuario usuario) {
        if (usuarios.containsKey(usuario.getCorreo())) {
            throw new IllegalArgumentException("Usuario ya registrado");
        }
        usuarios.put(usuario.getCorreo(), usuario);
    }

    public Usuario obtenerUsuario(String correo) {
        return usuarios.get(correo);
    }

    public int totalUsuarios() {
        return usuarios.size();
    }
}
