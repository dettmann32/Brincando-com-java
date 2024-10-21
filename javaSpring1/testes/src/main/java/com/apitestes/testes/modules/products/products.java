package com.apitestes.testes.modules.products;

public abstract class products {
    
    private String nome;
    private Integer SKU;
    private float price;

    public products(String nome, Integer SKU, float price){
        this.nome = nome;
        this.SKU = SKU;
        this.price = price;
    }

    //getters e setters 

    public String getNome() {
        return nome;
    }

    public float getPrice() {
        return price;
    }
    
    public Integer getSKU() {
        return SKU;
    }
}
