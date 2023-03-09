package wheatProduct;

import meatProduct.Product;

import java.time.LocalDate;

public class Bread extends Product {
    public Bread(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
