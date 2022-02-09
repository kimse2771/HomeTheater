package com.oracle.HomeTheater.service;

import java.util.List;

import com.oracle.HomeTheater.model.Movie;
import com.oracle.HomeTheater.model.MovieLike;

public interface SE_Service {

	List<Movie> listMovie();

	Movie movieDetail(int mo_number);


}
