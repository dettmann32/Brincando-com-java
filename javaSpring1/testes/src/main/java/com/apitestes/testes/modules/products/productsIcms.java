package com.apitestes.testes.modules.products;

public class productsIcms extends products {
    
    float valueICMS;
    float valueTot;

    public productsIcms(String nome, Integer SKU, float price, float aliq){
        super(nome,SKU,price);

        this.valueICMS = price * aliq / 100;
        this.valueTot = valueICMS + price; 
    }

    // with icms calc base reduce 

    public productsIcms(String nome, Integer SKU, float price, float aliq,float reducao){
        super(nome,SKU,price);

        float baseDeCalc = price * (1 - (reducao / 100));



        this.valueICMS = baseDeCalc * aliq / 100;
        this.valueTot = valueICMS + price; 


    }

    public float getValueICMS() {
        return valueICMS;
    }

    public float getValueTot() {
        return valueTot;
    }
}
