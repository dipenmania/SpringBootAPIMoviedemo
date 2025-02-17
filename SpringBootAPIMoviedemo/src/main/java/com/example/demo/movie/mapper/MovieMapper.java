package com.example.demo.movie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.movie.dto.MoviesOutDTO;
import com.example.demo.movie.model.Movie;

@Mapper()
public interface MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    MoviesOutDTO moviesEntityToMoviesDto(Movie movie);
}

