package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    Scanner sc =new Scanner(System.in);
    Cafetera c1= new Cafetera();
    
    
    public int llenarCafetera(){
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("Cantidad actual de café: "+c1.getCantidadActual());
        return c1.getCapacidadMaxima();
    }
    
    public void servirTaza(){
        System.out.println("¿De qué tamaño es la taza?");
        int tamañoTaza=sc.nextInt();
        if(tamañoTaza<=c1.getCantidadActual()){
            c1.setCantidadActual(c1.getCantidadActual()-tamañoTaza);
            System.out.println("Se llenó la taza.");
            System.out.println("Cantidad actual de café: "+c1.getCantidadActual());
        }else if(tamañoTaza>c1.getCantidadActual()){
            System.out.println("No se llenó la taza, se sirvió "+c1.getCantidadActual());
            c1.setCantidadActual(0);
        }
    }
    public void vaciarCafetera(){
        c1.setCantidadActual(0);
        System.out.println("Se vació la cafetera.");
    }
    public void agregarCafe(){
        System.out.println("Indique la cantidad de café que desea agragar.");
        int cantAgregada = sc.nextInt();
        c1.setCantidadActual(c1.getCantidadActual()+cantAgregada);
    }
    }
    

