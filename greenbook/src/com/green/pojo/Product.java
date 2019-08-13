package com.green.pojo;

public class Product {
    private Integer id;

    private String productId;

    private Double productPrice;

    private Double productStar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getProductStar() {
        return productStar;
    }

    public void setProductStar(Double productStar) {
        this.productStar = productStar;
    }
}