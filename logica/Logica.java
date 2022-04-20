package logica;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Logica {
	
	public static void main(String[] args) {
		
		List <Entrada> evento = new ArrayList <Entrada> ();
		
		int iniciadorMenu = 0;	
		do {
			System.out.println("Bienvenido, ingrese el numero de la opción: \n"
					+ "1. Comprar entrada\n"
					+ "2. Entrar como administrador\n"
					+ "3. Salir\n"
					+ "---------------------------");
			Scanner teclado = new Scanner(System.in);
			iniciadorMenu = teclado.nextInt();
			switch(iniciadorMenu) {
				case 1:
					menuUsuario(evento);
					break;
				case 2:
					menuAdmin(evento);
					break;
				case 3:
					System.out.println("Hasta luego, que tenga un buen día");
					break;
				default:
					System.out.println("Debe seleccionar una opcion del menu");
			}
		}while(iniciadorMenu != 3);
		
		
		
		
	}

	private static void menuAdmin(List<Entrada> evento) {
		System.out.println(evento.size());
		
		int iniciadorMenuAdmin = 0;
		do {
			System.out.println("Bienvenido a su dashboard, seleccione una opción: \n"
					+ "1. Ver cantidad de entradas vendidas\n"
					+ "2. Ver cantidad de entradas disponibles para venta\n"
					+ "3. Ver dinero recaudado\n"
					+ "4. Salir\n"
					+ "---------------------------");
			Scanner teclado = new Scanner(System.in);
			iniciadorMenuAdmin = teclado.nextInt();
			switch(iniciadorMenuAdmin) {
				case 1:
					entradasVendidas(evento);
					break;
				case 2:
					entradasDisponibles(evento);
					break;
				case 3:
					verRecaudacion(evento);
					break;
				case 4:
					System.out.println("Hasta luego, que tenga un buen día\n");
					break;
				default:
					System.out.println("Debe seleccionar una opcion del menu");
			}
		}while(iniciadorMenuAdmin != 4);
		
	}

	private static void entradasVendidas(List<Entrada> evento) {
		System.out.printf("Cantidad de entradas vendidas => %d%n%n",evento.size());
	}

	private static void entradasDisponibles(List<Entrada> evento) {
		int entradaDisponible = 30 - evento.size();
		System.out.printf("Quedan %d entradas por vender\n\n",entradaDisponible);		
	}
	
	private static void verRecaudacion(List<Entrada> evento) {
		int recaudacion = evento.size() * 5000;
		System.out.printf("El total recaudado por las ventas es =>$%d pesos.%n%n", recaudacion);	
	}


	private static void menuUsuario(List<Entrada> evento) {
		if (evento.size() != 2) {
		System.out.println("La entrada tiene un valor de $5000 pesos.\nPara comprar una entrada debe ingresar sus datos:");
		Scanner teclado = new Scanner( System.in);
		Entrada entrada = new Entrada();
		System.out.println("Ingrese su nombre:");
		entrada.nombre = teclado.next();
		System.out.println("Ingrese su apellido:");
		entrada.apellido = teclado.next();
		System.out.println("Ingrese su rut:");
		entrada.rut = teclado.next();
		System.out.printf("Su compra fue realizada con exito! con los siguientes datos: \n"
				+ "Nombre: %s %s%n"
				+ "Rut: %s%nHasta luego:)%n%n",
				entrada.getNombre(),
				entrada.getApellido(),
				entrada.getRut());
		evento.add(entrada);
		}else {
			System.out.println("Lo sentimos, ya no quedan entradas disponibles para el evento"
					+ "\nHasta luego.\n");
			
		}
		
		
	}

}
