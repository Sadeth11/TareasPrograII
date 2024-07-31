import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private HashMap<String, Usuario> usuarios;
    private LinkedList<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new HashMap<>();
        prestamos = new LinkedList<>();
    }

    // Métodos para gestionar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null) {
            libros.remove(libro);
        }
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public List<Libro> listarLibros() {
        return new ArrayList<>(libros);
    }

    // Métodos para gestionar usuarios
    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNumeroIdentificacion(), usuario);
    }

    public void actualizarUsuario(String numeroIdentificacion, Usuario usuarioActualizado) {
        usuarios.put(numeroIdentificacion, usuarioActualizado);
    }

    public Usuario consultarUsuario(String numeroIdentificacion) {
        return usuarios.get(numeroIdentificacion);
    }

    // Métodos para gestionar préstamos
    public void realizarPrestamo(Libro libro, Usuario usuario) {
        LocalDate fechaPrestamo = LocalDate.now();
        LocalDate fechaDevolucion = fechaPrestamo.plusDays(14); // Ejemplo: préstamo de 14 días
        Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion);
        prestamos.add(prestamo);
    }

    public void devolverLibro(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    public List<Prestamo> consultarPrestamosActivos() {
        return new ArrayList<>(prestamos);
    }
}
