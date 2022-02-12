package br.pucrs.util;

public class ContagemRes {
	private long[] result;
	private long iteracoes = 0;
	private long instrucoes = 0;
	private double timeSec = 0.0;
	private long valueRes = 0;
	private long tempoIni = 0, tempoFim = 0;
	
	public double getTime() {
		return timeSec;
	}
	public void setTime(double timeSec) {
		this.timeSec = timeSec;
	}
	public long getInstrucoes() {
		return instrucoes;
	}
	public void setInstrucoes(long instrucoes) {
		this.instrucoes = instrucoes;
	}
	public long[] getResult() {
		return result;
	}
	public void setResult(long[] v) {
		this.result = v;
	}
	public long getIteracoes() {
		return iteracoes;
	}
	public void setIteracoes(long iteracoes) {
		this.iteracoes = iteracoes;
	}
	public long getValueRes() {
		return valueRes;
	}
	public void setValueRes(long valueRes) {
		this.valueRes = valueRes;
	}
	
	public void incrIteracoes(long incr) {
		setIteracoes(getIteracoes() + incr);
	}

	public void incrInstrucoes(long instr) {
		setInstrucoes(getInstrucoes() + instr);
	}

	public void initClock() {
		tempoIni = tempoFim = System.nanoTime();
	}

	public double getClockSec() {
		tempoFim = System.nanoTime();
		timeSec =  ((double)tempoFim - (double)tempoIni) / (double)1_000_000_000.0;

		return timeSec;
	}

	public void resetCounters() {
		setIteracoes(0);
		setInstrucoes(0);
		initClock();
	}
}
