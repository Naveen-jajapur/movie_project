package com.cg;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.VerificationCollector;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cg.movie.dao.MovieDao;
import com.cg.movie.dao.TheatreDao;
import com.cg.movie.entity.Movie;
import com.cg.movie.entity.Theatre;

import mockit.integration.junit4.JMockit;


@SuppressWarnings("unused")
@RunWith(JMockit.class)
public class TheatreServiceTests {	
	@Rule
	public VerificationCollector verificationCollector = MockitoJUnit.collector();
	@Mock
    private TheatreDao theatreDao;
	@Mock
	private MovieDao movieDao;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testAllTheatres(){
		List<Theatre> theatreList = new ArrayList<Theatre>();
		theatreList.add(new Theatre());
		when(theatreDao.findAll()).thenReturn(theatreList);
		List<Theatre> result = theatreDao.findAll();
		assertEquals(1, theatreList.size());
	}
	@Test
	public void testAddTheatre() {
	Theatre theatre=new Theatre();
     theatre.setTheatre_id(1234);
     theatre.setTheatre_name("PVR");
     theatre.setTheatre_city("HYD");
     theatre.setManager_name("NAVEEN");
     theatre.setManager_contact("1234567898");
     theatre.getMovie_id();
	}
	@Test
	public void testFindAllMovies(){
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie());
		when(movieDao.findAll()).thenReturn(movieList);
		List<Movie> result = movieDao.findAll();
		assertEquals(1, movieList.size());
	}
	@Test
	public void testAddMovie() {
	Movie movie=new Movie();
     movie.setMovie_id(101);
     movie.setMovie_name("BAHUBALI");
     movie.setMovie_genre("DRAMA");
     movie.setMovie_director("SS.RAJAMOULI");
     movie.setMovie_length(120);
     movie.setReleaseDate("9 JULY 2015");
    
	}

	@Test
	public void testDeleteMovie(){
   Movie movie=new Movie();
	movieDao.deleteById(101);
	verify(movieDao, times(1)).deleteById(101);
	}	
	@Test
	public void testDeleteTheatre(){
   Theatre theatre=new Theatre();
	theatreDao.deleteById(1234);
	verify(theatreDao, times(1)).deleteById(1234);
	}	
}
	