
package Paquete01;

public class PlanPostPagoMinMeg extends PlanCelular {
    
    private int min;
    private double costoMin;
    private int gigas;
    private double costoXGiga;

    public PlanPostPagoMinMeg(int min, double costMin, int megExpG, 
            double costXG, String nomPro, String ced, String ciuPro, 
            String marcaCelu, String modelCelu, String numCelu) {
        
        super(nomPro, ced, ciuPro, marcaCelu, modelCelu, numCelu);
        this.min = min;
        this.costoMin = costMin;
        this.gigas = megExpG;
        this.costoXGiga = costXG;
        calcularPagoMensual();
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (min * costoMin) + (gigas * costoXGiga);
    }

    public void establecerMin(int n) {
        this.min = n;
    }

    public void establecerCostoMin(double n) {
        this.costoMin = n;
    }

    public void establecerGigas(int n) {
        this.gigas = n;
    }

    public void establecerCostoXGiga(double n) {
        this.costoXGiga = n;
    }

    public int obtenerMin() {
        return min;
    }

    public double obtenerCostoMin() {
        return costoMin;
    }

    public int obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoXGiga() {
        return costoXGiga;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("PlanPostPago-MinutosMegas\n"
                + "%s"
                + "    Minutos: %d\n"
                + "    Costo X Minuto: %.2f\n"
                + "    Gigas: %d\n"
                + "    Costo X Giga: %.2f\n"
                + "    Pago Mensual: %.2f\n"
                + "--------------------------------\n",
                super.toString(), min, costoMin, gigas, costoXGiga, 
                pagoMensual);
        
        return cadena;
    }
      
}
