package com.example.movies.services;

import com.example.movies.models.Movie;
import com.example.movies.repositories.MovieDataRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class MovieService {
    MovieDataRepository movieDataRepository = new MovieDataRepository();
    Random random = new Random();

    public MovieService(){
        movieDataRepository.listOfMovies();
    }

    public String getFirstMovieTitle(){
        Movie movieTitle = movieDataRepository.movies.get(0);
        String firstMovieTitle = movieTitle.getTitle();
        return "First Movie Title: " + firstMovieTitle;

    }

    public String getRandomMovieTitle(){
        int randomNumber = random.nextInt(movieDataRepository.movies.size());
        String movieTitle = "";

        for (int i = 0; i < movieDataRepository.movies.size(); i++) {
            Movie randomIndexMovie = movieDataRepository.movies.get(randomNumber);
            movieTitle = randomIndexMovie.getTitle();
        }

        return "A Random Movie Title: " + movieTitle;
    }

    public ArrayList<Movie> tenMoviesSortedByPopularity (){
        ArrayList<Movie> tenMovies = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            int number = random.nextInt(movieDataRepository.movies.size());

            tenMovies.add(movieDataRepository.movies.get(number));

                Collections.sort(tenMovies, Collections.reverseOrder());
            }
        return tenMovies;

        }


    public int howManyWonAnAward(){
        int counter = 0;

        for (int i = 0; i < movieDataRepository.movies.size(); i++) {

            boolean currentMovie= movieDataRepository.movies.get(i).isHasWonAward();
            if (Objects.equals(currentMovie, true)){
                counter++;
            }
        }
        return counter;
    }

}
