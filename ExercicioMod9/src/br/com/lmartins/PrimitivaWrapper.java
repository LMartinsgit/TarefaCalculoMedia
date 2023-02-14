package br.com.lmartins;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class PrimitivaWrapper {
	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		
		
		Scanner ler = new Scanner(System.in);
		
		
		short s = 0;
		int i = s;
		
		System.out.printf("Simula casting.\n");
		Thread.sleep(500);
		System.out.printf("Insira um valor de 0 a 10000:\n");
		
			s = ler.nextShort();
			i = (i+s);
					
					if(s <=0){
						System.out.println("\nFavor inserir um valor de 0 a 10000. Comece novamente!");
						return;
					}
					else if(s >=10001) {
							System.out.println("\nFavor inserir um valor de 0 a 10000. Comece novamente!");
						return;
					}				

			System.out.printf("\nValor Primitivo:\nshort 16 bits %s.\n", s);
			Thread.sleep(1000);
			System.out.printf("\nValor Wrapper:\nint 32 bits  %s." ,i );

			
			
			

	}

}
