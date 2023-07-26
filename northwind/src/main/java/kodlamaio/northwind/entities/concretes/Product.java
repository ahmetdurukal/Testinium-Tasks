package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

//import lombok.Data;
//@Data
@Entity
@Table(name = "products")

public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private int id;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "product_name")

    private String productName;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "units_in_stock")
    private short unitsInStoch;
    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    public Product(){}


    public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStoch, String quantityPerUnit) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStoch = unitsInStoch;
        this.quantityPerUnit = quantityPerUnit;
    }

    public int getId() {
        return id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public short getUnitsInStoch() {
        return unitsInStoch;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setUnitsInStoch(short unitsInStoch) {
        this.unitsInStoch = unitsInStoch;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }
}
