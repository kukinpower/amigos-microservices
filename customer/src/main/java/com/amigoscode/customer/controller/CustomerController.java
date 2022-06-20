package com.amigoscode.customer.controller;

import com.amigoscode.customer.model.CustomerRegistrationRequest;
import com.amigoscode.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public record CustomerController(
    CustomerService customerService
) {

  public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
    log.info("new customer registration {}", customerRegistrationRequest);
    customerService.registerCustomer(customerRegistrationRequest);
  }
}
