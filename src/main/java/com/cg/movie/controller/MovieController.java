package com.cg.movie.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.MovieBootcampApplication;
import com.cg.movie.entity.Movie;
import com.cg.movie.entity.Theatre;
import com.cg.movie.exception.TheatreException;
import com.cg.movie.service.TheatreService;

/**************************************************************************************
 *          @author           Naveen J
 *          Description       It is a Rest Controller class that provides the suitable
 *                                       Movie Management methods for the given 
 *                                       matching URL and returns response in different
 *                                       types of data objects.
 *          @version          1.0
 *          Created Date      10-AUG-2020
***************************************************************************************/


@RestController
public class MovieController {

	@Autowired
	TheatreService theatreService;
	
	Logger logger = LoggerFactory.getLogger(MovieBootcampApplication.class);
	String msg;

	@PostMapping("theatre")
	public ResponseEntity<Theatre> addTheatre(@RequestBody Theatre theatre) throws TheatreException {
		msg = "adding the theatre :";
		logger.info(msg);
		Theatre theatre_response = theatreService.addTheatre(theatre);
		return new ResponseEntity<Theatre>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("theatre")
	public ResponseEntity<List<Theatre>> allTheatres(){
		msg = "Fetching the Results of theatres :";
		logger.info(msg);
		List<Theatre> list_response =theatreService.allTheatres();
		return new ResponseEntity<List<Theatre>>(list_response,HttpStatus.OK);
	}
	
	@DeleteMapping("theatre/{id}")
	public ResponseEntity<Theatre> deleteTheatre(@PathVariable("id") int theatreId) throws TheatreException{
		msg = "deleting the theatre:";
		logger.info(msg);
		Theatre theatre_response = theatreService.deleteTheatre(theatreId);
		return new ResponseEntity<Theatre>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("theatre/{id}")
	public ResponseEntity<Theatre> findTheatreById(@PathVariable("id") int theatreId) throws TheatreException{
		msg = "Fetching the theatre by Id:"+theatreId;
		logger.info(msg);
		Theatre theatre_response = theatreService.findTheatreById(theatreId);
		return new ResponseEntity<Theatre>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("theatre/city/{City}")
	public ResponseEntity<List<Theatre>> findTheatreByCity(@PathVariable("City") String location) throws TheatreException{
		msg = "Fetching the List of theatres by city name :" + location;
		logger.info(msg);
		List<Theatre> theatre_response = theatreService.findTheatreByCity(location);
		return new ResponseEntity<List<Theatre>>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("theatre/movie/{name}")
	public ResponseEntity<Theatre> findMovieByName(@PathVariable("name") String name) throws TheatreException{
		msg = "Fetching the Theatre by Movie Name :" + name;
		logger.info(msg);
		Theatre theatre_response = theatreService.findMovieByName(name);
		return new ResponseEntity<Theatre>(theatre_response,HttpStatus.OK);
	}
	
	@GetMapping("movie")
	public ResponseEntity<List<Movie>> allMovies(){
		msg = "Fetching the Results of Movies :";
		logger.info(msg);
		List<Movie> list_response =theatreService.findAllMovies();
		return new ResponseEntity<List<Movie>>(list_response,HttpStatus.OK);
	}
	
	@PostMapping("movie")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) throws TheatreException {
		msg = "Adding the movie :";
		logger.info(msg);
		Movie movie_response = theatreService.addMovie(movie);
		return new ResponseEntity<Movie>(movie_response,HttpStatus.OK);
	}
	
	@DeleteMapping("movie/{id}")
	public ResponseEntity<Movie> deleteMovie(@PathVariable("id") int movieId) throws TheatreException{
		msg = "Deleting the movie :";
		logger.info(msg);
		Movie movie_response = theatreService.deleteMovie(movieId);
		return new ResponseEntity<Movie>(movie_response,HttpStatus.OK);
	}
}
