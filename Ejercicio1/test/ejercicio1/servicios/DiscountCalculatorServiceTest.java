package ejercicio1.servicios;

import ejercicio1.entidades.DiscountCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorServiceTest {

    DiscountCalculatorService dcs;

    @BeforeEach
    void setUp() {
        dcs = new DiscountCalculatorService();
    }

    @Test
    void calculateDiscountPriceTest() {

        assertEquals(90000, dcs.calculateDiscountPrice(new DiscountCalculator(100000, 10)));
        assertEquals(0, dcs.calculateDiscountPrice(new DiscountCalculator(100000, 100)));
        assertEquals(100000, dcs.calculateDiscountPrice(new DiscountCalculator(100000, 0)));
    }
}