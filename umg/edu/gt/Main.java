package umg.edu.gt;

import java.io.File;
import java.util.Scanner;

public class Main {

	static final String ruta = "archivo.txt";
	Scanner scan = new Scanner(System.in);
	boolean alerta = false;
	Ticket ticket = new Ticket();
	Cola c = null;
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.menu();
	}	
	public void menu() {
		String nombre = "";
		String dpi = "";
		int op = 0;
		int contador = 1;
		if (c == null) {
			c = new Cola();
		}
		do {
			System.out.println("1. Ingrese ticket ");
			System.out.println("2. Listar");
			System.out.println("3. Eliminar");
			System.out.println("4. Salir");
			System.out.println("Ingrese opcion: ");
			alerta = false;
			do {
				try {
					op = Integer.parseInt(scan.nextLine());
					alerta = true;
				}catch(NumberFormatException e) {
					alerta = false;
				}
			}while(!alerta);
			
			switch(op) {
			case 1:
				System.out.println("Ingrese nombre: ");
				nombre = scan.nextLine();
				System.out.println("Ingrese DPI cliente");
				dpi = scan.nextLine();
				ticket.setNombre(nombre);
				ticket.setDpi(dpi);
				
			
					c.insertar(ticket);
					System.out.println("Ticket No.: "+contador);
					contador++;
				
			case 2:
				c.listar();
				break;
			case 3:
				c.quitar();
				break;
			}
			
		}while(op!=5);
		
	}
}
