package com.fintech;

public class Teste {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.idConta = 1;
		conta.numeroConta = 2 ;
		conta.saldoConta = 100;
		conta.tipoConta = 3;
		
		conta.depositar(500);
		
		System.out.println(conta.saldoConta);
		
		
		
	}

}
