package br.com.almeida.impl;

public class GetNumber {

	/**
	 * Inicia a execução.
	 * 
	 * @param value
	 */
	public static int init(int n) {

		char numbers[] = ("" + n).toCharArray();
		char temp;

		for (int i = 1; i < numbers.length; i++) {
			for (int j = 0; j < i; j++) {
				if (numbers[i] >= numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		int brotherNumber = Integer.parseInt(new String(numbers));
		return (brotherNumber > 100000000) ? -1 : brotherNumber;
	}

}
