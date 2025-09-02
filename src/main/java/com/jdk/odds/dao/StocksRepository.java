package com.jdk.odds.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.jdk.odds.domain.Stock;


@RepositoryRestResource(collectionResourceRel = "stocks", path = "stocks")
public interface StocksRepository extends JpaRepository<Stock, String>{

}
