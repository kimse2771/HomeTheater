package com.oracle.HomeTheater.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.HomeTheater.model.Movie;
import com.oracle.HomeTheater.model.MovieLike;

@Repository
public class SE_DaoImpl implements SE_Dao {
	@Autowired
	private SqlSession session;

	@Override
	public List<Movie> listMoive() {
		List<Movie> movieList = null;
		System.out.println("SE_DaoImpl listMoive Start ...");
		try {
			movieList = session.selectList("seMovieListAll");
			System.out.println("SE_DaoImpl movielist " + movieList.size());
		} catch (Exception e) {
			System.out.println("SE_DaoImpl listMoive Exception->" + e.getMessage());
		}
		return movieList;

	}

	@Override
	public Movie movieDetail(int mo_number) {
		Movie movie = null;
		System.out.println("SE_DaoImpl movieDetail Start ...");
		try {
			movie = session.selectOne("seMovieSelOne", mo_number);
			System.out.println("SE_DaoImpl movieDetail getEname->" + movie.getMo_title());
		} catch (Exception e) {
			System.out.println("SE_DaoImpl movieDetail Exception->" + e.getMessage());
		}

		return movie;
	}

	

}
