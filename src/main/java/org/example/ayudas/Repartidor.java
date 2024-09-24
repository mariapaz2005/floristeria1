package org.example.ayudas;

public class Repartidor {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String direccion;
    private String ciudad;
    private String pais;
    private String codigoPostal;
    private String tipoVehiculo;
    private String numeroLicencia;

    // Constructor vacío
    public Repartidor() {
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.correo = "";
        this.direccion = "";
        this.ciudad = "";
        this.pais = "";
        this.codigoPostal = "";
        this.tipoVehiculo = "";
        this.numeroLicencia = "";
    }


    // Constructor
    public Repartidor(String nombre, String apellido, String telefono, String correo, String direccion,
                      String ciudad, String pais, String codigoPostal, String tipoVehiculo, String numeroLicencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.tipoVehiculo = tipoVehiculo;
        this.numeroLicencia = numeroLicencia;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
}
