package milkProduct;

import meatProduct.Product;

import java.time.LocalDate;

public class Milk extends Product {
    public Milk(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
