package com.example.demo.movie.mapper;

import com.example.demo.movie.dto.MoviesOutDTO;
import com.example.demo.movie.model.Movie;

public class MovieMapperImpl implements MovieMapper {

	@Override
	public MoviesOutDTO moviesEntityToMoviesDto(Movie movie) {
		// TODO Auto-generated method stub
		if ( movie == null ) {
            return null;
        }
		MoviesOutDTO moviesOutDTO = new MoviesOutDTO();
		moviesOutDTO.setPosterURL( movie.getPosterURL());
		moviesOutDTO.setId( movie.getId() );
		moviesOutDTO.setTitle( movie.getTitle());
		moviesOutDTO.setReleaseDate( movie.getReleaseDate() );
		moviesOutDTO.setRating( movie.getRating() );
		
        return moviesOutDTO;
	}
	
	
	
}