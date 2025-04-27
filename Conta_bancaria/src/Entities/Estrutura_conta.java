package Entities;

public class Estrutura_conta {
	    private final int numeroConta;
	    private String titular;
	    private double saldo;
	    private static final double TAXA_SAQUE = 5.0;
	    
	    public Estrutura_conta(int numeroConta, String titular, double DepositoInicial) {
	    	this.numeroConta = numeroConta;
	    	this.titular = titular;
	    	this.saldo = DepositoInicial;	
	    }	
	    public Estrutura_conta(int numeroConta, String titular) {
	    	this.numeroConta = numeroConta;
	    	this.titular = titular;
	    }
	    
	    // puxar dados do código principal, atributos da entities
	    // depois de get: maiúsculo
	    
	    public int getNumeroConta() {
	    	return numeroConta;
	    }
	    public String getTitular() {
	    	return titular;
	    }
	    public double getSaldo() {
	    	return saldo;
	    }
	    // void não retorna nada
	    
	    public void setTitular(String titular) {
	    	this.titular = titular;
	    }
	    
	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	    }
	  }
	    public void sacar(double valor) {
	    	saldo -= (valor + TAXA_SAQUE);
	    }
	    public void ExibirDados() {
	        System.out.printf("Conta: %d, Titular: %s, Saldo: %.2f%n", numeroConta, titular, saldo);	
}	    	
	    }	