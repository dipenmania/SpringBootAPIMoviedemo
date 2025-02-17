package com.example.demo.movie.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.movie.dto.MoviesInDTO;
import com.example.demo.movie.dto.MoviesOutDTO;
import com.example.demo.movie.model.Movie;

public interface MovieService {

	
	 public Page<Movie> getPopularMovies(PageRequest pageRequest);
	 
	 public Optional<Movie> getMovieById(Long Id);
	 
	 public Page<MoviesOutDTO> searchEmployeeWithQueryPaginationSortingAndFiltering(MoviesInDTO moviesInDTO);
}
