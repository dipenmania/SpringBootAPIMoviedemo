package com.example.demo.movie.dto;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MoviesOutDTO {

	
	    private Long id;
	    private String title;
	    private Date releaseDate;
	    private Integer rating;
	    private String posterURL;

}

