package aula_5;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {

		int a[] = new int [5];
		int soma=0;

		Scanner ler = new Scanner(System.in);

		for(int i =0; i<5; i++) {
			System.out.println("Informe um valor: ");
			a[i]= ler.nextInt();

			soma=soma+a[i];
		}

		if (soma>15 ){
			System.out.println("O valor é maior que 15, sendo ele " +soma);
		}
		else {
			System.out.println("O valor é menor que 15, sendo ele " +soma);
		}
		ler.close();


	}

}
