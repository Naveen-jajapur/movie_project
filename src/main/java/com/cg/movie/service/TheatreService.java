package com.cg.movie.service;

import java.util.List;

import com.cg.movie.entity.Movie;
import com.cg.movie.entity.Theatre;
import com.cg.movie.exception.TheatreException;

public interface TheatreService {

	public Theatre addTheatre(Theatre theatre)throws TheatreException;
	public List<Theatre> allTheatres();
	public Theatre deleteTheatre(int theatreId) throws TheatreException;
	public Theatre findTheatreById(int theatre_id) throws TheatreException;
	public List<Theatre> findTheatreByCity(String location) throws TheatreException;
	public List<Theatre> findTheatreByName(String name);
	public Theatre findMovieByName(String name) throws TheatreException;
	public Movie addMovie(Movie movie) throws TheatreException;
	public List<Movie> findAllMovies();
	public Movie deleteMovie(int movieId) throws TheatreException;
	public List<Movie> findMovieName(String name) throws TheatreException;
		
}
