package com.apitestes.testes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apitestes.testes.modules.products.productIcmsDTO;
import com.apitestes.testes.modules.products.productsIcms;

@RestController
public class controller {
    
@GetMapping
String getRout(){
    return "hello World";
}

@PostMapping("/icms")
void icmsProduct(@RequestBody productIcmsDTO produtoApi){
    
    productsIcms produto = new productsIcms(produtoApi.nome(),produtoApi.SKU(),produtoApi.price(),produtoApi.aliq(),produtoApi.reducao());
    System.out.println(produtoApi.toString());
    System.out.println(produto.getSKU());
    System.out.println(produto.getPrice());
    System.out.println(produto.getValueICMS());
    System.out.println(produto.getValueTot());
    



}

}
