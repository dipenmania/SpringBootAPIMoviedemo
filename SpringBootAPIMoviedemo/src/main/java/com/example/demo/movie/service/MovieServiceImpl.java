package com.example.demo.movie.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.demo.movie.dto.FilterDTO;
import com.example.demo.movie.dto.MoviesInDTO;
import com.example.demo.movie.dto.MoviesOutDTO;
import com.example.demo.movie.mapper.MovieMapper;
import com.example.demo.movie.model.Movie;
import com.example.demo.movie.repository.MovieRepository;
import com.example.demo.movie.specification.MovieSpecification;

import lombok.extern.slf4j.Slf4j;




@Slf4j
@Service
public class MovieServiceImpl implements MovieService  {
	
	@Autowired
	private  MovieRepository movieRepository;


	
    public Page<MoviesOutDTO> searchEmployeeWithQueryPaginationSortingAndFiltering(MoviesInDTO moviesInDTO) {
        FilterDTO filterDto = FilterDTO.builder().rating(moviesInDTO.getRating())
                .genres(moviesInDTO.getGeneres()).title(moviesInDTO.getTitle())
                .build();

        List<Sort.Order> orders = new ArrayList<>();

        if (moviesInDTO.getSort() != null && !(moviesInDTO.getSort().isEmpty())) {
                Sort.Direction direction = Objects.equals(moviesInDTO.getSortDirection(), "desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
                orders.add(new Sort.Order(direction,moviesInDTO.getSort()));
         }

        PageRequest pageRequest = PageRequest.of(moviesInDTO.getPage(), moviesInDTO.getSize(),Sort.by(orders));

        Specification<Movie> specification = MovieSpecification.getSpecification(filterDto);
        log.info("Specification is"+specification.toString());

        Page<Movie> movies = movieRepository.findAll(specification,pageRequest);

        return movies.map(MovieMapper.INSTANCE::moviesEntityToMoviesDto);
    }
  
 
    public Page<Movie> getPopularMovies(PageRequest pageRequest) {
        return movieRepository.findAll(pageRequest);
    }
    
    public Optional<Movie> getMovieById(Long Id) {
        return movieRepository.findById(Id);
    }
}
