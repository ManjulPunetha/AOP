package com.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart
{
    public void checkout(String status){
        System.out.println("Checkout shopping cart");
    }

    public int quantity(){
        return 5;
    }
}
