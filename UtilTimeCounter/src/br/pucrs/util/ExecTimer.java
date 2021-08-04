package br.pucrs.util;

public class ExecTimer {
	private long ini;
	private long fim;
	
	public void start() {
		ini = System.nanoTime();
	}
	
	public void finish() {
		fim = System.nanoTime();
	}
	
	public double getTime() {
		return ((double)fim - (double)ini) / (double)1000000000.0;
	}
}
