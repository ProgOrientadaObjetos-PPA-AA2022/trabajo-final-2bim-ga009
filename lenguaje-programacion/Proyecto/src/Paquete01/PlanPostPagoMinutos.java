
package Paquete01;

public class PlanPostPagoMinutos extends PlanCelular {
    
    private int minN;
    private double costoMinN;
    private int minInt;
    private double costoMinInt;

    public PlanPostPagoMinutos(int minN, double costoMinN, int minInt, 
            double costoMinInt, String nomPro, String ced, String ciuPro, 
            String marcaCelu, String modelCelu, String numCelu) {
        
        super(nomPro, ced, ciuPro, marcaCelu, modelCelu, numCelu);
        this.minN = minN;
        this.costoMinN = costoMinN;
        this.minInt = minInt;
        this.costoMinInt = costoMinInt;
        calcularPagoMensual();
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minN * costoMinN) + 
                (minInt * costoMinInt);
    }
    
    public void establecerMinN(int n) {
        this.minN = n;
    }

    public void establecerCostoMinN(double n) {
        this.costoMinN = n;
    }

    public void establecerMinInt(int n) {
        this.minInt = n;
    }

    public void establecerCostoMinInt(double n) {
        this.costoMinInt = n;
    }

    public int obtenerMinN() {
        return minN;
    }

    public double obtenerCostoMinN() {
        return costoMinN;
    }

    public int obtenerMinInt() {
        return minInt;
    }

    public double obtenerCostoMinInt() {
        return costoMinInt;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("PlanPostPago-Minutos\n"
                + "%s"
                + "    Minutos (Nacional): %d\n"
                + "    Costo X Minuto(Nacional): %.2f\n"
                + "    Minutos (Internacional): %d\n"
                + "    Costo X Minuto(Internacional): %.2f\n"
                + "    Pago Mensual: %.2f\n"
                + "--------------------------------\n",
                super.toString(), minN, costoMinN, minInt, 
                costoMinInt, pagoMensual);
        
        return cadena;
    }
    
}
