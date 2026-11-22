package com.dotcom.misc_brewery.web.service;

import com.dotcom.misc_brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID curomerId);
}
