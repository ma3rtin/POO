/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author mutuv
 */
public class POO2Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CuentaBancariaServicio usuario=new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = usuario.crearCuenta();
        usuario.menu(cuenta1);
        
        
    }
    
}

