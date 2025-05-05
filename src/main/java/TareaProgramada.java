import java.time.LocalDate;

public class TareaProgramada extends Tarea {
    private LocalDate fechaLimite;
    private Prioridad prioridad;

    public TareaProgramada(String titulo, String descripcion, LocalDate fechaLimite, Prioridad prioridad) {
        super(titulo, descripcion);
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }
}
