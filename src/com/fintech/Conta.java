package com.fintech;

public class Conta {
	int idConta;
	int numeroConta;
	double saldoConta;
	int tipoConta;
	
	
	public void depositar(double valor) {
		saldoConta = saldoConta + valor;
	}
	public void sacar(double valor) {
		saldoConta = saldoConta - valor;
	}

}
