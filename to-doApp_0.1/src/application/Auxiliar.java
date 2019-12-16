package application;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Versi�n 0.1 Clase auxiliar con diferentes herramientas
 * 
 * @author Erlantz
 */
public class Auxiliar {

	public Auxiliar() {

	}

	// separadores para trabajar en consola
	public void separador001() {
		String cadena001 = "=========================";
		System.out.println(cadena001);
	}

	public void separador002() {
		String cadena001 = "-------------------------";
		System.out.println(cadena001);
	}

	// generaci�n de n�meros aleatorios
	public int dado(int min, int max) {
		int rango = max - min + 1;
		return (int) (Math.random() * rango) + min;
	}

	// fecha de ahora en formato dd-MM-yyyy HH:mm:ss
	public String ahora() {
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return formato.format(fecha);
	}

	// escribir error en log.txt
	public void log(String error) {
		Archivo log = new Archivo();
		Auxiliar aux = new Auxiliar();
		log.escribir(aux.ahora() + " " + error + "\r\n", "log.txt");
	}

	// patr�n de men� para consola

}
