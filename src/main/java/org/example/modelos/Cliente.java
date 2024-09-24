package org.example.modelos;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String telefono;
    private String direccion;
    private String ciudad;
    private String pais;
    private String codigoPostal;
    private String fechaRegistro;

    // Constructor vacío
    public Cliente() {
        // Inicializa atributos con valores por defecto
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.correo = "";
        this.direccion = "";
        this.ciudad = "";
        this.pais = "";
        this.codigoPostal = "";
        this.edad = 0;
        this.fechaRegistro = "";
    }

    // Constructor
    public Cliente(String nombre, String apellido, int edad, String correo, String telefono,
                   String direccion, String ciudad, String pais, String codigoPostal, String fechaRegistro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.fechaRegistro = fechaRegistro;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    // Métodos setters (si es necesario)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
