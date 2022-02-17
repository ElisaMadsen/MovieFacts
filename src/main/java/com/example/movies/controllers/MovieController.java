package com.example.movies.controllers;

import com.example.movies.models.Movie;
import com.example.movies.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {
    private MovieService service = new MovieService();

    @GetMapping("/")
    public String welcome(){
        return "This Application Analysis Movies";
    }

    @GetMapping("/getFirst")
    public String getFirst(){
        String firstMovieTitle = service.getFirstMovieTitle();
        return firstMovieTitle;
    }

    @GetMapping("/getRandom")
    public String getRandom(){
        String randomMovieTitle = service.getRandomMovieTitle();
        return randomMovieTitle;
    }

    @GetMapping("/gettensortbypopularity")
    public ArrayList<Movie> sortByPopularity(){
        ArrayList tenRandomMovies = service.tenMoviesSortedByPopularity();
        return tenRandomMovies;
    }

    @GetMapping("/howmanywonanaward")
    public int wonAnAward(){
        int haveWonAnAward = service.howManyWonAnAward();
        return haveWonAnAward;
    }




}
