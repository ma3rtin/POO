package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Persona p1 = new Persona();
    Scanner sc=new Scanner(System.in);
    public boolean esMayorDeEdad(Persona p1){
        
        if(p1.getEdad()>=18){
            return true;
        }else{
            return false;
        }
    }
    
    public void CrearPersona(Persona p1){
       
        System.out.println("Ingrese el nombre.");
        p1.setNombre(sc.next());
        System.out.println("Ingrese la edad");
        p1.setEdad(sc.nextInt());
        System.out.println("Ingrese el sexo.");
        p1.setSexo(sc.next());
        if((!p1.getSexo().equals("h")) || (!p1.getSexo().equals("m")) || (!p1.getSexo().equals("o"))){
            System.out.println("Sexo erroneo");
        }
    }
    //Método calcularIMC(): calculara si la persona está en su peso ideal 
    //(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor 
    //menor que 20, significa que la persona está por debajo de su peso ideal y
    //la función devuelve un -1. Si la fórmula da por resultado un número entre 
    //20 y 25 (incluidos), significa que la persona está en su peso ideal y la función
    //devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor 
    //que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
    public int calcularIMC(Persona p1){
        System.out.println("Indique el peso");
        p1.setPeso(sc.nextInt());
        System.out.println("Indique la altura");
        p1.setAltura(sc.nextInt());
        
        if(p1.getPeso()/(p1.getAltura()*p1.getAltura())<20){
            System.out.println("Está por debajo del peso ideal");
            return -1;
        }else if(p1.getPeso()/(p1.getAltura()*p1.getAltura())>=25){
            System.out.println("Está dentro de su peso ideal");
            return 0;
        }else{
            System.out.println("Esta encima de su peso ideal");
            return 1;
        }
    }
    
}
