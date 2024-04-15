package dev.Ningappa.EcommProductService.controller;


import dev.Ningappa.EcommProductService.Entity.Product;
import dev.Ningappa.EcommProductService.Service.ProductService;
import dev.Ningappa.EcommProductService.dto.FakeStoreProductResponseDTO;
import dev.Ningappa.EcommProductService.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Productcontroller {


    @Autowired
    private ProductService productService; //Field injection

    @GetMapping("/product")
    public ResponseEntity  getAllProducts()
    {
   List<FakeStoreProductResponseDTO> products=productService.getAllProducts();
   return ResponseEntity.ok(products);
    }

   @GetMapping("/product/{id}")
    public ResponseEntity getProductById(@PathVariable("id") int id) throws ProductNotFoundException {
       FakeStoreProductResponseDTO product=productService.getProduct(id);
       return ResponseEntity.ok(product);
   }

}
