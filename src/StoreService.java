import meatProduct.Fish;
import meatProduct.list;

import java.util.List;

public class StoreService {

    private StoreService StoreService;

    public void addProduct(List<Product> products){
        for (Product product : products){
            if (product.getCompanyName().equals("Toiboss"))
                || product.getCompanyName().equals("Milka")
                    ||product.getCompanyName().equals("Nur")
                    && product.getLocalDate().isAfter(localDate.now().plusDays(5))){
                StoreService.getProducts().add(product);
            }
        }   
    }

    public void acceptProducts(List<Fish> products, list<product> storeCase) {
    }
}
