package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.moviecruiser.model.Movie;

@Component
public class MovieDaoCollectionImpl implements MovieDao {

	private static List<Movie> movieList;

	public MovieDaoCollectionImpl() {
		ApplicationContext context = new ClassPathXmlApplicationContext("moviecruiser.xml");
		movieList = (List<Movie>) context.getBean("movieList");
	}

	@Override
	public List<Movie> getMovieListAdmin() {
		return movieList;
	}

	@Override
	public List<Movie> getMovieListCustomer() {
		List<Movie> customerMovieList = new ArrayList<Movie>();

		for (int i = 0; i < movieList.size(); i++) {
			Movie movie = movieList.get(i);
			if ((movie.getDateOfLaunch().equals(new Date()) || movie.getDateOfLaunch().before(new Date()))
					&& movie.isActive()) {
				customerMovieList.add(movie);
			}
		}
		return customerMovieList;
	}

	@Override
	public Movie modifyMovie(Movie movie) {
		int a = 0;
		Movie m = null;
		for (Movie movie1 : movieList) {
			if (movie1.getId() == movie.getId()) {
				a = (int) movie.getId();
				movieList.set((a - 1), movie);
				return movie;
			}
		}

		return m;
	}

	public Movie getMovie(long movieId) {
		Movie movie = null;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getId() == movieId) {
				movie = movieList.get(i);
				break;
			}
		}
		return movie;
	}

}
