package com.VictorPOO;

public class Banco {

	private int numConta;
	private String nome;
	private double saldo;
	
	
	public Banco(int numConta, String nome, double saldo) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
	}


	public Banco() {
	
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [numConta=");
		builder.append(numConta);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	public boolean saque(int valor) {
	
		try {
			
			saldo -= valor;
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
		return true;
	}
	
	
	public boolean deposito(int valor) {
		
		try {
			
			saldo += valor;
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
		return true;
		
	}
	
	
}
