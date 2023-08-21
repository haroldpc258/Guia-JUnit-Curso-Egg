package ejercicio1.entidades;

public class DiscountCalculator {

    private double price;
    private double discount;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
