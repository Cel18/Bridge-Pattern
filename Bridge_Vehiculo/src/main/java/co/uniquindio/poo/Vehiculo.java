package co.uniquindio.poo;

public abstract class Vehiculo {
    protected String color;
    protected int precio;
    protected String modelo;
    protected Combustible combustible;

    public Vehiculo(Combustible combustible) {
        this.combustible = combustible;
    }

    public abstract void conducir();

    //getters y setters
    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
}
