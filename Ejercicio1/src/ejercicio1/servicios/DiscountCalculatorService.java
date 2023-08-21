package ejercicio1.servicios;

import ejercicio1.entidades.DiscountCalculator;

public class DiscountCalculatorService {

    public double calculateDiscountPrice(DiscountCalculator product) {

        return product.getPrice() - product.getPrice()*product.getDiscount()/100;
        //return product.getPrice()*(1 - product.getDiscount()/100);
    }
}
