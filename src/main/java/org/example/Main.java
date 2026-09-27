package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();

        User user = context.getBean(User.class);
        System.out.println(user.getName());
    }
}

/*
Every object is a bean, but every bean is not an object.

2 ways:
1. Annotations based
2. XML Configuration based
 */