package com.Proyecto.calidad.Proyecto;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
		 
		 int nivel = 10;
		 int ira = 100;
		 int mana = 100;
		 String nombre;
		 int opcion;
		 int nivelMonstruo = 2;
		
		 System.out.println("BIENVENIDO A: MUNDO DE MONSTRUOS");
		 System.out.println("Crea tu personaje:");
		 System.out.println("Que personaje vas a ser:");
		 System.out.println("1. Sacerdote");
		 System.out.println("2. Guerrero");
		 System.out.println("Introduce valor numerico (1 o 2)");
		 Scanner sc = new Scanner(System.in);
		 opcion = sc.nextInt();
		 
		 if(opcion == 1) {
			 
			 System.out.println("Introduce tu nombre:");
			 sc = new Scanner(System.in);
			 nombre = sc.next();
			 Sacerdote s1 = new Sacerdote(nombre,nivel,mana);
			 System.out.println("Has encontrado un bast�n, subes de nivel");
			 nivel++;
			 Monstruo s2 = new Monstruo("Monstruo de las arenas",nivelMonstruo);
			 s1.lanzarHechizo(nivel, nivelMonstruo);
			 
			if(opcion == 2) {
				 System.out.println("Introduce tu nombre:");
				 sc = new Scanner(System.in);
				 nombre = sc.next();
				 Guerrero g1 = new Guerrero(nombre,nivel,mana);
				 System.out.println("Has encontrado un haca, subes de nivel");
				 nivel++;
				 Monstruo m2 = new Monstruo("Monstruo de las arenas",nivelMonstruo); 
				 g1.Pelear(nivel, nivelMonstruo, ira);
			 
		 }
		
	 }
	}
}
