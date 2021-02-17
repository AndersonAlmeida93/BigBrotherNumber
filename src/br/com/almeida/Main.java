package br.com.almeida;

import java.util.Scanner;

import br.com.almeida.impl.GetNumber;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrada: ");
		System.out.println("Saída " + GetNumber.init(scanner.nextInt()));
		
		scanner.close();
	}
}
