package entities;

public class Products {
	public double price;
	public int quantity;
	public String name;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", Valor $ "
			+ String.format("%.2f", price)
			+ ", Quantidade: "
			+ quantity
			+ ", Valor total do Estoque: "
			+ String.format("%.2f", totalValueInStock());
	}
}
