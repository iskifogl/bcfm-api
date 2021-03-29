package com.example.bfcmapi;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;


import java.util.*;

import com.stripe.*;
import com.stripe.exception.StripeException;
import com.stripe.model.WebhookEndpoint;

@RestController
public class alertController {

    public static void main(String[] args) {
        SpringApplication.run(BfcmApiApplication.class, args);
    }

    @PostMapping("/alert")
    public static void postBody() throws StripeException {

        Stripe.apiKey ="sk_test_51Ia5QoFrfcHqUCU9qUU8TiMSQij3ELj8wahPpzJlMpYjN63saW91EeveI3eNVAQxGuWQ7ERTAIZmHiVvFH8nKmua002y8gWClr"; //add your api key
        List<Object> events = new ArrayList<Object>();
        events.add("charge.succeeded");
        events.add("charge.failed");

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("enabled_events",events);
        param.put("url", "https://webhook.site/626baedf-bd17-4005-8d78-310e9ec5c9ef");

        WebhookEndpoint weEndpoint = WebhookEndpoint.create(param);
        System.out.println(weEndpoint);

    }

    }

