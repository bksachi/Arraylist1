package h2databasedemo.restdummycrud.controller;


import h2databasedemo.restdummycrud.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @PostMapping
    public Customer addCustomer(){

        return null;
    }

@PutMapping("/{customerId}")
    public Customer updateCustomer(){

        return null;
    }

@GetMapping
    public List<Customer> getAllCustomer(){

        return null;
    }

@GetMapping("/{customeId}")
    public Customer getCustomerById(){

        return null;
    }
    @DeleteMapping("/{customeId}")
    public Customer deleteCustomer(){

        return null;
    }

    }

