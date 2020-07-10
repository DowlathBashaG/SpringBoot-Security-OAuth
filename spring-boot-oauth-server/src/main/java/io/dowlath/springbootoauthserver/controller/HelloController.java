package io.dowlath.springbootoauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Author Dowlath
 * @create 7/10/2020 11:56 PM
 */
@RestController
@RequestMapping("/rest/hello")
public class HelloController {

    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }
    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
