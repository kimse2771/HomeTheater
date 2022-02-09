package com.oracle.HomeTheater.dao;

import java.util.List;
import java.util.Map;

import com.oracle.HomeTheater.model.Movie;
import com.oracle.HomeTheater.model.MovieLike;

public interface SE_Dao {

	List<Movie> listMoive();

	Movie movieDetail(int mo_number);


}
