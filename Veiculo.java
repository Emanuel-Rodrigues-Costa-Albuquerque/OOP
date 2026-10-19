package entities;

public class Veiculo {
	private String placa;
	private String modelo;
	private double consumoPorLitro;
	private double litrosNoTanque;
	private double quilometragem;
	
	public Veiculo() {
	}
	
	public Veiculo(String placa, String modelo, double consumoPorLitro) {
		if(placa == null || placa.isBlank() && modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Placa e Modelo Não pode ser nulo nem Vazio!!");
		}
		if(consumoPorLitro <= 0) {
			throw new IllegalArgumentException("Consumo não pode ser menor ou igual a Zero!!!");
		}
		
		this.placa = placa;
		this.modelo = modelo;
		this.consumoPorLitro = consumoPorLitro;
	}
	
	public Veiculo(String placa, String modelo, double consumoPorLitro, double litrosNoTanque) {
		if(placa == null || placa.isBlank() && modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Placa e Modelo Não pode ser nulo nem Vazio!!");
		}
		if(consumoPorLitro <= 0) {
			throw new IllegalArgumentException("Consumo não pode ser menor ou igual a Zero!!!");
		}
		if(litrosNoTanque <= 0) {
			throw new IllegalArgumentException("O Conteudo do tanque não pode ser Menor ou igual a Zero!!!");
		}
		
		this.placa = placa;
		this.modelo = modelo;
		this.consumoPorLitro = consumoPorLitro;
		this.litrosNoTanque = litrosNoTanque;
		
	}
	
	
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getConsumoPorLitro() {
		return consumoPorLitro;
	}
	
	public void setConsumoPorLitro(double consumoPorLitro) {
		this.consumoPorLitro = consumoPorLitro;
	}
	
	public double getLitrosNoTanque() {
		return litrosNoTanque;
	}
	
	
	public double getQuilometragem() {
		return quilometragem;
	}
	
	public void abastecer(double litros) {
		if(litros < 0) {
			throw new IllegalArgumentException("Quantidade de Litros Invalida!!");
		}
		this.litrosNoTanque += litros;
	}
	
	public void percorrer(double km) {
		double x = km / this.consumoPorLitro;
		try { // >:)
		if( x >= this.litrosNoTanque) {
			throw new IllegalArgumentException("Combustivel Insuficiente para realizar a Viagem!!");
		}
		} catch (IllegalArgumentException e){
			System.out.print(e.getMessage());
		}
		System.out.println("Viagem Realizada!!");
		this.litrosNoTanque -= x;
		this.quilometragem += km;
	}
	
	public double automonia() {
		return this.litrosNoTanque * this.consumoPorLitro;
	}
	
	public static double custoViagem(double km, double consumoPorLitro, double precoLitro) {
		return km * precoLitro / consumoPorLitro; // deixei o consumo sem o this caso o usuario queira fazer um calculo considerando um consumo maior que o usual.
	}
	
	public String toString() {
		return getModelo()
		+ " ,| "
		+ getPlaca()
		+ " | "
		+ "Tanque: "
		+ getLitrosNoTanque()
		+ "L | "
		+ getQuilometragem()
		+ " | "
		+ "Autonomia: "
		+ String.format("%.2f km", automonia());
		
		
	}
}
