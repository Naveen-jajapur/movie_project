package com.cg.movie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.movie.entity.Movie;


/**************************************************************************************
 *          @author           Naveen J
 *          Description       It is a DAO ( Data Access Object) interface for the Movie
 *          					@Repository is to indicate that the class is directly 
 *          					linked with Database
 *         
 *          @version          1.0
 *          Created Date      10-AUG-2020
***************************************************************************************/
@Repository
public interface MovieDao extends JpaRepository<Movie, Integer>{
	
	@Query(" FROM Movie  where movie_name=:x")
	public List<Movie> findMovieName(@Param("x") String name);

}
