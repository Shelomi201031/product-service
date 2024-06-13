package com.example.product_service.service;

import com.example.product_service.dto.ProductRequest;
import com.example.product_service.model.Product;
import com.example.product_service.repository.ProductRepositorty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j // for the log. lombok will be enabled this feature
public class ProductService {
    // here instead of use @Autowired we use contructor for this and constructer will ne automatically created using @RequiredArgsConstructor
    private final ProductRepositorty productRepositorty;

    //DTO is the ProductRequest
    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepositorty.save(product);
        //use this one or below one//log.info("Product " + product.getId() +"is saved" );
        log.info("Product {} is saved", product.getId());
    }
}
