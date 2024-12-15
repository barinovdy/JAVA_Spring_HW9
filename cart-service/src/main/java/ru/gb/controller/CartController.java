package ru.gb.controller;

import org.springframework.web.bind.annotation.*;
import ru.gb.model.Cart;
import ru.gb.model.CartItem;

@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from CartService";
    }

    @PostMapping("/add")
    public void addToCart(@RequestBody CartItem cartItem) {
        // Add logic to add item to cart
    }

    @DeleteMapping("/remove/{productId}")
    public void removeFromCart(@PathVariable Long productId) {
        // Add logic to remove item from cart
    }

    @PostMapping("/checkout")
    public void checkout(@RequestBody Cart cart) {
        // Add logic to process checkout
    }
}
