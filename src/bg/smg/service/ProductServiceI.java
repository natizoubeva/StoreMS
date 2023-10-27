package bg.smg.service;

import bg.smg.model.Product;

import java.util.List;

public interface ProductServiceI {
    List<Product> getAll();
    Product getById();
    List<Product> getAllFromCategory(int id);
}
