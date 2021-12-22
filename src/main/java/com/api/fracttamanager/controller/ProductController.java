package com.api.fracttamanager.controller;

import com.api.fracttamanager.model.ProductModel;
import com.api.fracttamanager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    ProductService productService ;

    @PostMapping
    public ResponseEntity saveProduct(@RequestBody List<ProductModel> product){
        try {
            List<ProductModel> products = productService.createProduct (product);
            return ResponseEntity.ok (products);
        } catch (Exception exception){
            return ResponseEntity.badRequest ().body (exception);
        }
    }

    @GetMapping
    public ResponseEntity getProduct(@RequestHeader String id){
        try {
            Optional<ProductModel> product = productService.findById (id);
            return ResponseEntity.ok (product);
        } catch (Exception exception){
            return ResponseEntity.badRequest ().body (exception);
        }
    }

    @GetMapping("/all")
    public ResponseEntity getAllProducts(){
        try {
            List<ProductModel> products = productService.findAllWorkplaces ();
            return ResponseEntity.ok (products);
        } catch (Exception exception){
            return ResponseEntity.badRequest ().body (exception);
        }
    }
}
