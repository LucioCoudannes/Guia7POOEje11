/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooeje11;

import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author A288808
 */
public class Guia7POOEje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
        //clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
        //Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
        //usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
        //deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
        //puede conseguir instanciando un objeto Date con constructor vacío. 
        //Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
        //Ejemplo fecha actual: Date fechaActual = new Date()
        
        Scanner leer = new Scanner(System.in);
        
        int dia;
        int mes;
        int anio;
        
        System.out.println("Ingrese el día");
        dia=leer.nextInt();
        System.out.println("Ingrese el mes");
        mes=leer.nextInt();
        System.out.println("Ingrese el año");
        anio=leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);

        System.out.println("La fecha ingresada es " + fecha.toLocaleString());
        
        Date fechaActual = new Date();
        
        System.out.println("Fecha Actual: "+fechaActual.toLocaleString());
        System.out.println(fechaActual.getYear()-fecha.getYear()+" años");
        
        
        
        
        
    }
    
}
