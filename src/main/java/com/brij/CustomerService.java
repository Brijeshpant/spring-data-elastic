package com.brij;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private  CustomerRepostory repository;
    private  ElasticsearchRestTemplate  template;
    @Autowired
    public CustomerService(CustomerRepostory repository, ElasticsearchRestTemplate template) {
        this.repository = repository;
        this.template = template;
    }

    public List<Customer> findCustomer(String name, String email) {

        /**
         * Refer this code for custom queries
         *
         * Criteria criteria = new Criteria("name").is("brij");
         *         BoolQueryBuilder builder = QueryBuilders.boolQuery();
         *         builder
         *                 .must(QueryBuilders.termQuery("name", "brij"));
         *         NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
         *         NativeSearchQuery build = nativeSearchQueryBuilder.withFilter(builder).build();
         *
         *         List<Customer> search = template.search(build, Customer.class).stream().map(SearchHit::getContent).collect(Collectors.toList());
         *
         *         BoolQueryBuilder qb = builder;
         */

        if (!Objects.isNull(name) && !Objects.isNull(email)) {
            return repository.findByNameAndEmail(name, email);
        }
        if (!Objects.isNull(name)) {
            return repository.findByName(name);
        }

        if (!Objects.isNull(email)) {
            return repository.findByEmail(email);
        }
        return new ArrayList<>();

    }
}