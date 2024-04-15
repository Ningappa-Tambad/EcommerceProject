package dev.Ningappa.EcommProductService.mapper;


import dev.Ningappa.EcommProductService.Entity.Product;
import dev.Ningappa.EcommProductService.dto.ProductResponseDTO;
import lombok.Getter;
import lombok.Setter;


public class ProductDTOEntityMapper {

public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product)
{
    ProductResponseDTO responseDTO=new ProductResponseDTO();
    responseDTO.setProductId(product.getId());
    responseDTO.setTitle(product.getTitle());
    responseDTO.setDescription(product.getDescription());
    responseDTO.setCategory(product.getCategory());
    responseDTO.setRating(product.getRating());
    responseDTO.setPrice(product.getPrice());
    responseDTO.setImageURL(product.getImageURL());

    return responseDTO;
}

}
