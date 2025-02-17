package com.example.demo.movie.specification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.example.demo.movie.dto.FilterDTO;
import com.example.demo.movie.model.Movie;

import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MovieSpecification {
	
	  public static Specification<Movie> getSpecification(FilterDTO filterDto) {
	        return (root, query, criteriaBuilder) -> {

	            List<Predicate> predicates = new ArrayList<>();
	            
	            predicates.add(criteriaBuilder.like(criteriaBuilder.upper(root.get("title")), "%" + filterDto.getTitle().toUpperCase() + "%"));
	            
	            if (filterDto.getGenres()!= null && !(filterDto.getGenres().isEmpty())) {
	                predicates.add(criteriaBuilder.equal(root.get("genres"),filterDto.getGenres()));
	            }

	            if (filterDto.getRating() != null && !(filterDto.getRating().isEmpty())) {
	                predicates.add(criteriaBuilder.equal(root.get("rating"),filterDto.getRating()));
	            }

	            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

	        };
	    }

}
