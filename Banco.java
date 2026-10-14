package entities;

public class Banco {
	private int numeroConta;
	private String nomeTitularConta;
	private double saldo;
	
	public Banco() {
	}
	
	public Banco(int numeroConta, String nomeTitularConta) {
		
		if(nomeTitularConta == null || nomeTitularConta.isBlank()) {
			throw new IllegalArgumentException("Nome invalido");
		}
		this.numeroConta = numeroConta; 
		this.nomeTitularConta = nomeTitularConta;
	}
	
	public Banco(int numeroConta, String nomeTitularConta, double saldo) {
		
		if(nomeTitularConta == null || nomeTitularConta.isBlank()) {
			throw new IllegalArgumentException("Nome invalido!!");
		}
		if(saldo < 0) {
			throw new IllegalArgumentException("Valor invalido!!");
		}
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nomeTitularConta;
	}
	
	public void setNome(String nome) {
		this.nomeTitularConta = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void saque(double valorSaque) {
			this.saldo -= valorSaque;
			this.saldo -= 5;
			System.out.println("Saque efeitivado com sucesso... seu saldo atual é " + getSaldo());
	
	}
	
	public void deposito(double deposito) {
		if(deposito <= 0 ) {
		 throw new IllegalArgumentException("Valor invalido!!");
		}
		this.saldo += deposito;
			
	}
	
	
}
