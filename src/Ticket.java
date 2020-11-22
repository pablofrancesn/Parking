public class Ticket {
    private int entranceHour;
    private String license;
    private int idWorker;
    private int num;
    private int exitHour;
    private double price;

    public Ticket() {
    }

    public Ticket(String license, int num) {
        this.license = license;
        this.num = num;
    }

    public Ticket(int entranceHour, String license, int idWorker, int num, int exitHour, double price) {
        this.entranceHour = entranceHour;
        this.license = license;
        this.idWorker = idWorker;
        this.num = num;
        this.exitHour = exitHour;
        this.price = price;
    }

    public int getEntranceHour() {
        return entranceHour;
    }

    public void setEntranceHour(int entranceHour) {
        this.entranceHour = entranceHour;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getExitHour() {
        return exitHour;
    }

    public void setExitHour(int exitHour) {
        this.exitHour = exitHour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
