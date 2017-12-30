package com.mundanemeatballs.demo.mrsandwich.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Company
 */
@Document
@Getter
@Setter
public class Company {
    @Id
    private String id;

    private String name;

    private List<Product> products;

    @DBRef
    private List<Category> categories;
}
