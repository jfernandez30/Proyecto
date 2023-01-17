package com.Proyecto.calidad.Proyecto;
public class Sacerdote extends Personaje{
	
	public String habilidad; 
	public int mana;
	
	public Sacerdote(String nombre, int nivel,int mana) {
		super(nombre,nivel);
		mana = this.mana;
		// TODO Auto-generated constructor stub
	}

	public void lanzarHechizo(int nivel, int nivelMonstruo) {
		if(nivel>nivelMonstruo) {
			System.out.println("Rayo de la muerte es efectivo contra Monstruo.");
			nivel++;
		}else
			System.out.println("Has muerto.");
	}
	
	public void recargarMana(int mana) {
		if(mana<80) {
			System.out.println("Recargando man�.");
		}else
			System.out.println("Tu man� ya esta alto.");
	}
}
