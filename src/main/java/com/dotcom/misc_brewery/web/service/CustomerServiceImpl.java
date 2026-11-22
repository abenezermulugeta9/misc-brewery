package com.dotcom.misc_brewery.web.service;

import com.dotcom.misc_brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID curomerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Black")
                .build();
    }
}
