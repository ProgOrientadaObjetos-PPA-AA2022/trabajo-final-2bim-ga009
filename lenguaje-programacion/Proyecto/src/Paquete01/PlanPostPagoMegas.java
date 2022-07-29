
package Paquete01;

public class PlanPostPagoMegas extends PlanCelular {
    
    private int gigas;
    private double costoXGiga;
    private double tarifaBase;

    public PlanPostPagoMegas(int megExpG, double costoXG, 
            double tarifaB, String nomPro, String ced, String ciuPro, 
            String marcaCelu, String modelCelu, String numCelu) {
        
        super(nomPro, ced, ciuPro, marcaCelu, modelCelu, numCelu);
        this.gigas = megExpG;
        this.costoXGiga = costoXG;
        this.tarifaBase = tarifaB;
        calcularPagoMensual();
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = tarifaBase + (costoXGiga * gigas);
    }

    public void establecerGigas(int n) {
        this.gigas = n;
    }

    public void establecerCostoXGiga(double n) {
        this.costoXGiga = n;
    }

    public void establecerTarifaBase(double n) {
        this.tarifaBase = n;
    }

    public int obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoXGiga() {
        return costoXGiga;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("PlanPostPago-Megas\n"
                + "%s"
                + "    Tarifa Base: %.2f\n"
                + "    Gigas: %d\n"
                + "    Costo X Giga: %.2f\n"
                + "    Pago Mensual: %.2f\n"
                + "--------------------------------\n",
                super.toString(), tarifaBase, gigas, costoXGiga, 
                pagoMensual);
        
        return cadena;
    }
    
}
