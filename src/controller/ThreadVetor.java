package controller;

public class ThreadVetor extends Thread {

	int num;
	int[] vetor;

	public ThreadVetor(int num, int[] vetor) {
		this.num = num;
		this.vetor = vetor;
	}

	public void run() {
		long tempoInicial = System.nanoTime();

		if (num % 2 == 0) {
			for (int i = 0; i < vetor.length; i++) {
				// Laço FOR
			}
		} else {
			for(int i : vetor) {
				// Laço FOR EACH
			}
		}
		
		long tempoFinal = System.nanoTime();
		double tempoResultado = (tempoFinal - tempoInicial) / 1000000000.0;
		System.out.println("O tempo para percorrer o vetor foi de " +tempoResultado+ "segundos.");
		
	}

}
