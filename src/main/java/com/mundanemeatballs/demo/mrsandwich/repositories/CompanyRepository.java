package com.mundanemeatballs.demo.mrsandwich.repositories;

import com.mundanemeatballs.demo.mrsandwich.model.Category;
import com.mundanemeatballs.demo.mrsandwich.model.Company;
import com.mundanemeatballs.demo.mrsandwich.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * CompanyRepository
 */
@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface CompanyRepository extends MongoRepository<Company, String> {
    Company findOneByProducts(Product product);
    Company findOneByCategories(Category category);
}