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
		String entrada = "", otraVez;
		double nota = 0, promedio = 0, masAlta = 0, masBaja = 0, contador = 0, sumaNotas = 0;
		boolean seguir = false, respuesta = false;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Instancio las interfaces con sus implementaciones
		OperativaInterfaz oi = new OperativaImplementacion();
		
		do {
			oi.muestraTitulo();
			oi.pideNumeros(entrada, nota, promedio, masAlta, masBaja, contador, sumaNotas, seguir);
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
