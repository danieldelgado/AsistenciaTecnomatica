/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class FechaUtil {
    
    /**
     * a partir de una fecha ingresada por el usuario con el formato DD/MM/AAAA
        convierte a un tipo DAte 
     */ 
//     public static String getDateDDMMYYYY(Date fecha){
//     SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");   
//     
//     return sdf.format(fecha);
//     
//     
//    }
    
      /**
      * a partir del formato de  fecha que maneja el ssitema este metodo converte
      * a un formato DD/MM/AAAA
      */ 
      
//    public static Date getDate (String fecha){
//        try {
//         SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
//         return sdf.parse(fecha);
//        } catch (ParseException ex) {
//            return null;
//        }
//    }
     //aaaa-mm-dd
    public static String getDateDDMMAAAA (Date fecha){
        String mifecha = fecha.toString();
        String dia = mifecha.substring(8, 10);
        String  mes = mifecha.substring(5, 7);
        String anio = mifecha.substring(0, 4);
        String f = dia+"/"+mes+"/"+anio;
        
        return f;
    }
//    public static int getDia (Date fecha){
//        String mifecha = fecha.toString();
//        String dia = mifecha.substring(8, 10);
//        
//        
//        return Integer.parseInt(dia);
//    }
    public static int getDia (Date fecha){
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(fecha);
        
        return gc.get(Calendar.DAY_OF_MONTH);
    }
    public static int getMes (Date fecha){
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(fecha);
        int mes  = gc.get(Calendar.MONTH)+1;
        return mes;
    }
   
    public static int getAnio (Date fecha){
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(fecha);
        return gc.get(Calendar.YEAR);
        
    }
   
//    public static int getMes (Date fecha){
//        String mifecha = fecha.toString();
//         String  mes = mifecha.substring(5, 7);
//        
//        
//        return Integer.parseInt(mes);
//    }
//    public static int getAnio (Date fecha){
//        String mifecha = fecha.toString();
//          String anio = mifecha.substring(0, 4);
//        
//        
//        return Integer.parseInt(anio);
//    }
//    
    
    
    /**
     * 
     * @param fechaHoy una fecha ingresada
     * @return la hora en formato hh:mm en String
     */
       public static String getHora(Date fechaHoy){
           String hora= String.valueOf(fechaHoy.getHours()) ;
           String min= String.valueOf(fechaHoy.getMinutes());
           
           if (fechaHoy.getHours()==0) {
               hora = "0"+ fechaHoy.getHours();    
           }
           if (fechaHoy.getMinutes()<=9){
               min= "0"+ fechaHoy.getMinutes();
           }
           String horaEnString = hora +":"+ min;
         return horaEnString;
     }
     /**
        * 
        * @param hora recibe una cadena con el formato HH:MM
        * @return  una fecha donde contendra en sus atributos la hora
        */
     public static Date getHora(String hora){
         int hs = Integer.parseInt(hora.substring(0, 1));
         int min = Integer.parseInt(hora.substring(3, 4));
         Date miHora = new Date(0, 0, 0, hs, min);
         return miHora;
     }
    
    
     
}
