package com.sprhib.dao;

import com.sprhib.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ja on 15.06.2017.
 */
@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addProduct(Product product) {
        getCurrentSession().save(product);
    }

    public void updateProduct(Product product) {
        Product productToUpdate = getProduct(product.getProductId());
        productToUpdate.setName(product.getName());
        productToUpdate.setUnitPrice(product.getUnitPrice());
        productToUpdate.setUnitsInStock(product.getUnitsInStock());
        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setManufacturer(product.getManufacturer());
        productToUpdate.setCategory(product.getCategory());
        getCurrentSession().update(productToUpdate);

    }

    public Product getProduct(int id) {
        Product product = (Product) getCurrentSession().get(Product.class, id);
        return product;
    }

    public void deleteProduct(int id) {
        Product product = getProduct(id);
        if (product != null)
            getCurrentSession().delete(product);
    }

    @SuppressWarnings("unchecked")
    public List<Product> getProducts() {
        return getCurrentSession().createQuery("from Product").list();
    }
}
