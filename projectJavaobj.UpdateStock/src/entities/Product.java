package entities;

public class Product {
	private int id;
	private String name;
	private double price;
	private double quantity;

	public Product() {
	}

	public Product(int id, String name, double price, double quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price, double quantity, double updateStock) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		updateStock(updateStock);
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void updateStock(double updateStock) {
		this.quantity += updateStock;
	}
	
	public void removeStock(double updateStock) {
		this.quantity -= updateStock;
	} 
	
	public String toString() {
		return name
				+", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

}
