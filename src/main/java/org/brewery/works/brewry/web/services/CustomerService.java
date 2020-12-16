package org.brewery.works.brewry.web.services;

import org.brewery.works.brewry.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
