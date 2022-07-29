
package Paquete02;

import Paquete01.PlanPostPagoMinutos;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;


public class EnlacePPPMi {
    
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/PlanPostPago.db";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos pppm) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutos (Nombre,"
                    + "Cedula, Ciudad, Marca, Modelo, Numero, MinutosN, CostoXMinN,"
                    + "MinutosI, CostoXMinI, PagoMensual)"
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%d',"
                    + "%s, '%d', %s, %s)", 
                    pppm.obtenerNombre(), pppm.obtenerCedula(), 
                    pppm.obtenerCiudad(), pppm.obtenerMarca(), 
                    pppm.obtenerModelo(), pppm.obtenerNumero(), 
                    pppm.obtenerMinN(), pppm.obtenerCostoMinN(),
                    pppm.obtenerMinInt(), pppm.obtenerCostoMinInt(),
                    pppm.obtenerPagoMensual());
            
            statement.executeUpdate(data);
            System.out.println("Objeto Ingresado correctamente :)");
            obtenerConexion().close();
            
        } catch (SQLException e) {  
             System.err.println("Error al insertar PlanPostPagoMinutos");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMinutos> obtenerDataPppMinutos() {  
        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutos;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                
                PlanPostPagoMinutos miPppm = new PlanPostPagoMinutos(
                rs.getInt("MinutosN"), rs.getDouble("CostoXMinN"),
                rs.getInt("MinutosI"), rs.getDouble("CostoXMinI"), 
                rs.getString("Nombre"), rs.getString("Cedula"), 
                rs.getString("Ciudad"), rs.getString("Marca"),
                rs.getString("Modelo"), rs.getString("Numero"));
                lista.add(miPppm);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Error al obtener PlanPostPagoMinutos");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
     
}  
