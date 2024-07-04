package Metodos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int menu = 0;
		int resp = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite se 1-Soma, 2-Diminuir, 3-Divisão, 4-Multiplicação e 5-Sair:");
		menu = entrada.nextInt();
		
	while(menu != 6) {
		
		SomarMetodos calc = new SomarMetodos();
		

		if(menu == 1) {
		System.out.println("SOMA");
		System.out.println("Se você quer com 2 parametros digite 1,se for com 3 digite 2:");
		resp = entrada.nextInt();
		if(resp == 1) {
			System.out.println("Digite o primeiro número:");
			int x = entrada.nextInt();
			System.out.println("Digite o segundo número:");
			int y = entrada.nextInt();		
			System.out.println("A resposta é " + calc.somar(x, y));
			break;
		}else if(resp == 2) {
			System.out.println("Digite o primeiro número:");
			int x = entrada.nextInt();
			System.out.println("Digite o segundo número:");
			int y = entrada.nextInt();
			System.out.println("Digite o terceiro número:");
			int z = entrada.nextInt();
			System.out.println("A resposta é " + calc.somar(x, y, z));
			break;
		}
		
		} else if(menu == 2) {
		System.out.println("DIMINUIR");
		System.out.println("Se você quer com 2 parametros digite 1,se for com 3 digite 2:");
		resp = entrada.nextInt();
		if(resp == 1) {
			System.out.println("Digite o primeiro número:");
			int x = entrada.nextInt();
			System.out.println("Digite o segundo número:");
			int y = entrada.nextInt();
			System.out.println("A resposta é " + calc.diminuir(x, y));
			break;
		}else if(resp == 2) {
			System.out.println("Digite o primeiro número:");
			int x = entrada.nextInt();
			System.out.println("Digite o segundo número:");
			int y = entrada.nextInt();
			System.out.println("Digite o terceiro número:");
			int z = entrada.nextInt();
			System.out.println("A resposta é " + calc.diminuir(x, y, z));
			break;
		}
		
		} else if(menu == 3) {
		System.out.println("DIVISÃO");
		System.out.println("Se você quer com 2 parametros digite 1,se for com 3 digite 2:");
		resp = entrada.nextInt();
		if(resp == 1) {
			System.out.println("Digite o primeiro número:");
			Double x = entrada.nextDouble();
			System.out.println("Digite o segundo número:");
			Double y = entrada.nextDouble();
			System.out.println("A resposta é " + calc.divisao(x, y));
			break;
		}else if(resp == 2) {
			System.out.println("Digite o primeiro número:");
			Double x = entrada.nextDouble();
			System.out.println("Digite o segundo número:");
			Double y = entrada.nextDouble();
			System.out.println("Digite o terceiro número:");
			Double z = entrada.nextDouble();
			System.out.println("A resposta é " + calc.divisao(x, y, z));
			break;
		}
		
		} else if(menu == 4) {
		System.out.println("MULTIPLICAÇÃO");
		System.out.println("Se você quer com 2 parametros digite 1,se for com 3 digite 2:");
		resp = entrada.nextInt();
		if(resp == 1) {
			System.out.println("Digite o primeiro número:");
			int x = entrada.nextInt();
			System.out.println("Digite o segundo número:");
			int y = entrada.nextInt();
			System.out.println("A resposta é " + calc.multiplicacao(x, y));
			break;
		}else if(resp == 2) {
			System.out.println("Digite o primeiro número:");
			int x = entrada.nextInt();
			System.out.println("Digite o segundo número:");
			int y = entrada.nextInt();
			System.out.println("Digite o terceiro número:");
			int z = entrada.nextInt();
			System.out.println("A resposta é " + calc.multiplicacao(x, y, z));
			break;
		}
		
		} else if(menu == 5) {
			System.out.println("Saindo...");
			break;
		} 
		
		}
	}

}