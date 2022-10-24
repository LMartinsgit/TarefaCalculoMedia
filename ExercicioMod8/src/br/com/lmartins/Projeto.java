package br.com.lmartins;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Projeto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			Scanner ler = new Scanner(System.in);
			
				String nome, materia1;
				int nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media;
				//media = ((double)(nota1 + nota2 + nota3 + nota4) / 4);
				
				
				System.out.println("Olá, eu vou te ajudar a tirar sua média!");
				Thread.sleep(1000);				
				System.out.println("Me diga seu nome.");
				nome = ler.nextLine();
				
				Thread.sleep(1000);
				System.out.printf("\nVamos lá %s, vou tirar sua média!",nome);
				Thread.sleep(1000);
				System.out.printf("\nPreciso de 4 notas para tirar sua média.");
				Thread.sleep(500);
				System.out.printf("\nMe fale qual matéria e nota você deseja tirar sua média, como no exemplo abaixo:");
				Thread.sleep(500);
				System.out.printf("\n1ª Semestre: Português\nNota: 8,5\n");
				Thread.sleep(500);
				System.out.printf("2ª Semestre: Português\nNota: 3\n");
				Thread.sleep(500);
				System.out.printf("\nVamos lá!");
				Thread.sleep(1000);				
				
				System.out.printf("\n1ª Semestre: "); materia1 = ler.nextLine();
				System.out.printf("Nota: "); nota1 = ler.nextInt();
				
				
				System.out.printf("\n2ª Semestre: %s \n", materia1); //materia2 = ler.nextLine();
				System.out.printf("Nota: "); nota2 = ler.nextInt();
				
				
				System.out.printf("\n3ª Semestre: %s \n", materia1); //materia3 = ler.nextLine();
				System.out.printf("Nota: "); nota3 = ler.nextInt();
				
				
				System.out.printf("\n4ª Semestre: %s \n", materia1); //materia4 = ler.nextLine();
				System.out.printf("Nota: "); nota4 = ler.nextInt();
				
				
					System.out.printf("\nSua média é:\n %6.2f",((double)(nota1 + nota2 + nota3 + nota4) / 4));
					Thread.sleep(1000);
					media = ((nota1 + nota2 + nota3 + nota4) / 4);
					if (media >= 6){
						System.out.println("\nParabéns pela sua nota!");
					}
					else System.out.println("\nEspero que você melhore suas notas na proxima vez!");
					Thread.sleep(500);
					System.out.printf("Até a próxima, %s!!!", nome);
					
						
	}

	
}
