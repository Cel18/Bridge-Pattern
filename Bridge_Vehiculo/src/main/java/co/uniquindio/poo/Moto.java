package co.uniquindio.poo;

public class Moto extends Vehiculo {

    public Moto(Combustible combustible, String color, int precio, String modelo) {
        super(combustible);
        this.color = color;
        this.precio = precio;
        this.modelo = modelo;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo moto");
        combustible.generarElectricidad(); // Utilización del combustible 
    }
}
