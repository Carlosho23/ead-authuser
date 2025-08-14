package com.ead.authuser.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefreshScopeController {

    @Value("${authuser.refresdscope.name}")
    private String name;

    @RequestMapping("/refresdscope")
    public String refreshScope() {
        return this.name;
    }
}
