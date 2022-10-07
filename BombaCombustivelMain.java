package com.Victor;

public class BombaCombustivelMain {
	
	
	public static void main(String[] args) {

		BombaCombustivel bc = new BombaCombustivel();
		
		bc.alteraCombustivel("gasolina");
		bc.alteraQuantidadeCombustivel(300);
		bc.alteraValor(5);
		
		System.out.println(bc.abastecePorLitro(10.5));
		System.out.println(bc.abastecePorValor(50));
		
		System.out.println(bc.toString());
		
	}

	
}
