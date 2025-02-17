package com.example.demo.movie;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.web.servlet.MockMvc;
import com.example.demo.movie.controller.MovieAPIController;
import com.example.demo.movie.model.Movie;
import com.example.demo.movie.service.MovieServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(MovieAPIController.class)
public class MovieControllerTests {
  
  @Mock
  private MovieServiceImpl movieService;

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ObjectMapper objectMapper;


  @Test
  void shouldReturnMovie() throws Exception {
    long id = 1L;
    Date date = new Date(2009, 10, 1);
    Movie movie = new Movie("The Boss",date,"www.theboss.com","OK","U/A",7,"105 minutes", "English and Hindi");

    when(movieService.getMovieById(id)).thenReturn(Optional.of(movie));
    mockMvc.perform(get("/movie/{id}", id)).andExpect(status().isOk())
        .andExpect(jsonPath("$.id").value(id))
        .andExpect(jsonPath("$.title").value(movie.getTitle()))
        .andExpect(jsonPath("$.rating").value(movie.getRating()))
        .andExpect(jsonPath("$.genres").value(movie.getGenres()))
        .andDo(print());
  }

  @Test
  void shouldReturnNotFoundMovie() throws Exception {
    long id = 1L;

    when(movieService.getMovieById(id)).thenReturn(Optional.empty());
    mockMvc.perform(get("/movie/{id}", id))
         .andExpect(status().isNotFound())
         .andDo(print());
  }
  
  
  @Test
  void shouldReturnListOfMovies() throws Exception {
		
		Date date15 = new Date(2007, 7, 4);
		Date date16 = new Date(2015, 6, 5);
		Date date17 = new Date(2015, 5, 6);
		Date date18 = new Date(2009, 10, 1);
		Date date19 = new Date(2019, 9, 2);
		Date date20 = new Date(2001, 8, 3);
		Date date21 = new Date(2007, 7, 4);
		Date date22 = new Date(2015, 6, 5);
		
    List<Movie> movies = new ArrayList<>(
        Arrays.asList(new Movie("Boss India",date15,"www.bossindia.com","good","U/A",6,"165 minutes", "English,Dutch and Hindi"),
        		new Movie("The World",date16,"www.theworld.com","OK","U/A",7,"105 minutes", "English and Hindi"),
        		new Movie("World India",date17,"www.worldIndia.com","Best","A",8,"65 minutes", "English"),
        		new Movie("World Netherland Boss",date18,"www.Netherlandboss.com","Amazing","U/A",9,"145 minutes", "English,and Dutch"),
        		new Movie("World Netherland Boss",date18,"www.Netherlandboss.com","Amazing","U/A",9,"145 minutes", "English,and Dutch"),
        		new Movie("Latvia",date19,"www.Latvia.com","SUPER","U/A",10,"195 minutes", "English,Dutch and Hindi"),
        		new Movie("Pakistan",date20,"www.India.com","Best","U",6,"165 minutes", "English,Dutch and Hindi"),
        		new Movie("Afghanistan",date21,"www.Netherland.com","Best","U/A",7,"165 minutes", "English,Dutch and Hindi"),
                new Movie("Kazakhkistan",date22,"www.Sudan.com","OK","U/A",8,"165 minutes", "English and Hindi")
        		));


    when(movieService.getPopularMovies(PageRequest.of(0, 9, Sort.DEFAULT_DIRECTION))).thenReturn(any());
    mockMvc.perform(get("/movie/popular"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.size()").value(movies.size()))
        .andDo(print());
  }

}