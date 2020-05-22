package web.model;

public class Car {

    private String brand;

    private String series;

    private int licensePlate;

    public Car() {
    }

    public Car(String brand, String series, int licensePlate) {
        this.brand = brand;
        this.series = series;
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", licensePlate=" + licensePlate +
                '}';
    }
}
