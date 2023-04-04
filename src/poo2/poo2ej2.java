/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;

/**
 *
 * @author mutuv
 */
public class poo2ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera u1 = new Cafetera();
        CafeteraServicio u2=new CafeteraServicio();
        
        u1.setCantidadActual(u2.llenarCafetera());
        u2.servirTaza();
        u2.llenarCafetera();
        u2.vaciarCafetera();
    }
    
}
