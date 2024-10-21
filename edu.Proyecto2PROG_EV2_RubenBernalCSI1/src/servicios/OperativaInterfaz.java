/**
 * Rubén Bernal Ramos, CSI1
 */

package servicios;

/**
 * Interfaz para la operativa de la aplicación
 * @author rbr - 201024
 *
 */
public interface OperativaInterfaz {

	/**
	 * Enunciado de los métodos que contendrá la implementación
	 * rbr - 201024
	 */
	public void muestraTitulo();
	public void pideNumeros(String entrada, double nota, double promedio, double masAlta, double masBaja, double contador, double sumaNotas, boolean seguir);
}
