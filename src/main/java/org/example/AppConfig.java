package org.example;

import org.example.payment.CardPaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Kunj",23);
    }

    @Bean
    public CardPaymentService createCardPaymentService(){
        return new CardPaymentService();
    }
}
