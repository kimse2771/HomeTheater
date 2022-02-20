package com.oracle.HomeTheater.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bbs {
	private int bbs_no;			private int bbs_category;
	private String bbs_title;	private String bbs_content;
	private String bbs_date;	private int bbs_hit;
	private String m_id;
	
	// 조회용
	private String search;   	private String keyword;
	private String pageNum;  
	private int start; 		 	private int end;
	
}