package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
