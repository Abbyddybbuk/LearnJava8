package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerUseCase2 {

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("Super-30", "Hritik Roshan", "Hegde"));
		movieList.add(new Movie("Sacred Games", "Nawazuddin Siddiqui", "Kalki Koechlin"));
		movieList.add(new Movie("Dum Laga ke Haisha", "Ayushman Khurana", "Bhumi Pednekar"));

		Consumer<List<Movie>> consumer = movieList1->{
			for (Movie movie: movieList1) {
				System.out.println("Movie name: " + movie.getMovieName());
				System.out.println("Actor name: " + movie.getHeroName());
				System.out.println("Actress name: " + movie.getActressName());
				System.out.println("*******************************************");
			}
		};
		
		// Print Movie List
		consumer.accept(movieList);
		
		TempConsumer tmp = new TempConsumer();
		System.out.println(tmp.calculateAgeTax(45));
		

	}

}
