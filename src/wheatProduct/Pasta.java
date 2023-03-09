package wheatProduct;

import meatProduct.Product;

import java.time.LocalDate;

public class Pasta extends Product {
    public Pasta(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
