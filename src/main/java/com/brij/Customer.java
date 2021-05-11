package com.brij;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@ToString
@Document(indexName = "customer")
public class Customer {
    @Id
    private String id;
    private String name;
    private String dob;
    private String email;
    private Long mobile;

}
