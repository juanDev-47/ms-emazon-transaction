package com.emazon.transaction.domain.dto.request;

public class SupplieDTO {

    private Long idProduct;
    private Long amountProduct;
    private String name;

    public SupplieDTO(Long idProduct, Long amountProduct, String name) {
        this.idProduct = idProduct;
        this.amountProduct = amountProduct;
        this.name = name;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(Long amountProduct) {
        this.amountProduct = amountProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
