package co.uniquindio.poo;

public class CombustibleCorriente implements Combustible{

    @Override
    public void generarElectricidad() {
        System.out.println("generando electricidad con combustible corriente \n");
    }
}
