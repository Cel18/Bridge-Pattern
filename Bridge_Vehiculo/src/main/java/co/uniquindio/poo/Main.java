package co.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        Combustible combustibleOriginal = new CombustibleOriginal();
        Combustible combustibleCorriente = new CombustibleCorriente();

        Vehiculo autoCombustibleOriginal = new Auto(combustibleOriginal, "rojo", 18189210, "Twingo");
        Vehiculo autoCombustibleCorriente = new Auto(combustibleCorriente, "azul", 1821890, "Duolinguo");
        Vehiculo motoCombustibleOriginal = new Moto(combustibleOriginal, "verde", 188927120, "Toyota");
        Vehiculo motoCombustibleCorriente = new Moto(combustibleCorriente, "rojo", 8728920, "Suzuki");

        autoCombustibleOriginal.conducir();
        autoCombustibleCorriente.conducir();
        motoCombustibleOriginal.conducir();
        motoCombustibleCorriente.conducir();
    }
}
