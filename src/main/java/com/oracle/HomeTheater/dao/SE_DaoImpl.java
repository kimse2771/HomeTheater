package com.oracle.HomeTheater.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.HomeTheater.model.ChoiceMovie;
import com.oracle.HomeTheater.model.Member;
import com.oracle.HomeTheater.model.Movie;
import com.oracle.HomeTheater.model.MovieLike;
import com.oracle.HomeTheater.model.SeatandTime;

@Repository
public class SE_DaoImpl implements SE_Dao {
	@Autowired
	private SqlSession session;

	@Override
	public List<Movie> listMoive() {
		List<Movie> movieList = null;
		System.out.println("SE_DaoImpl listMoive Start ...");
		try {
			movieList = session.selectList("SE_ListAllMovie");
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
			movie = session.selectOne("SE_SelMovie", mo_number);
			System.out.println("SE_DaoImpl movieDetail getEname->" + movie.getMo_title());
		} catch (Exception e) {
			System.out.println("SE_DaoImpl movieDetail Exception->" + e.getMessage());
		}

		return movie;
	}


	@Override
	public int likeCheck(Map<String, Object> map) {
		System.out.println("SE_DaoImpl likeCheck Start ...");
		int resultStr = 0;
		try {
			resultStr= session.selectOne("SE_SelectMovieLike", map);
			System.out.println("SE_DaoImpl likeCheck resultStr->" + resultStr);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl likeCheck Exception->" + e.getMessage());
		}
		
		
		return resultStr;
	}

	@Override
	public int insertLike(Map<String, Object> map) {
		System.out.println("SE_DaoImpl insertLike Start ...");
		int result = 0;
		try {
			result= session.insert("SE_InsertMovieLike", map);
			System.out.println("SE_DaoImpl insertLike resultStr->" + result);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl insertLike Exception->" + e.getMessage());
		}
		
		return result;
	}

	@Override
	public void updateLike(int mo_number) {
		try {
			 session.update("SE_UpdateLikeMovieLike", mo_number);
			System.out.println("SE_DaoImpl updateLike resultStr 성공->" );
		} catch (Exception e) {
			System.out.println("SE_DaoImpl updateLike Exception->" + e.getMessage());
		}
		
	}

	@Override
	public int deleteLike(Map<String, Object> map) {
		System.out.println("SE_DaoImpl deleteLike Start ...");
		int result = 0;
		try {
			result= session.delete("SE_DeleteMovieLike", map);
			System.out.println("SE_DaoImpl deleteLike resultStr->" + result);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl deleteLike Exception->" + e.getMessage());
		}
		
		return result;
	}

	@Override
	public void updateLikeCancel(int mo_number) {
		try {
			 session.update("SE_UpdateLikeCancelMovieLike", mo_number);
			System.out.println("SE_DaoImpl updateLikeCancel resultStr 성공->" );
		} catch (Exception e) {
			System.out.println("SE_DaoImpl updateLikeCancel Exception->" + e.getMessage());
		}
	}

	@Override
	public Member findMember(String m) {
		Member member = null;
		System.out.println("SE_DaoImpl findMember Start ...");
		try {
			member = session.selectOne("SE_SelMember", m);
			System.out.println("SE_DaoImpl findMember getEname->" + member.getM_id());
		} catch (Exception e) {
			System.out.println("SE_DaoImpl findMember Exception->" + e.getMessage());
		}

		return member;
	}

	@Override
	public List<Movie> listRecommendMovie() {
		List<Movie> RecommendMovieList = null;
		System.out.println("SE_DaoImpl listRecommendMovie Start ...");
		try {
			RecommendMovieList = session.selectList("SE_SelReCoMovie");
			System.out.println("SE_DaoImpl movielist " + RecommendMovieList.size());
		} catch (Exception e) {
			System.out.println("SE_DaoImpl listMoive Exception->" + e.getMessage());
		}
		return RecommendMovieList;
	}

	@Override
	public int adminMovieAdd(Movie movie) {
		int result = 0;
		System.out.println("SE_DaoImpl adminMovieAdd Start ..." );
		try {
			result = session.insert("SE_InsMovie",movie);
			System.out.println("daoresult :"+result);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl adminMovieAdd Exception->"+e.getMessage());
		}
		return result;
	}

