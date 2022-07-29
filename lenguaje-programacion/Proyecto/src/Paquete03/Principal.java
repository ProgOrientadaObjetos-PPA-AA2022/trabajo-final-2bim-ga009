package Paquete03;

import Paquete01.PlanCelular;
import Paquete01.PlanPostPagoMegas;
import Paquete01.PlanPostPagoMinMeg;
import Paquete01.PlanPostPagoMinutos;
import Paquete01.PlanPostpagoMinMegEco;
import Paquete02.EnlacePPPMM;
import Paquete02.EnlacePPPMMEco;
import Paquete02.EnlacePPPMe;
import Paquete02.EnlacePPPMi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        sc.useLocale(Locale.US);

        Principal obj = new Principal();
        
        //variables necesarias

        int op;
        int rompeBucle = 0;
        
        //----------------
        
        //Lista que almacena en memoria

        ArrayList<PlanCelular> listaPlanes = new ArrayList<>();
        
        //----------------
        
        //Enlaces

        EnlacePPPMM pppmm = new EnlacePPPMM();
        EnlacePPPMMEco pppmmeco = new EnlacePPPMMEco();
        EnlacePPPMe pppmme = new EnlacePPPMe();
        EnlacePPPMi pppmmi = new EnlacePPPMi();
        
        //---------------

        do {

            op = obj.menu();

            switch (op) {

                case 1 -> {
                    
                    //Propietario
                    
                    sc.nextLine();
                    System.out.println("Ingrese su nombre:");
                    String nombre1 = sc.nextLine();
                    System.out.println("Ingrese su cedula:");
                    String cedula1 = sc.nextLine();
                    System.out.println("Ingrese su ciudad de residencia actual:");
                    String ciudad1 = sc.nextLine();
                    System.out.println("Ingrese la marca de su dispositivo:");
                    String marca1 = sc.nextLine();
                    System.out.println("Ingrese el modelo de su dispositivo:");
                    String modelo1 = sc.nextLine();
                    System.out.println("Ingrese su numero celular:");
                    String numero1 = sc.nextLine();

                    //PlanPostPagoMinutos
                    
                    System.out.println("Ingrese los minutos nacionales:");
                    int minutosN1 = sc.nextInt();
                    System.out.println("Ingrese el costo por minuto nacional:");
                    double costoMinN1 = sc.nextDouble();
                    System.out.println("Ingrese los minutos internacionales:");
                    int minutosInt1 = sc.nextInt();
                    System.out.println("Ingrese el costo por minuto internacional:");
                    double costoMinInt1 = sc.nextDouble();

                    PlanPostPagoMinutos p1 = new PlanPostPagoMinutos(
                            minutosN1, costoMinN1, minutosInt1, costoMinInt1, nombre1,
                            cedula1, ciudad1, marca1, modelo1, numero1
                    );
                    listaPlanes.add(p1);
                    pppmmi.insertarPlanPostPagoMinutos(p1);
                }

                case 2 -> {
                    
                    //Propietario
                    
                    sc.nextLine();
                    System.out.println("Ingrese su nombre:");
                    String nombre2 = sc.nextLine();
                    System.out.println("Ingrese su cedula:");
                    String cedula2 = sc.nextLine();
                    System.out.println("Ingrese su ciudad de residencia actual:");
                    String ciudad2 = sc.nextLine();
                    System.out.println("Ingrese la marca de su dispositivo:");
                    String marca2 = sc.nextLine();
                    System.out.println("Ingrese el modelo de su dispositivo:");
                    String modelo2 = sc.nextLine();
                    System.out.println("Ingrese su numero celular:");
                    String numero2 = sc.nextLine();

                    //PlanPostPagoMegas
                    
                    System.out.println("Ingrese la tarifa base:");
                    double tarifa2 = sc.nextDouble();
                    System.out.println("Ingrese el numero de Gigas:");
                    int gigas2 = sc.nextInt();
                    System.out.println("Ingrese el costo por Giga:");
                    double costoXgiga2 = sc.nextDouble();

                    PlanPostPagoMegas p2 = new PlanPostPagoMegas(
                            gigas2, costoXgiga2, tarifa2, nombre2,
                            cedula2, ciudad2, marca2, modelo2, numero2
                    );
                    listaPlanes.add(p2);
                    pppmme.insertarPlanPostPagoMegas(p2);
                }

                case 3 -> {
                    
                    //Propietario
                    
                    sc.nextLine();
                    System.out.println("Ingrese su nombre:");
                    String nombre3 = sc.nextLine();
                    System.out.println("Ingrese su cedula:");
                    String cedula3 = sc.nextLine();
                    System.out.println("Ingrese su ciudad de residencia actual:");
                    String ciudad3 = sc.nextLine();
                    System.out.println("Ingrese la marca de su dispositivo:");
                    String marca3 = sc.nextLine();
                    System.out.println("Ingrese el modelo de su dispositivo:");
                    String modelo3 = sc.nextLine();
                    System.out.println("Ingrese su numero celular:");
                    String numero3 = sc.nextLine();

                    //PlanPostPagoMinutosMegas
                    
                    System.out.println("Ingrese los minutos:");
                    int minutos3 = sc.nextInt();
                    System.out.println("Ingrese el costo por minuto:");
                    double costoMin3 = sc.nextDouble();
                    System.out.println("Ingrese el numero de Gigas:");
                    int gigas3 = sc.nextInt();
                    System.out.println("Ingrese el costo por Giga:");
                    double costoXgiga3 = sc.nextDouble();

                    PlanPostPagoMinMeg p3 = new PlanPostPagoMinMeg(
                            minutos3, costoMin3, gigas3, costoXgiga3, nombre3,
                            cedula3, ciudad3, marca3, modelo3, numero3
                    );
                    listaPlanes.add(p3);
                    pppmm.insertarPlanPostPagoMinMeg(p3);
                }

                case 4 -> {
                    
                    //Propietario
                    
                    sc.nextLine();
                    System.out.println("Ingrese su nombre:");
                    String nombre4 = sc.nextLine();
                    System.out.println("Ingrese su cedula:");
                    String cedula4 = sc.nextLine();
                    System.out.println("Ingrese su ciudad de residencia actual:");
                    String ciudad4 = sc.nextLine();
                    System.out.println("Ingrese la marca de su dispositivo:");
                    String marca4 = sc.nextLine();
                    System.out.println("Ingrese el modelo de su dispositivo:");
                    String modelo4 = sc.nextLine();
                    System.out.println("Ingrese su numero celular:");
                    String numero4 = sc.nextLine();

                    //PlanPostPagoMinutosMegasEconómico
                    
                    System.out.println("Ingrese los minutos:");
                    int minutos4 = sc.nextInt();
                    System.out.println("Ingrese el costo por minuto:");
                    double costoMin4 = sc.nextDouble();
                    System.out.println("Ingrese el numero de Gigas:");
                    int gigas4 = sc.nextInt();
                    System.out.println("Ingrese el costo por Giga:");
                    double costoXgiga4 = sc.nextDouble();
                    System.out.println("Ingrese el descuento otorgado(%):");
                    int descuento4 = sc.nextInt();

                    PlanPostpagoMinMegEco p4 = new PlanPostpagoMinMegEco(
                            minutos4, costoMin4, gigas4, costoXgiga4, descuento4,
                            nombre4, cedula4, ciudad4, marca4, modelo4, numero4
                    );
                    listaPlanes.add(p4);
                    pppmmeco.insertarPlanPostPagoMinMegEco(p4);
                }

                case 5 -> {
                    
                    for (int i = 0; i < pppmm.obtenerDataPppmm().size(); i++) {
                        System.out.printf("%s\n", pppmm.obtenerDataPppmm().get(i));
                    }
                    for (int i = 0; i < pppmmeco.obtenerDataPppmmEco().size(); i++) {
                        System.out.printf("%s\n", pppmmeco.obtenerDataPppmmEco().get(i));
                    }
                    for (int i = 0; i < pppmme.obtenerDataPppMegas().size(); i++) {
                        System.out.printf("%s\n", pppmme.obtenerDataPppMegas().get(i));
                    }
                    for (int i = 0; i < pppmmi.obtenerDataPppMinutos().size(); i++) {
                        System.out.printf("%s\n", pppmmi.obtenerDataPppMinutos().get(i));
                    }
                    
                }
                    
                case 0 -> {
                    
                    for (int i = 0; i < listaPlanes.size(); i++) {
                        System.out.println(listaPlanes.get(i));  
                    }
                    if (op == 0) {
                        rompeBucle = 1;
                    }
                    
                }

                default -> {
                    break;
                }
            }

        } while (rompeBucle != 1);

    }

    public int menu() {

        int opc;
        System.out.println("Crear PlanPostPagoMinutos                   |1|");
        System.out.println("Crear PlanPostPagoMegas                     |2|");
        System.out.println("Crear PlanPostPagoMinutosMegas              |3|");
        System.out.println("Crear PlanPostPagoMinutosMegasEco           |4|");
        System.out.println("Mostar objetos en base de datos             |5|");
        System.out.println("Terminar y Mostrar objetos ingresados       |0|");
        opc = sc.nextByte();

        return opc;
    }

}
