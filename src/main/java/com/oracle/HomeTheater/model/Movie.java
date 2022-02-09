package com.oracle.HomeTheater.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
	int mo_number;
	String mo_title;  
	String mo_director; 
	String mo_actor;   
	String mo_genre;   
	String mo_age;      
	String mo_playTime; 
	String mo_openDate; 
	int mo_recommendation;
	String mo_filename;
}
