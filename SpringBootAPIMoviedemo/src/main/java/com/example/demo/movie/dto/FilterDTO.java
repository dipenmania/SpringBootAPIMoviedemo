package com.example.demo.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class FilterDTO {
	
	private String rating;
    private String  generes;
    private String title;
}
