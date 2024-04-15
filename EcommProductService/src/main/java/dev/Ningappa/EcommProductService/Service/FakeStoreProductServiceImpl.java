package dev.Ningappa.EcommProductService.Service;

import dev.Ningappa.EcommProductService.Client.FakeStoreClient;
import dev.Ningappa.EcommProductService.Entity.Product;
import dev.Ningappa.EcommProductService.dto.FakeStoreProductResponseDTO;
import dev.Ningappa.EcommProductService.dto.FakeStroreProductRatingDTO;
import dev.Ningappa.EcommProductService.exception.NoProductPresentException;
import dev.Ningappa.EcommProductService.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FakeStoreProductServiceImpl implements ProductService{

    @Autowired
    private FakeStoreClient fakestoreclient;



    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() throws NoProductPresentException {
        List<FakeStoreProductResponseDTO>  fakeStoreProducts=fakestoreclient.getAllProducts();
       if(fakeStoreProducts==null)
       {
           throw new NoProductPresentException("Products are not found");
       }

        return fakeStoreProducts;
    }

    @Override
    public FakeStoreProductResponseDTO getProduct(int productId) throws ProductNotFoundException
    {
        FakeStoreProductResponseDTO fakeStoreProductResponsedDTO=fakestoreclient.getProductById((productId));

        if(fakeStoreProductResponsedDTO ==null)
        {
            throw new ProductNotFoundException("Product not found: "+productId);
        }
        return fakeStoreProductResponsedDTO;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product updatedProduct, int productid) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productid) {
        return false;
    }
}
