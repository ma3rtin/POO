package Servicios;

import Entidades.CuentaBancaria;
import java.util.Random;
import java.util.Scanner;
/
public class CuentaBancariaServicio {

    Scanner sc = new Scanner(System.in);
    Random rdm = new Random();
    int limite = 9999999;
    CuentaBancaria u1 = new CuentaBancaria();

    public CuentaBancaria crearCuenta() {
        System.out.println("Escriba el número de cuenta");
        u1.setNumeroCuenta(sc.nextInt());
        System.out.println("Escriba su DNI");
       u1.setDniCliente(sc.nextLong());
        u1.setSaldoActual(rdm.nextInt(limite));
        return u1;
    }
    public void menu(CuentaBancaria u1){
     int resp;
        do {
            System.out.println("Elija una opción.");
            System.out.println("1. Ingresar dinero."
                    + "2. Retirar dinero."
                    + "3. Extracción rápida."
                    + "4. Consultar saldo."
                    + "5. Consultar datos."
                    + "0. Salir.");
            resp = sc.nextInt();
            switch (resp){ 
                case 1: ingresar(u1);
                break;
                case 2: retirar(u1);
                break;
                case 3: extraccionRapida(u1);
                break;
                case 4: consultarSaldo(u1);
                break;
                case 5: consultarDatos(u1);
                break;
                case 0: System.out.println("Gracias por usar la aplicación.");
                break;
            }
        }while (resp != 0);
        }

    public void ingresar(CuentaBancaria u1){
        System.out.println("Indique la cantidad de dinero que desea ingresar");
        double dineroIngresado = sc.nextDouble();
        u1.setSaldoActual(u1.getSaldoActual()+dineroIngresado);
    }

    public void retirar(CuentaBancaria u1) {
        System.out.println("Indique la cantidad de dinero que desea retirar");
        double extraccion = sc.nextDouble();
        if (extraccion < u1.getSaldoActual()) {
            u1.setSaldoActual(u1.getSaldoActual()-extraccion);
            System.out.println("Retiraste $" + extraccion);
        } else if (extraccion > u1.getSaldoActual()) {
            extraccion=u1.getSaldoActual();
            u1.setSaldoActual(extraccion);
            System.out.println("Retiraste $" + extraccion);
        } 
        
    }

    public void extraccionRapida(CuentaBancaria u1) {
        double extraccion = u1.getSaldoActual() * 0.20;
        System.out.println("Retiraste $" + extraccion);
        u1.setSaldoActual(u1.getSaldoActual()-extraccion);
    }

    public void consultarSaldo(CuentaBancaria u1) {
        System.out.println("Su saldo es de $" + u1.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria u1) {
        System.out.println("Su número de cuenta es: " + u1.getNumeroCuenta());
        System.out.println("DNI: " + u1.getDniCliente());
    }
}
