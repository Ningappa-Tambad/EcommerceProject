package dev.Ningappa.EcommProductService.Client;

import dev.Ningappa.EcommProductService.dto.FakeStoreProductResponseDTO;
import dev.Ningappa.EcommProductService.dto.FakeStroreProductRatingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class FakeStoreClient
{
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.url}") //This annotation will fetch the value from application.properties file and inject the value to these variables
    private String fakeStoreAPIBaseURL;

    @Value(("${fakestore.api.product.path}"))
    private String fakeStoreAPIProductPath;

    public List<FakeStoreProductResponseDTO> getAllProducts()
    {
        String fakeStoreGetAllProductURL=fakeStoreAPIBaseURL.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponseList=
                restTemplate.getForEntity(fakeStoreGetAllProductURL,FakeStoreProductResponseDTO[].class);
        return List.of(productResponseList.getBody());

    }

    public FakeStoreProductResponseDTO getProductById(int id)
    {
        //fakestore.api.base.url=https://fakestoreapi.com/products/id

        String fakeStoreGetProductURL=fakeStoreAPIBaseURL.concat(fakeStoreAPIProductPath).concat("/"+id);
        RestTemplate restTemplate=restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductResponseDTO> productResponse=
                restTemplate.getForEntity(fakeStoreGetProductURL,FakeStoreProductResponseDTO.class);
        return  productResponse.getBody();


    }




}
