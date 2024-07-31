import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear y agregar libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "Editorial A", 1605, 1000);
        Libro libro2 = new Libro("1984", "George Orwell", "Editorial B", 1949, 328);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear y registrar usuarios
        Usuario usuario1 = new Usuario("Juan", "Pérez", "juan.perez@example.com", "12345");
        Usuario usuario2 = new Usuario("María", "García", "maria.garcia@example.com", "67890");
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Realizar préstamos
        biblioteca.realizarPrestamo(libro1, usuario1);
        biblioteca.realizarPrestamo(libro2, usuario2);

        // Consultar y listar libros
        List<Libro> libros = biblioteca.listarLibros();
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        // Consultar préstamos activos
        List<Prestamo> prestamosActivos = biblioteca.consultarPrestamosActivos();
        for (Prestamo prestamo : prestamosActivos) {
            System.out.println(prestamo);
        }

        // Devolver un libro
        Prestamo prestamo1 = prestamosActivos.get(0);
        biblioteca.devolverLibro(prestamo1);
    }
}
