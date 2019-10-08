package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class PadreMayusculas {

	public static void main(String[] args) {

		ProcessBuilder pb = new ProcessBuilder("Java", "-jar", "EjercicioMayusculas.jar");
		Scanner sc = new Scanner(System.in);

		try {
			Process p = pb.start();
			PrintStream ps = new PrintStream(p.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			String palabra = "";

			while (!palabra.equals("fin")) {
				palabra = sc.nextLine();
				ps.println(palabra);
				ps.flush();
				if (!palabra.equals("fin")) {
					String palabra1 = br.readLine();
					System.out.println(palabra1);
				}
			}
			ps.close();
			br.close();
		} catch (IOException e) {
		}
	}
}