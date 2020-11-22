public class Coche {
    private String license;
    private String brand;
    private String modelo;
    private String color;

    public Coche() {
    }

    public Coche(String license, String brand) {
        this.license = license;
        this.brand = brand;
    }

    public Coche(String license, String brand, String modelo, String color) {
        this.license = license;
        this.brand = brand;
        this.modelo = modelo;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
