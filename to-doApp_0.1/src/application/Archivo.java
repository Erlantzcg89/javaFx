package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	public Archivo() {

	}

	public void escribir(String input, String path) {
		BufferedWriter bw;
		String ruta = path, texto = input;
		try {
			System.out.println("evento escribir");
			bw = new BufferedWriter(new FileWriter(ruta, true));
			bw.write(texto);
			bw.close();
		} catch (IOException e) {
			Auxiliar aux = new Auxiliar();
			aux.log("IOException");
		} catch (Exception e) {
			Auxiliar aux = new Auxiliar();
			aux.log("Exception");
		}
	}

	public void sobreescribir(String input, String path) {
		BufferedWriter bw;
		String ruta = path, texto = input;
		try {
			System.out.println("evento sobreescribir");
			bw = new BufferedWriter(new FileWriter(ruta));
			bw.write(texto);
			bw.close();
		} catch (IOException e) {
			Auxiliar aux = new Auxiliar();
			aux.log("IOException");
		} catch (Exception e) {
			Auxiliar aux = new Auxiliar();
			aux.log("Exception");
		}
	}

	public String leer(String path) {
		BufferedReader br;
		String ruta = path, linea = "", lectura = "";
		try {
			System.out.println("evento leer");
			br = new BufferedReader(new FileReader(ruta));
			while ((linea = br.readLine()) != null) {
				lectura += linea + "\r\n";
			}
			br.close();
		} catch (FileNotFoundException e) {
			Auxiliar aux = new Auxiliar();
			aux.log("FileNotFoundException");
		} catch (Exception e) {
			Auxiliar aux = new Auxiliar();
			aux.log("Exception");
		}
		return lectura;
	}

}
