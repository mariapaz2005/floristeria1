package org.example.ayudas;

public class Proveedor {
    private String nombre;
    private String razonSocial;
    private String contacto;
    private String telefono;
    private String correo;
    private String direccion;
    private String ciudad;
    private String pais;
    private String codigoPostal;
    private String fechaRegistro;

    // Constructor vacío
    public Proveedor() {
        this.nombre = "";
        this.razonSocial = "";
        this.contacto = "";
        this.telefono = "";
        this.correo = "";
        this.direccion = "";
        this.ciudad = "";
        this.pais = "";
        this.codigoPostal = "";
        this.fechaRegistro = "";
    }

    // Constructor
    public Proveedor(String nombre, String razonSocial, String contacto, String telefono, String correo,
                     String direccion, String ciudad, String pais, String codigoPostal, String fechaRegistro) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.contacto = contacto;
        this.telefono = telefono;
        this.correo = correo;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getContacto() {
        return contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
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

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
