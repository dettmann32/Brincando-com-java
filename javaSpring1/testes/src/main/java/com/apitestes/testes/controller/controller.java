package com.apitestes.testes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apitestes.testes.modules.products.productsIcms;

@RestController
public class controller {
    
@GetMapping
String getRout(){
    return "hello World";
}

@GetMapping("/icms")
void icmsProduct(){
    
    productsIcms produto = new productsIcms("maca",123,(float) 1.99,17, (float)58.82);
    System.out.println(produto.getSKU());
    System.out.println(produto.getPrice());
    System.out.println(produto.getValueICMS());
    System.out.println(produto.getValueTot());
    



}

}
