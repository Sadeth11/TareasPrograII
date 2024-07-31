public class Usuario {
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String numeroIdentificacion;

    public Usuario(String nombre, String apellido, String correoElectronico, String numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCorreoElectronico() { return correoElectronico; }
    public String getNumeroIdentificacion() { return numeroIdentificacion; }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                '}';
    }
}
