/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase controladora de la aplicación
 * @author rbr - 201024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 201024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		String entrada, otraVez;
		double nota, promedio, masAlta = 0, masBaja = 0, contador = 0, sumaNotas = 0;
		boolean seguir = false, respuesta = false;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Instancio las interfaces con sus implementaciones
		OperativaInterfaz oi = new OperativaImplementacion();
		
		do {
			oi.muestraTitulo();
			do {
				System.out.println("Introduce una calificación (o escribe \"fin\" para terminar):");
				entrada = sc.next();
				if(entrada.equals("fin")) {
					seguir = true;
				}else {
					nota = Double.parseDouble(entrada);
					contador++;
					sumaNotas = sumaNotas + nota;
					
					masBaja = nota;
		            if (nota > masAlta) {
		            	masAlta = nota;
		            }else if(nota < masBaja) {
		            	masBaja = nota;
		            }
				}
			}while(!seguir);
			
			System.out.println("Resumen: ");
			promedio = sumaNotas / contador;
			System.out.println("Promedio: " + promedio);
			System.out.println("Calificación más alta: " + masAlta);
			System.out.println("Calificación más baja: " + masBaja);
			
			System.out.println();
			System.out.println("¿Quieres calcular otra vez? (S/N):");
			otraVez = sc.next();
			if(otraVez.equals("S")) {
				respuesta = true;
			}else if(otraVez.equals("N")) {
				respuesta = false;
			}
		}while(respuesta);
		
		sc.close();
 
	}

}
