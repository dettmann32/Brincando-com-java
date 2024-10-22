package com.apitestes.testes.modules.products;

import org.springframework.validation.annotation.Validated;


public record productIcmsDTO(@Validated String nome,@Validated Integer SKU,@Validated float price,@Validated float aliq,@Validated float reducao) {
    
    

}
