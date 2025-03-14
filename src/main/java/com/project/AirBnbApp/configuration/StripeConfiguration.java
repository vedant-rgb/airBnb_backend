package com.project.AirBnbApp.configuration;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfiguration {

    public StripeConfiguration(@Value("${stripe.secret.key}") String stripeSecretKey) {
        Stripe.apiKey=stripeSecretKey;
    }
}
