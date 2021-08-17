package com.cognizant.moviecruiser;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;
import com.cognizant.moviecruiser.util.DateUtil;

@SpringBootApplication
public class MoviecruiserApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MoviecruiserApplication.class);
	private static MovieService movieService;

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(MoviecruiserApplication.class, args);

		ApplicationContext context = SpringApplication.run(MoviecruiserApplication.class, args);
		movieService = context.getBean(MovieService.class);
		LOGGER.info("Application Started...");

		testGetAllMovieAdmin(); // MCUC001
		testGetAllMovieCustomer(); // MCUC002
		testEditMovie(); // MCUC003
		testGetMovie(); //MCUC004

	}

	// MCUC001
	public static void testGetAllMovieAdmin() {
		LOGGER.info("Start");
		List<Movie> movieList = movieService.getMovieListAdmin();
		LOGGER.debug("Movies= {}", movieList);
		LOGGER.info("End");
	}

	// MCUC002
	public static void testGetAllMovieCustomer() {
		LOGGER.info("Start");
		List<Movie> movieList = movieService.getMovieListCustomer();
		LOGGER.debug("Movies= {}", movieList);
		LOGGER.info("End");
	}

	// MCUC003
	public static void testEditMovie() throws ParseException {
		LOGGER.info("Start");
		Movie movie =new Movie(2,"Spider Man","$1,518,812,988",true,DateUtil.convertToDate("29/08/2019"),"Fictional",true);
		movieService.editMovie(movie);
		LOGGER.debug("Movie : {}", movie);
		LOGGER.info("End");
	}

	//MCUC004
	private static void testGetMovie() {
		LOGGER.info("Start");
		Movie movie = movieService.getMovie(5);
		LOGGER.debug("Movie : {}", movie);
		LOGGER.info("End");

	}
}