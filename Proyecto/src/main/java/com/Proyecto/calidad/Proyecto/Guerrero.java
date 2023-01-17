package com.Proyecto.calidad.Proyecto;
public class Guerrero extends Personaje{

	public int Ira;
	public Guerrero(String nombre, int nivel, int Ira) {
		super(nombre, nivel);
		// TODO Auto-generated constructor stub
		Ira = this.Ira;
		
	}

	public void recargarIra(int Ira) {
		System.out.println("Recargando Ira");
	}
	
	public void Pelear(int nivel, int nivelMonstruo, int Ira) {
		if(nivel<nivelMonstruo && Ira >30) {
			System.out.println("Has destruido al Mostruo");
			nivel ++;
		}else {
			System.out.println("Has muerto");
		}
	}
}
