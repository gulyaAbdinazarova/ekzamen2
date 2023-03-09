package wheatProduct;

import meatProduct.Product;

import java.time.LocalDate;

public class Flour extends Product {
    public Flour(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
