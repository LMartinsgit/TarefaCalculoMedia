package br.com.lmartins;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Projeto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			Scanner ler = new Scanner(System.in);
			
				String nome, materia1;
				float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media, mediapass;
				
				//media = ((double)(nota1 + nota2 + nota3 + nota4) / 4);
				
				
				System.out.println("Olá, eu vou te ajudar a tirar sua média!");
				Thread.sleep(1000);				
				System.out.println("Me diga seu nome:");
				nome = ler.nextLine();
				System.out.printf("%s, qual média você precisa para ser aprovado?\nUse ',' ao invés de '.': \n", nome);
				mediapass = ler.nextFloat();
				
				
				Thread.sleep(1000);
				System.out.printf("\nVamos lá %s, vou te ajudar!",nome);
				Thread.sleep(1000);
				System.out.println("\nPreciso de 4 notas para tirar sua média.");
				Thread.sleep(500);
				System.out.println("Me fale qual matéria e nota você deseja tirar sua média, como no exemplo abaixo:");
				Thread.sleep(500);
				System.out.println("\n1ª Semestre: Português\nNota: 8,5\n");
				Thread.sleep(500);
				System.out.println("\nVamos lá!");
				Thread.sleep(1000);				
				
				ler.nextLine();
				System.out.printf("\n1ª Semestre: ");
				materia1 = ler.nextLine();
				System.out.printf("Nota: ");
				nota1 = ler.nextFloat();
				
				
				System.out.printf("\n2ª Semestre: %s \n",materia1);
				System.out.printf("Nota: ");
				nota2 = ler.nextFloat();
				
				
				System.out.printf("\n3ª Semestre: %s \n", materia1);
				System.out.printf("Nota: ");
				nota3 = ler.nextFloat();
				
				
				System.out.printf("\n4ª Semestre: %s \n", materia1);
				System.out.printf("Nota: ");
				nota4 = ler.nextFloat();
				
				
					System.out.printf("\nSua média é:\n %6.2f",((nota1 + nota2 + nota3 + nota4) / 4));
					Thread.sleep(1000);
					media = ((nota1 + nota2 + nota3 + nota4) / 4);
					
					
					if (media >= mediapass){
						System.out.println("\nParabéns, você esta aprovado(a)!");
						Thread.sleep(500);
					}
					else if (media <= mediapass){
					System.out.println("\nQue pena, você reprovou!\nEspero que você melhore suas notas, boa sorte!");
					Thread.sleep(500);
					}
					System.out.printf("Até a próxima, %s!", nome);
					
					
	}

	
}