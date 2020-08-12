package com.cg.movie.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cg.movie.entity.Theatre;

/**************************************************************************************
 *          @author           Naveen J
 *          Description       It is a DAO ( Data Access Object) interface for the Theatre
 *          					@Repository is to indicate that the class is directly 
 *          					linked with Database
 *         
 *          @version          1.0
 *          Created Date      10-AUG-2020
***************************************************************************************/
@Repository
public interface TheatreDao extends JpaRepository<Theatre, Integer>{
	
	@Query(" FROM Theatre  where theatre_city=:x")
	public List<Theatre> findTheatreByCity(@Param("x")String id); 
	
	@Query(" FROM Theatre  where movie_id.movie_name=:x")
	public Theatre findMoviebyName(@Param("x")String name);
	
	@Query(" FROM Theatre  where theatre_name=:x")
	public List<Theatre> findTheatreName(@Param("x") String name);

}
