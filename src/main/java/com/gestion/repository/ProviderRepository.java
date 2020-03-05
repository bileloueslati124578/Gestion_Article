package com.gestion.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gestion.entities.*;
public interface ProviderRepository extends CrudRepository<Provider, Long>{
	
	@Query("FROM Article a WHERE a.provider.id = ?1")
	List<Article> findArticlesByProvider(long id);



}