	@Override
	public int adminMovieUpdate(Movie movie) {
		System.out.println("SE_DaoImpl adminMovieUpdate start..");
		int result = 0;
		try {
			result  = session.update("SE_UpdMovie",movie);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl adminMovieUpdate Exception->"+e.getMessage());
		}
		return result;

	}

	@Override
	public int adminMovieDelete(int mo_number) {
		System.out.println("SE_DaoImpl adminMovieDelete start..");
		int result = 0;
		try {
			result  = session.delete("SE_delMovie",mo_number);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl adminMovieDelete Exception->"+e.getMessage());
		}
		return result;
	}


	@Override
	public ChoiceMovie findChoiceMovie(Map<String, Object> map) {
		ChoiceMovie choiceMovie = null;
		System.out.println("SE_DaoImpl findChoiceMovie Start ...");
		try {
			choiceMovie = session.selectOne("SE_selChoiceMovie", map);
			System.out.println("SE_DaoImpl findChoiceMovie getEname->" + choiceMovie.getM_id());
		} catch (Exception e) {
			System.out.println("SE_DaoImpl findChoiceMovie Exception->" + e.getMessage());
		}

		return choiceMovie;
	}

	@Override
	public int CheckChoiceMovie(Map<String, Object> map) {
		int result = 0;
		System.out.println("SE_DaoImpl CheckChoiceMovie Start ...");
		try {
			result = session.selectOne("SE_selCheckChoiceMovie", map);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl CheckChoiceMovie Exception->" + e.getMessage());
		}

		return result;
	}

	@Override
	public int insertChoiceMovie(Map<String, Object> map) {
		int result = 0;
		System.out.println("SE_DaoImpl insertChoiceMovie Start ...");
		try {
			result = session.insert("SE_insChoiceMovie", map);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl insertChoiceMovie Exception->" + e.getMessage());
		}

		return result;
	}

	@Override
	public int updateChoiceMovieCancle(Map<String, Object> map) {
		int result = 0;
		System.out.println("SE_DaoImpl updateChoiceMovieCancle Start ...");
		try {
			result = session.update("SE_updChoiceMovie", map);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl updateChoiceMovieCancle Exception->" + e.getMessage());
		}

		return result;
	}

	@Override
	public List<SeatandTime> listSeatandTimes(int mo_number) {
		List<SeatandTime> seatandTimeList = null;
		
		System.out.println("SE_DaoImpl listSeatandTimes Start ...");
		System.out.println("mo_number : "+mo_number);
		try {
			seatandTimeList = session.selectList("SE_ListAllSeatandTimes",mo_number);
			System.out.println("SE_DaoImpl seatandTimeList " + seatandTimeList.size());
		} catch (Exception e) {
			System.out.println("SE_DaoImpl listSeatandTimes Exception->" + e.getMessage());
		}
		return seatandTimeList;
	}

	@Override
	public int adminMovieUpdateSeatAndTime(SeatandTime seatandTime) {
		System.out.println("SE_DaoImpl adminMovieUpdateSeatAndTime Start ...");
		int result = 0;
		try {
			result= session.insert("SE_InsertSeatAndTime", seatandTime);
			System.out.println("SE_DaoImpl adminMovieUpdateSeatAndTime resultStr->" + result);
		} catch (Exception e) {
			System.out.println("SE_DaoImpl adminMovieUpdateSeatAndTime Exception->" + e.getMessage());
		}
		
		return result;
	}

	@Override
	public List<SeatandTime> listFindDate(int mo_number) {
		List<SeatandTime> findDate = null;
		
		System.out.println("SE_DaoImpl listFindDate Start ...");
		System.out.println("mo_number : "+mo_number);
		try {
			findDate = session.selectList("SE_ListDate",mo_number);
			System.out.println("SE_DaoImpl listFindDate " + findDate.size());
		} catch (Exception e) {
			System.out.println("SE_DaoImpl listFindDate Exception->" + e.getMessage());
		}
		return findDate;
	}
}
