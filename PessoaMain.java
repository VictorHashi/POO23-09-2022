package com.Victor;

public class PessoaMain {

	public static void main(String []args) {

		Pessoa p = new Pessoa();
		
		Pessoa p1 = new Pessoa("Nome1", 10, 30, 110);

		p.setNome("ASDF");
		p.setIdade(22);
		p.setPeso(70);
		p.setAltura(170);
		
		p1.envelhecer(12);
		
		System.out.println(p.toString());
		System.out.println(p1.toString());
		
		p1.crescer(20);
		System.out.println(p1.toString());
	}
	
}
