package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

/**
 * Gestiona la interacción con el usuario por consola.
 */
public class VistaGeneral {

	private static final String FORMATO_PRINTF_MOSTRAR_TEXTO = "%s%n";
	private static final String FORMATO_PRINTF_MOSTRAR_AVISO = "AVISO: %s%n";
	
	private Scanner scEntrada = new Scanner(System.in);
	
	/**
	 * Muestra un texto con el formato establecido
	 * @param texto Mensaje de texto
	 */
	public void mostrarTexto(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRAR_TEXTO, texto);
	}
	
	/**
	 * Muestra un Aviso con el formato establecido
	 * @param texto Mensaje de aviso
	 */
	public void mostrarAviso(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRAR_AVISO, texto);
	}
	
	/**
	 * Muestra un título de primer nivel.
	 * @param texto titulo
	 */
	public void mostrarTitulo1(String texto) {
		System.out.println("\u001B[32m--- " + texto.toUpperCase() + " ---\u001B[0m");
	}
	
	/**
	 * Muestra un título de segundo nivel.
	 * @param texto titulo
	 */
	public void mostrarTitulo2(String texto) {
		System.out.println("\u001B[32m--- " + texto + " ---\u001B[0m");
	}
	
	/**
	 * Solicita un número al usuario y valida la entrada.
	 * @param texto de petición.
	 * @return El número leído.
	 * @throws ExcepcionES si la entrada no es un número válido.
	 */
	public int pedirNumero(String texto) throws ExcepcionES {
	    mostrarTexto(texto);
	    try {
	        String linea = scEntrada.nextLine();
	        return Integer.parseInt(linea);
	    } catch (NumberFormatException e) {
	        throw new ExcepcionES("Error: Debes introducir un número entero válido.", e);
	    }
	}
	
	/**
	 * Realiza una pausa en la ejecución.
	 * @param texto Mensaje de pausa.
	 */
	public void pausa(String texto) {
		mostrarTexto(texto);
		scEntrada.nextLine();
	}
	
	/**
	 * Pide una confirmación al usuario. 
	 * @param texto Pregunta de confirmación.
	 * @return Resultado de la confirmación.
	 */
	public boolean pedirconfirmacion(String texto) {
		mostrarTexto(texto);
		return scEntrada.nextLine().equalsIgnoreCase("Y");
		
	}
	
	/**
	 * Imprime los elementos de una lista.
	 * @return Lista  
	 */
	public List<String> mostrarlista(){
		return null;
	
	}
	
	/**
	 * @return El objeto Scanner.
	 */
	public Scanner getentrada() {
		return scEntrada;
		
	}
}
