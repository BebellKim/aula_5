package aula_5;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		
		String a[] = new String [5];
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Informe um nome: ");
			a[i]= ler.next();
			
		}
      for (int i=0; i<5; i++) {
    	  System.out.println(a[i]);
      }
      ler.close();
	}

}

