package com.sprhib.service;

import com.sprhib.dao.ProductDAO;
import com.sprhib.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ja on 15.06.2017.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    public void updateProduct(Product product) {
        productDAO.updateProduct(product);
    }

    public Product getProduct(int id) {
        return productDAO.getProduct(id);
    }

    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }

    public List<Product> getProducts() {
        return productDAO.getProducts();
    }

}
