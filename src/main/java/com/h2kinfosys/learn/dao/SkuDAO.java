package com.h2kinfosys.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.h2kinfosys.learn.dto.Sku;

@RepositoryRestResource(collectionResourceRel = "skus", path = "skus")
public interface SkuDAO extends JpaRepository<Sku, Integer> {

}
