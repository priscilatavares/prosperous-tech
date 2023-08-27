package com.fintech;

public class Conta {
	int idConta;
	int numeroConta;
	double saldoConta;
	int tipoConta;
	
	public Conta() {
		
	}
	
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	public int getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
	public void depositar(double valor) {
		saldoConta = saldoConta + valor;
	}
	public void sacar(double valor) {
		saldoConta = saldoConta - valor;
	}
	public double recuperarSaldo() {
		return saldoConta;
	}

}
