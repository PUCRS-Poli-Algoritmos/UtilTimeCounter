package br.pucrs.util;

public class TimeCounter {
	private long tempoIni, tempoFim;
	
	public void initCounter() {
		tempoIni = System.nanoTime();
	}
	
	public double getCounter() {
		tempoFim = System.nanoTime();
		return (((double)tempoFim - (double)tempoIni) / (double)1000000000.0);
		
	}
}
