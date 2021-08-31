package banco;

import java.util.Scanner;

public class BancoPichincha {

	public static void main(String[] args) {
		System.out.println("----------Bienvenido Banco Pichincha----------");
		int N = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("-----Seleccione una Opcion-----");
			System.out.println();
			System.out.println("1): Retiro de dinero");
			System.out.println("2): Clave nueva");
			System.out.println("3): NO USAR ");
			System.out.println("4): Salir");
			N = sc.nextInt();
			if (N == 1) {
				System.out.println("Ingrese valor a retirar");
				N = sc.nextInt();
				System.out.println("El valor a retirar es " + N);
				System.out.println("precione 5 para regresar");
				N = sc.nextInt();
			}
			if (N == 2) {
				System.out.println("INGRESE NUEVA CLAVE");
				N = sc.nextInt();
				System.out.println("clave nueva actualizada");
				System.out.println("precione 5 para regresar");
				N = sc.nextInt();
			}
			if (N == 3) {
				System.out.println("SU CUENTA HA SIDO BLOQUEADA");

			}
			if (N == 4) {
				System.out.println("-----GRACIAS POR USAR BANCA MOVIL-----");
			}

		} while (N == 5);

	}

}
