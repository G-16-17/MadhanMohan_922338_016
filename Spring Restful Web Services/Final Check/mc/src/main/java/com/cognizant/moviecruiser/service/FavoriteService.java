package com.cognizant.moviecruiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.dao.FavoritesDao;
import com.cognizant.moviecruiser.exception.FavoritesEmptyException;
import com.cognizant.moviecruiser.model.Movie;

@Service
public class FavoriteService {

	@Autowired
	private FavoritesDao favoritesDao;

	public void addFavourites(String userId, long movieId) {
		favoritesDao.addFavoritesMovie(userId, movieId);
	}

	public List<Movie> getAllFavoritesMovies(String userId) throws FavoritesEmptyException {
		return favoritesDao.getAllFavoritesMovies(userId);
	}

	public void deleteFavorite(String userId, long movieId) {
		favoritesDao.removeFavoritesMovie(userId, movieId);

	}
}