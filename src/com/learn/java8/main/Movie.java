package com.learn.java8.main;

public class Movie {
	private String movieName;
	private String heroName;
	private String actressName;

	public Movie(String movieName, String heroName, String actressName) {
		super();
		this.movieName = movieName;
		this.heroName = heroName;
		this.actressName = actressName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getActressName() {
		return actressName;
	}

	public void setActressName(String actressName) {
		this.actressName = actressName;
	}

}
