 
package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona, crea y almacena la lógica de una tabla de multiplicar y su representación en texto.
 */
public class TablaMultiplicar {
	/**
	 * El número de la tabla que usaremos.
	 */
	private int numero;
	/**
	 * Almacena las lineas de la tabla
	 */
	private List<String> listaTextos = new ArrayList<>();
	
	/**
	 * Crea una nueva tabla y a esta se le asigna el numero.
	 * @param numero el numero que le asignaremos a la tabla
	 * @throws ExcepcionES 
	 */
	public TablaMultiplicar(int numero) throws ExcepcionES {
		if (numero < 0) {
	        throw new ExcepcionES("No se pueden crear tablas de números negativos.");
	    }
		this.numero = numero;
	}
	
	/**
	 * Generaremos la tabla creando todas las lineas de 1 - 10 y lo guarda en la lista.
	 */
	public void GenerarTabla () {
		for (int i = 1; i <= 10; i++) {
			String linea = String.format("%d x %d = %d", numero, i, (numero * i));
			listaTextos.add(linea);
		}	
	}
	
	/**
	 * Devuelve la tabla guardada para exportarla
	 * @return La lista de String de la tabla
	 */
	public List<String> toListaExportacion(){
		return listaTextos;
		
	}
	
	/**
	 * Devueelve la tabla guardada para poder mostrarla por pantalla.
	 * @return La lista de String de la tabla.
	 */
	public List<String> toListaPantalla(){
		return new ArrayList<>(listaTextos);
		
	}
	
	/*
	 * Devuelve por consola la representacion de toda la tabla.
	 * @return La lista de String unida por saltos de linea.
	 */
	@Override
	public String toString() {
		return String.join("\n", listaTextos);
	}
	
}

