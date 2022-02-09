package com.oracle.HomeTheater.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.HomeTheater.model.Member;
import com.oracle.HomeTheater.model.Movie;
import com.oracle.HomeTheater.model.MovieLike;
import com.oracle.HomeTheater.service.SE_Service;

@Controller
public class SE_Controller {
	HttpSession session;

	@Autowired
	private SE_Service ses;

	@GetMapping("/username")
	@ResponseBody
	public String currentUserName(Principal principal) {
		return principal.getName();
	}

	@RequestMapping(value = "main")
	public String main() {
		System.out.println("SE_Contorller main Start...");
		return "main";
	}

	@RequestMapping(value = "movieList")
	public String movieList(Model model) {
		System.out.println("SE_Contorller main Start...");
		List<Movie> listMovie = ses.listMovie();
		model.addAttribute("listMovie", listMovie);
		return "SE_views/SE_movieList";
	}

	@RequestMapping(value = "movieDetail")
	public String movieDetail(int mo_number, Model model) {
		System.out.println("SE_Contorller movieDetail Start...");

		Movie movie = ses.movieDetail(mo_number);
		
		model.addAttribute("movie", movie);
		
		return "SE_views/SE_movieDetail";
	}

}
