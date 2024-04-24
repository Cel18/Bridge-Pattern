package co.uniquindio.poo;

public class Auto extends Vehiculo {

    public Auto(Combustible combustible, String color, int precio, String modelo) {
        super(combustible);
        this.color = color;
        this.precio = precio;
        this.modelo = modelo;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo auto");
        combustible.generarElectricidad(); // Utilización del combustible 
    }
}
