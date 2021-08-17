package com.cognizant.moviecruiser.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieService.class);
	
	//MCUC001
	@Transactional
	public List<Movie> getMovieListAdmin(){
		 LOGGER.info("Start");
		return movieRepository.findAll();
	}

	//MCUC002
	@Transactional
	public List<Movie> getMovieListCustomer(){
		LOGGER.info("Start");
		return movieRepository.findByActiveNotAndDateOfLaunchBefore(true, new Date());
	}

	//MCUC003
	@Transactional
	public void editMovie(Movie movienew) {
		LOGGER.info("Start");
		Movie movieold= movieRepository.findById(movienew.getId()).get();
		movieold=movienew;
		movieRepository.save(movieold);
		LOGGER.info("End");
		
	}
	
	//MCUC004
	@Transactional
	public Movie getMovie(long id) {
		LOGGER.info("Start");
		return movieRepository.findById(id).get();
	}
	

}
