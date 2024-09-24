package org.example.modelos;

public class Flor {
    private String nombre;
    private String color;
    private String tipo;
    private double diametro;  // Cambiado de altura a diámetro
    private String climaIdeal;
    private String temporada;
    private String duracionFlorecimiento;  // Cambiado de esPerenne a duración de florecimiento
    private double precio;
    private String cuidados;
    private String origen;

    // Constructor vacío
    public Flor() {
        this.nombre = "";
        this.color = "";
        this.tipo = "";
        this.diametro = 0.0;
        this.climaIdeal = "";
        this.temporada = "";
        this.duracionFlorecimiento = "";
        this.precio = 0.0;
        this.cuidados = "";
        this.origen = "";
    }

    // Constructor
    public Flor(String nombre, String color, String tipo, double diametro, String climaIdeal,
                String temporada, String duracionFlorecimiento, double precio, String cuidados, String origen) {
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
        this.diametro = diametro;
        this.climaIdeal = climaIdeal;
        this.temporada = temporada;
        this.duracionFlorecimiento = duracionFlorecimiento;
        this.precio = precio;
        this.cuidados = cuidados;
        this.origen = origen;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public double getDiametro() {
        return diametro;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public String getTemporada() {
        return temporada;
    }

    public String getDuracionFlorecimiento() {
        return duracionFlorecimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCuidados() {
        return cuidados;
    }

    public String getOrigen() {
        return origen;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public void setDuracionFlorecimiento(String duracionFlorecimiento) {
        this.duracionFlorecimiento = duracionFlorecimiento;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
