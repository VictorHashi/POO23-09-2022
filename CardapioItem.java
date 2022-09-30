package com.Victor;

public class CardapioItem {

	private int codigo;
	private String nome;
	private float valor;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cardapio [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	public boolean registroItem(int codigo) {
		
		switch (codigo) {
		case 100: {
			this.nome = "Cachorro Quente";
			this.valor = (float)1.2;
			break;
		}
		case 101: {
			this.nome = "Bauru";
			this.valor = (float)1.3;
			break;
		}
		case 102: {
			this.nome = "Bauru com ovo";
			this.valor = (float)1.5;
			break;
		}
		case 103: {
			this.nome = "Hamburger";
			this.valor = (float)1.2;
			break;
		}
		case 104: {
			this.nome = "Cheeseburger";
			this.valor = (float)1.30;
			break;
		}
		case 105: {
			this.nome = "Refrigerante";
			this.valor = 1;
			break;
		}
		default:
			return false;
		}
		
		this.codigo = codigo;
		return true;
		
	}
		
}
