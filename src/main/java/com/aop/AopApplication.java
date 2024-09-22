package com.aop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopApplication
{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout("STATUS_OK");
        int quantity = cart.quantity();
    }
}
