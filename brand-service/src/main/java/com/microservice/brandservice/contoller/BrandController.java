package com.microservice.brandservice.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {

    @GetMapping("/brand")
    public String getBarand()
    {
        return  "I will give brand to your procuct";
    }
}
