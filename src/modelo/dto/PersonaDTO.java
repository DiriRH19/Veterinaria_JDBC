package modelo.dto;

public class PersonaDTO {
    private String documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

    public PersonaDTO() {}

    public PersonaDTO(String documento, String nombre, String apellido, String telefono, String direccion) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Documento: " + documento + "\n" +
                "Nombre: " + nombre + " " + apellido + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Dirección: " + direccion + "\n";
    }
}