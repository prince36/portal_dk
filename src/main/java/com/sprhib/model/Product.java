package com.sprhib.model;



import javax.persistence.*;

import java.math.BigDecimal;

/**
 * Created by Ja on 08.06.2017.
 */
@Entity // This tells Hibernate to make a table out of this class
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer productId;
    private String name;
    private BigDecimal unitPrice;
    private Integer unitsInStock;
    private String description;
    private String manufacturer;
    private String category;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUnitsInStock() {return unitsInStock;}

    public void setUnitsInStock(Integer unitsInStock) {this.unitsInStock = unitsInStock;}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}