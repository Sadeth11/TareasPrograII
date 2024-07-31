import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Getters y Setters
    public Libro getLibro() { return libro; }
    public Usuario getUsuario() { return usuario; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", usuario=" + usuario +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
