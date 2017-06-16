package com.sprhib.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Ja on 15.06.2017.
 */
@Entity // This tells Hibernate to make a table out of this class
@Table(name="boots")
public class Boot {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idboots;
    private String brand;
    private String model;
    private String product_code;
    private String gender;
    private String color;
    private String category;
    private String description;
    private BigDecimal price;
    private Integer size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getIdboots() {
        return idboots;
    }

    public void setIdboots(Integer idboots) {
        this.idboots = idboots;
    }
}
