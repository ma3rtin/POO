/*
 Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y 
esMayorDeEdad en distintas variables(arrays), para después calcular un 
porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en 
su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de 
cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales

 */
package poo2;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author mutuv
 */
public class POO2EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        PersonaServicio servicio = new PersonaServicio();
        int[] resultadoPeso = new int[2];
        boolean[] resultadoIMC = new boolean[2];

        servicio.CrearPersona(p1);
        servicio.CrearPersona(p2);

        resultadoIMC[0] = servicio.esMayorDeEdad(p1);
        resultadoIMC[1] = servicio.esMayorDeEdad(p2);
        resultadoPeso[0] = servicio.calcularIMC(p1);
        resultadoPeso[1] = servicio.calcularIMC(p2);
        porcentajeEdad(resultadoIMC);
        porcentajePeso(resultadoPeso);

    }

    public static void porcentajePeso(int[] peso) {
        int pesoIdeal = 0, pesoDebajo = 0, pesoEncima = 0;
        for (int i = 0; i < peso.length; i++) {

            if (peso[i] == -1) {
                pesoDebajo++;
            } else if (peso[i] == 0) {
                pesoIdeal++;
            } else {
                pesoEncima++;
            }

        }
        int totalPeso = pesoDebajo + pesoIdeal + pesoEncima;
        int porcIdeal, porcDebajo, porcEncima;
        System.out.println("Porcentaje de personas con peso ideal = " + (totalPeso / pesoIdeal) * 100);
        System.out.println("Porcentaje de personas con peso encima = " + (totalPeso / pesoDebajo) * 100);
        System.out.println("Porcentaje de personas con peso debajo = " + (totalPeso / pesoEncima) * 100);
    }
    public static void porcentajeEdad(boolean[] edad){
        int mayor=0, menor=0;
        for (int i = 0; i < edad.length; i++) {
            if (edad[i]) {
                mayor++;
            } else {
                menor++;
            }
        }
        int total=mayor+menor;
        System.out.println("Porcentaje de mayores de edad = "+ (total/mayor)*100);
        System.out.println("Porcentaje de menores de edad = "+ (total/menor)*100);
    }
}
