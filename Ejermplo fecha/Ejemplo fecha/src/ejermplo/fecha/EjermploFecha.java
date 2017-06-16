/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//esta cambio lo he hecho en el fork, y quiero hacer un pull request

package ejermplo.fecha;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author juanlu
 */
public class EjermploFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //OJO QUE EL MES EMPIEZA DESDE 0 -> 0=enero, 1=febrero,...5=Junio
        
        //  Fecha 1--> 2/06/2017 12:07:05
        GregorianCalendar fecha1 = new GregorianCalendar(2017, 5, 2, 12, 7, 5);
        Date fecha1Date = fecha1.getTime();
        //  Fecha 2--> 3/06/2017 12:07:05
        GregorianCalendar fecha2 = new GregorianCalendar(2017, 5, 3, 12, 7, 5);
        Date fecha2Date = fecha2.getTime();
        
        //comparo las fechas
        int comparacion = fecha1Date.compareTo(fecha2Date);
        if(comparacion == 0){
            System.out.println("Fechas son guales");
        }else if (comparacion < 0){
                System.out.println("fecha1Date es menor que fecha2Date");
        }else{
                System.out.println("fecha1Date es mayor que fecha2Date");
        }
    
    }
    
}
