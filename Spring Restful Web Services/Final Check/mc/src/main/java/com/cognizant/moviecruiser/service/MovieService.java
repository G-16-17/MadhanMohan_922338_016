package com.cognizant.moviecruiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.dao.MovieDao;
import com.cognizant.moviecruiser.model.Movie;

@Service
public class MovieService {

	@Autowired
	private MovieDao movieDao;

	public List<Movie> getAllMovieAdmin() {

		return movieDao.getMovieListAdmin();
	}

	public Movie save(Movie movie) {
		return movieDao.modifyMovie(movie);
	}

	public Movie getMovie(long id) {
		return movieDao.getMovie(id);
	}
}
