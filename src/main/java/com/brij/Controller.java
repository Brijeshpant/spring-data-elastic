package com.brij;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class Controller {
    @Autowired
    CustomerService myService;

    @GetMapping
    public List<Customer> getCustomer(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "email", required = false) String email) {
        return myService.findCustomer(name, email);
    }
}
