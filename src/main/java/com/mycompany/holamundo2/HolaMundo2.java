/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.holamundo2;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class HolaMundo2 {

    public static void main(String[] args) {
       
        //Realizar un contador de numeros y el tope maximo lo establecera el usuario
        System.out.println("ESTRUCTURAS REPETITIVAS");
//        System.out.println("------CONTADOR------------");
//        System.out.println("Ingresar el Valor que sera el Tope Maximo");
//        Scanner teclado = new Scanner(System.in);
//        int tope = teclado.nextInt();
//        int valorInicial = 0;
//        
//        while(valorInicial <= tope){
//            System.out.println("Secuencia Numerica menor al tope: " + valorInicial);
//            valorInicial ++;
//        }
        
        //Realizar un programa que muestre por pantalla palabras que sean ingresadas por teclado
        //hasta que se ingrese la palabra "salir"
        
//        System.out.println("Ingresar Palabra a Inscribir");
//        Scanner teclado = new Scanner(System.in);
//        String palabra = teclado.next();
//        String tope = "salir";
//        
//        while(!palabra.equalsIgnoreCase(tope) ){
//            System.out.println("Palabra Ingresada: " + palabra);
//            System.out.println("Ingresar nueva palabra a Revisar");
//            palabra = teclado.next();
//        }


        //Realizar una planilla de Inscripcion que tome dni, nombre y edad de cada
        //inscripto y lo agrupe en base a categorias.
        //El cierre del programa sera en base a un dni = 0 y nombre = "fin"
        
        
//        System.out.println("---PLANILLA DE INSCRIPCION-----");
//        System.out.println("INGRESAR EL DNI");
//        Scanner dniTeclado = new Scanner(System.in);
//        long dni = dniTeclado.nextLong();
//        
//        System.out.println("INGRESAR EL NOMBRE Y APELLIDO");
//        Scanner nombreTeclado = new Scanner(System.in);
//        String nombre = nombreTeclado.next();
//        
//        
//        
//        String cierre = "fin";
//        int edad = 0;
//        if(dni == 0 && nombre.equalsIgnoreCase(cierre)){
//            System.out.println("---INSCRIPCIONES CERRADAS----");
//            
//        }else{
//            System.out.println("INGRESAR LA EDAD");
//            Scanner edadTeclado=  new Scanner(System.in);
//            edad = edadTeclado.nextInt();
//            
//             String categoria = "";
//            System.out.println("-----TARJETA PARTICIPANTE---------");
//            if(edad >=6 && edad <= 10){
//                categoria = "MENORES A (de 6 a 10 años)";
//            }else if(edad >=11 && edad <=17){
//                categoria = "MENORES B (de 11 a 17 años)";
//            }else if(edad >= 18 && edad <=30){
//                categoria = "JUVENILES (de 18 a 30 años)";
//            }else if(edad >= 31 && edad <=50){
//                categoria = "ADULTOS (de 31 a 50 años)";
//            }else if(edad > 50){
//                categoria = "ADULTOS MAYORES (mayores de 50 años)";
//            }
//        
//            System.out.println("DNI: " + dni);
//            System.out.println("NOMBRE Y APELLIDO: " + nombre);
//            System.out.println("EDAD: " + edad);
//            System.out.println("CATEGORIA: " + categoria);
//            
//            
//        }
        
       
        
        
        System.out.println("---VECTORES Y MATRICES------------");
        System.out.println("IMPLEMENTACION");
        int vector[] = new int [4];
        vector[0] = 25;
        vector[1] = 30;
        vector[2] = 35;
        vector[3] = 40;
        System.out.println("---Recorrido del Vector-----");
        System.out.println("My vector de Edades: ");
        for(int i=0; i< vector.length; i++){
            System.out.println("Estoy en la posicion: " + i + ", y su valor es: " + vector[i]);
        }
        
        System.out.println("CARGA DE VALORES POR SCANNER");
        int edades[] = new int [5];
        
        Scanner valores = new Scanner(System.in);
        
        for(int i=0; i<edades.length; i++){
            System.out.println("Ingresar el valor para la posicion: " + i);
            edades[i] = valores.nextInt();
            
        }
        System.out.println("Mostramos como quedo el Vector por Scanner");
        for(int i=0; i<edades.length; i++){
            System.out.println("Para la posicion: " + i + ", el valor es: " + edades[i]);
            
        }
        
        
        
        
            
        
            
            
        
        
        
    }
   
}
