package com.mundanemeatballs.demo.mrsandwich.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Category
 */
@Document
@Getter
@Setter
public class Category {
    @Id
    private String id;

    private String name;
}
