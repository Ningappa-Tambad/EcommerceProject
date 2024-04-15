package dev.Ningappa.EcommProductService.Service;

import dev.Ningappa.EcommProductService.Entity.Product;
import dev.Ningappa.EcommProductService.dto.FakeStoreProductResponseDTO;
import dev.Ningappa.EcommProductService.exception.NoProductPresentException;
import dev.Ningappa.EcommProductService.exception.ProductNotFoundException;

import java.util.List;

public interface ProductService
{

     List<FakeStoreProductResponseDTO> getAllProducts() throws NoProductPresentException;

    FakeStoreProductResponseDTO getProduct(int productId) throws ProductNotFoundException;
    Product createProduct(Product product);

    Product updateProduct(Product updatedProduct,int productId);


    boolean deleteProduct(int productId);


}
