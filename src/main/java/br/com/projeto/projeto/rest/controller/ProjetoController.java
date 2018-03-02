package br.com.projeto.projeto.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjetoController {

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
    
    
    @GetMapping("/{name}")    
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
