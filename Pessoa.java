package com.Victor;

public class Pessoa {
	private String nome;
	private int idade;
	private int peso;
	private double altura;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public Pessoa(String nome, int idade, int peso, int altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Pessoa() {
		
	}
	
	public void envelhecer(int anos) {
		int faseCresc = 21 - idade;
		if(faseCresc > anos)
			faseCresc = anos;
		
		crescer((faseCresc)*0.5);		
		
		idade += anos;
		
	}
	
	public void engordar(int kg) {
		peso += kg;
	}
	
	public void emagrecer(int kg) {
		peso -= kg;
	}
	
	public void crescer(double cm) {
		altura += cm;
	}
	
}
