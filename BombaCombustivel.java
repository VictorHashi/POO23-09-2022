package com.Victor;

public class BombaCombustivel {

	private double quantidadeCombustivel;
	private double valorCombustivel;
	private String tipoCombustivel;
	
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void alteraQuantidadeCombustivel(double quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	public double getValorCombustivel() {
		return valorCombustivel;
	}
	public void alteraValor(double valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void alteraCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public BombaCombustivel(double quantidadeCombustivel, double valorCombustivel, String tipoCombustivel) {
		super();
		this.quantidadeCombustivel = quantidadeCombustivel;
		this.valorCombustivel = valorCombustivel;
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public BombaCombustivel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "BombaCombustivel [quantidadeCombustivel=" + quantidadeCombustivel + ", valorCombustivel="
				+ valorCombustivel + ", tipoCombustivel=" + tipoCombustivel + "]";
	}
	
	public double abastecePorValor(double valor) {
		updateQuantidade(valor/valorCombustivel);
		return valor / valorCombustivel;
	}
	
	public double abastecePorLitro(double litro) {
		updateQuantidade(litro);
		return litro * valorCombustivel;
	}
	
	public void updateQuantidade(double litro) {
		quantidadeCombustivel -= litro;
	}
	
}
