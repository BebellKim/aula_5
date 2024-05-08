package aula_5;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {

		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [10];

		Scanner ler = new Scanner(System.in);

		for (int i=0; i<5; i++) {
			System.out.println("Informe um valor para o vetor a: ");
			a[i]= ler.nextInt();
		}


		for (int i=0; i<5; i++) {
			System.out.println("Informe um valor para o vetor b: ");
			b[i]= ler.nextInt();
		}

		System.out.println("Os valores do vetor c são: ");
		for (int i=0; i<5; i++) {
			c[i]=a[i];
			c[i+5]=b[i];
		}
		

		for (int i=0; i<10; i++) {
			System.out.println(c[i]);
		}


		ler.close();
	}
}



