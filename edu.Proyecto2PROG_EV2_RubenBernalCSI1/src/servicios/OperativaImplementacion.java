/**
 * Rubén Bernal Ramos, CSI1
 */

package servicios;

import java.util.Scanner;

/**
 * Implementación de la interfaz Operativa
 * @author rbr - 201024
 *
 */
public class OperativaImplementacion implements OperativaInterfaz{

	/**
	 * Método que mostrará el título de la aplicación por consola
	 * rbr - 201024
	 */
	public void muestraTitulo() {
		
		System.out.println("=== Calculadora de Promedios de Calificaciones ===");
		
	}

	/**
	 * Método que solicitará las notas hasta que el usuario introduzca la palabra "fin"
	 * rbr - 211024
	 */
	public void pideNumeros(String entrada, double nota, double promedio, double masAlta, double masBaja, double contador, double sumaNotas, boolean seguir) {
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
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
		
	}

}
