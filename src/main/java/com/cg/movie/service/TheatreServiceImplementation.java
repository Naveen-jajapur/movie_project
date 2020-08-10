package com.cg.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.MovieDao;
import com.cg.movie.dao.TheatreDao;
import com.cg.movie.entity.Movie;
import com.cg.movie.entity.Theatre;
import com.cg.movie.exception.TheatreException;

@Service
public class TheatreServiceImplementation implements TheatreService{
	
	@Autowired
	TheatreDao theatreDao;
	
	@Autowired
	MovieDao movieDao;

	@Override
	public Theatre addTheatre(Theatre theatre) throws TheatreException {
		List<Theatre> list=theatreDao.findTheatreName(theatre.getTheatre_name());
		if(list.isEmpty()) {
		return theatreDao.saveAndFlush(theatre);
		}
		else {
			throw new TheatreException("Theatre is already Found");
		}
	}

	@Override
	public List<Theatre> allTheatres() {
		return theatreDao.findAll();
	}

	@Override
	public Theatre deleteTheatre(int theatreId) throws TheatreException{
		Theatre temp=null;
		if(theatreDao.existsById(theatreId)) {
			temp=theatreDao.findById(theatreId).get();
			theatreDao.deleteById(theatreId);
		}
		else {
			throw new TheatreException(" No Theatre Found");
		}
		return temp;
	}

	@Override
	public Theatre findTheatreById(int theatre_id) throws TheatreException {
		Theatre temp =null;
		if(theatreDao.existsById(theatre_id)) {
			temp=theatreDao.findById(theatre_id).get();
		}
		else
		{
			throw new TheatreException(" No Theatre Found ");
		}
		return temp;
	}

	@Override
	public List<Theatre> findTheatreByCity(String location) throws TheatreException {
		List<Theatre> list = theatreDao.findTheatreByCity(location);
		if(list.isEmpty()) {
			throw new TheatreException(" No Theatres are found");
		}
		
		return list;
	}

	@Override
	public Theatre findMovieByName(String name) throws TheatreException {
		Theatre temp =theatreDao.findMoviebyName(name);
		return temp;
	}

	@Override
	public Movie addMovie(Movie movie) throws TheatreException{
		List<Movie> list = movieDao.findMovieName(movie.getMovie_name());
		if(list.isEmpty())
		return movieDao.saveAndFlush(movie);
		else
			throw new TheatreException(" Movie is already found");
			
	}

	@Override
	public List<Movie> findAllMovies() {
		// TODO Auto-generated method stub
		return movieDao.findAll();
	}

	@Override
	public Movie deleteMovie(int movieId) throws TheatreException {
		Movie temp=null;
		if(movieDao.existsById(movieId)) {
			temp=movieDao.findById(movieId).get();
			movieDao.deleteById(movieId);
		}
		else {
			throw new TheatreException(" No Movie Found");
		}
		return temp;
	}

	@Override
	public List<Theatre> findTheatreByName(String name) {
		// TODO Auto-generated method stub
		return theatreDao.findTheatreName(name);
	}

	@Override
	public List<Movie> findMovieName(String name) throws TheatreException {
		// TODO Auto-generated method stub
		return movieDao.findMovieName(name);
	}

}
