package com.oracle.HomeTheater.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.HomeTheater.dao.SE_Dao;
import com.oracle.HomeTheater.model.Movie;
import com.oracle.HomeTheater.model.MovieLike;

@Service
public class SE_ServiceImpl implements SE_Service {
	@Autowired
	private SE_Dao sd;
	
	@Override
	public List<Movie> listMovie() {
		List<Movie> movieList = null;
		System.out.println("SE_ServiceImpl listMovie Start..." );
		movieList = sd.listMoive();
		System.out.println("movieList size ->  "+movieList.size());
		return movieList;
	}

	@Override
	public Movie movieDetail(int mo_number) {
		Movie movie = null;
		movie = sd.movieDetail(mo_number);
		return movie;
	}

	
}
