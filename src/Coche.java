public class Coche {
	private String license;
	private String brand;
	private String model;
	private String color;

	public Coche() {
	}

	public Coche(String license, String brand) {
		this.license = license;
		this.brand = brand;
	}

	public Coche(String license, String brand, String model, String color) {
		this.license = license;
		this.brand = brand;
		this.model = model;
		this.color = color;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getmodel() {
		return model;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Metodos propios
	public String datos() {
		return "Matrícula: " + license + ", marca: " + brand + ", modelo: " + model
				+ ", color: " + color + ".";
	}
}
