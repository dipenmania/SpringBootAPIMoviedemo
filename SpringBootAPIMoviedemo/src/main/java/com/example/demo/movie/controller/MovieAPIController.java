package com.example.demo.movie.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.movie.dto.MoviesInDTO;
import com.example.demo.movie.dto.MoviesOutDTO;
import com.example.demo.movie.model.Movie;
import com.example.demo.movie.service.MovieService;
import com.example.demo.movie.service.MovieServiceImpl;

import io.micrometer.common.util.StringUtils;


@RestController
@RequestMapping("/movies")
public class MovieAPIController {
	
	@Autowired
	private MovieService movieService;
	

    @GetMapping("/checkaccess")
    public String validatedAPIToken() {
        return "The API Key is correct, Please proceed for other action";
    }
    
    
    @GetMapping("/popular")
    public Page<Movie> getPopularMovies(@RequestParam(value = "offset", required = false) Integer offset,
                                    @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                    @RequestParam(value = "sortBy", required = false) String sortBy) {
        if(null == offset) offset = 0;
        if(null == pageSize) pageSize = 50;
        if(StringUtils.isEmpty(sortBy)) sortBy ="rating";
        Sort.Direction direction = Sort.Direction.DESC;
        return movieService.getPopularMovies(PageRequest.of(offset, pageSize,Sort.by(direction,sortBy)));
    }
    
    
    @GetMapping("/search")
    public ResponseEntity<Page<MoviesOutDTO>> searchMovies(
            @RequestParam(name = "page", defaultValue = "0") Integer page,
            @RequestParam(name = "pageSize", defaultValue = "50") Integer size,
            @RequestParam(name = "sort", required = false) String sort,
            @RequestParam(name = "sortDirection", required = false) String sortDirection,
            @RequestParam(name = "title", required = true) String title,
            @RequestParam(name = "rating", required = false) String rating,
            @RequestParam(name = "generes", required = false) String generes
    ) {

        Page<MoviesOutDTO> moviesOutDto = movieService.searchEmployeeWithQueryPaginationSortingAndFiltering(
                MoviesInDTO.builder().title(title)
                        .rating(rating)
                        .generes(generes)
                        .page(page)
                        .size(size)
                        .sort(sort)
                        .sortDirection(sortDirection)
                        .build());

        return ResponseEntity.ok(moviesOutDto);
    }
   
    
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable("id") Long id) {
    Optional<Movie> movieDetails = movieService.getMovieById(id);

      if (movieDetails.isPresent()) {
        return new ResponseEntity<>(movieDetails.get(), HttpStatus.OK);
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }
}
