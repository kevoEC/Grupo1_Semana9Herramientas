public class ValidadorTareas {

    public static boolean validarTarea(Tarea tarea) {
        return tarea != null && tarea.getTitulo() != null && !tarea.getTitulo().isBlank();
    }

    public static boolean validarUsuario(Usuario usuario) {
        return usuario != null && usuario.getCorreo() != null && usuario.getCorreo().contains("@");
    }
}
