package br.com.generation.lacosfor;

import java.util.Scanner;

public class exercicio06 {
	
	
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, quantosNumeros = 0, total = 0;
		
		while(true) {
			System.out.print("Digite um n�mero: ");
			numero = read.nextInt();
			
			if(numero == 0) {
				break;
			}

			if(numero % 3 == 0) {
				quantosNumeros++;
				total += numero;
			}
		}
		System.out.println("M�dia: " + (total / quantosNumeros));
		
		read.close();
	}
}


