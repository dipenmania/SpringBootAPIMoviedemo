package com.example.demo.movie.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MoviesInDTO {

	
	    private Long id;
	    private String title;
	    private String rating;
	    private String generes;
	    private String sortDirection;
	 
	    private Integer page;
	    private Integer size;
	    private String sort;
}
