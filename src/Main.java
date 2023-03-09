import meatProduct.Fish;
import meatProduct.LambMeat;
import meatProduct.Sausage;
import meatProduct.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fish> products = new ArrayList<>();
        products.add(new Fish(1,"Nemo","Toiboss", LocalDate.of(2023,03,15)));
        products.add(new Fish(2,"Pike","Toiboss", LocalDate.of(2023,03,25)));
        products.add(new Fish(3,"Meckerel","Toiboss",LocalDate.of(2023,03,05)));

        List<LambMeat> producty = new ArrayList<>();
        producty.add(new LambMeat(4,"Benefits","Toiboss",LocalDate.of(2023,04,01)));
        producty.add(new LambMeat(5,"Mutton","Toiboss",LocalDate.of(2023,04,05)));
        producty.add(new LambMeat(6,"Shank","Toiboss",LocalDate.of(2023,03,01)));

        List<Sausage> product = new ArrayList<>();
        product.add(new Sausage(7,"Paroshka","Toiboss",LocalDate.of(2023,03,10)));
        product.add(new Sausage(8,"Karoshka","Toiboss",LocalDate.of(2023,03,02)));
        product.add(new Sausage(9,"Saroshka","Toiboss",LocalDate.of(2023,03,05)));

        List<Sausage> list1 = new ArrayList<>();
        list1.addAll(product);
        List<Product> storeCase = new ArrayList<>();

        StoreService storeService = new StoreService();
        storeService.acceptProducts(products,storeCase);


        List<LambMeat> list2 = new ArrayList<>();
        list2.addAll(producty);

        List<Fish> list3 = new ArrayList<>();
        list3.addAll(products);


    }
    public static void method(list<? extends Product>products) {
        for (Product product : products) {
            if (product.getDate().plusDays(5).isBefore(LocalDate.now())){
                System.out.println("Pros");
            }
            else {
                System.out.println("Ne Pros");
            }

        }
    }
}