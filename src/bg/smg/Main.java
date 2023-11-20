package bg.smg;

import bg.smg.model.Product;
import bg.smg.service.ProductService;
import bg.smg.service.ProductServiceI;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        ProductServiceI service = new ProductService();
        List<Product> allProducts = service.getAll();
        for (Product p :allProducts) {
            System.out.println(p.getName());
        }

        Product firstProduct =  service.getById(2);
        System.out.println(firstProduct.getName());

        List<Product> allProductsFromCategory = service.getAllFromCategory(4);
        for (Product p : allProductsFromCategory) {
            System.out.println(p.getName());
        }
    }
}