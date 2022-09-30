package com.Victor;

import java.util.ArrayList;
import java.util.Scanner;

public class CardapioMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<CardapioItem> pedido = new ArrayList<CardapioItem>();
		
		int answer = 3;
		
		do {
			
			do {
				if (answer>5||answer<1) 
					System.out.println("Responsta inválida");
				
				System.out.println("1 - Listar itens\n2 - Listar itens no pedido atual\n3 - Adicionar novo item\n4 - Excluir item do pedido atual\n5 - Finalizar pedido");
				answer = scan.nextInt();
				
				switch (answer) {
				case 1: {
					
					break;
				}
				case 2: {
					System.out.println(pedido);
					break;
				}
				case 3: {
					CardapioItem ci = new CardapioItem();
					System.out.println("Codigo: ");
					try {
						ci.registroItem(scan.nextInt());
					} catch (Exception e) {
						System.out.println("Código Inválido");
					}
					pedido.add(ci);
					break;
				}
				case 4: {
					
					break;
				}
				case 5: {
					
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + answer);
				}
				
			}while(answer>5||answer<=1);
			
			
		}while(!(answer==5));

		System.out.println(valorTotal(pedido));
		System.out.println(pedido.size());
		
		scan.close();
	}
	
	public static float valorTotal(ArrayList<CardapioItem> array) {
		
		float sum = 0;
		
		for (CardapioItem item : array) {
			sum += item.getValor();
		}
		
		return (float)sum;
	}

}
