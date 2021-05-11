package com.brij;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepostory extends CrudRepository<Customer, String> {

    List<Customer> findByName(String name);

    List<Customer> findByEmail(String email);

    List<Customer> findByNameAndEmail(String name, String email);


}

