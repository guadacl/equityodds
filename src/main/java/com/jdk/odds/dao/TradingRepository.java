package com.jdk.odds.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.jdk.odds.domain.Trading;

@RepositoryRestResource(collectionResourceRel = "trading", path = "trading")
public interface TradingRepository extends JpaRepository<Trading, Long>{
	List<Trading> findByPeriod(String p);
}
