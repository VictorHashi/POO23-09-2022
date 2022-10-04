package com.VictorPOO;

public class MainBanco {

	public static void main(String[] args) {
		
		Banco conta = new Banco();
		
		conta.setNome("Conta 1");
		conta.setSaldo(2000);
		conta.setNumConta(20);
		
		System.out.println(conta.toString());
		
		conta.deposito(2000);
		System.out.println(conta.getSaldo());
		conta.deposito(3000);
		System.out.println(conta.getSaldo());
		conta.saque(3500);
		System.out.println(conta.getSaldo());
	}

}
