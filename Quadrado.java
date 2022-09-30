package com.Victor;

public class Quadrado {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	public Quadrado() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrado [lado=");
		builder.append(lado);
		builder.append("]");
		return builder.toString();
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		if(lado > 0)
			this.lado = lado;
	}
	
	public int area() {
		return (int)Math.pow(lado, 2);
	}
	
}
