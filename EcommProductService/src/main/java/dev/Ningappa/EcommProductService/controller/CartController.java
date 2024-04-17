package dev.Ningappa.EcommProductService.controller;


import dev.Ningappa.EcommProductService.Client.FakeStoreClient;
import dev.Ningappa.EcommProductService.dto.FakeStoreCartResponseDTO;
import dev.Ningappa.EcommProductService.exception.CartNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private FakeStoreClient fakeStoreClient;

@GetMapping("/cart/{userId}")
    public ResponseEntity getCartForUser(@PathVariable("userId") int userId) throws CartNotFoundException
{
    List<FakeStoreCartResponseDTO> cartResponse=fakeStoreClient.getCardByUserId(userId);

    if(cartResponse==null)
    {
        throw new CartNotFoundException("Cart not found for:  "+userId);
    }


    return  ResponseEntity.ok(cartResponse);
}

}
