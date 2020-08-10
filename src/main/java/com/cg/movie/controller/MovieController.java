package com.cg.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.entity.Movie;
import com.cg.movie.entity.Theatre;
import com.cg.movie.exception.TheatreException;
import com.cg.movie.service.TheatreService;

@RestController
public class MovieController {

	@Autowired
	TheatreService theatreService;
	
	@PostMapping("theatre")
	public ResponseEntity<Theatre> addTheatre(@RequestBody Theatre theatre) throws TheatreException {
		Theatre theatre_response = theatreService.addTheatre(theatre);
		return new ResponseEntity<Theatre>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("theatre")
	public ResponseEntity<List<Theatre>> allTheatres(){
		List<Theatre> list_response =theatreService.allTheatres();
		return new ResponseEntity<List<Theatre>>(list_response,HttpStatus.OK);
	}
	
	@DeleteMapping("theatre/{id}")
	public ResponseEntity<Theatre> deleteTheatre(@PathVariable("id") int theatreId) throws TheatreException{
		Theatre theatre_response = theatreService.deleteTheatre(theatreId);
		return new ResponseEntity<Theatre>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("theatre/{id}")
	public ResponseEntity<Theatre> findTheatreById(@PathVariable("id") int theatreId) throws TheatreException{
		Theatre theatre_response = theatreService.findTheatreById(theatreId);
		return new ResponseEntity<Theatre>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("theatre/city/{City}")
	public ResponseEntity<List<Theatre>> findTheatreByCity(@PathVariable("City") String location) throws TheatreException{
		List<Theatre> theatre_response = theatreService.findTheatreByCity(location);
		return new ResponseEntity<List<Theatre>>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("theatre/movie/{name}")
	public ResponseEntity<Theatre> findMovieByName(@PathVariable("name") String name) throws TheatreException{
		Theatre theatre_response = theatreService.findMovieByName(name);
		return new ResponseEntity<Theatre>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("movie")
	public ResponseEntity<List<Movie>> allMovies(){
		List<Movie> list_response =theatreService.findAllMovies();
		return new ResponseEntity<List<Movie>>(list_response,HttpStatus.OK);
	}
	
	@PostMapping("movie")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) throws TheatreException {
		Movie movie_response = theatreService.addMovie(movie);
		return new ResponseEntity<Movie>(movie_response,HttpStatus.OK);
	}
	
	@DeleteMapping("movie/{id}")
	public ResponseEntity<Movie> deleteMovie(@PathVariable("id") int movieId) throws TheatreException{
		Movie movie_response = theatreService.deleteMovie(movieId);
		return new ResponseEntity<Movie>(movie_response,HttpStatus.OK);
	}
}
