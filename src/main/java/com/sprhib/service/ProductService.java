package com.sprhib.service;

import com.sprhib.model.Product;
import com.sprhib.model.Team;

import java.util.List;

/**
 * Created by Ja on 15.06.2017.
 */
public interface ProductService {

    public void addProduct(Product product);
    public void updateProduct(Product product);
    public Product getProduct(int id);
    public void deleteProduct(int id);
    public List<Product> getProducts();

}

