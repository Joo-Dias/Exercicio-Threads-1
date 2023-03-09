package view;

import java.util.Random;
import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {

		int vetor[] = new int[1000];

		Random rd = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(100) + 1;
		}

		ThreadVetor thread1 = new ThreadVetor(1, vetor);
		ThreadVetor thread2 = new ThreadVetor(1, vetor);

		thread1.start();
		thread2.start();

	}

}
