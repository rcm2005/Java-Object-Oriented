package br.com.fiap;

public class ArCondicionado {

	public int temperatura;
	public String modo;
	
	public void aumentarTemperatura() {
		temperatura++;
	}
	public void diminuirTemperatura() {
		temperatura--;
	}
	public void trocaModo(String mode) {
		modo = mode;
	}
	public void mostrar() {
		System.out.println(temperatura + modo);
	}
}
