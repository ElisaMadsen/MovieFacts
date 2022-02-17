package com.example.movies.repositories;

import com.example.movies.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDataRepository {
    public ArrayList<Movie> movies = new ArrayList<Movie>();

    public void listOfMovies() {

        try {
            Scanner scanner = new Scanner(new File("src/main/resources/imdb-data (1).csv"));
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] stringAsArray = line.split(";");

                int year = Integer.parseInt(stringAsArray[0]);
                int length = Integer.parseInt(stringAsArray[1]);
                String title = stringAsArray[2];
                String subject = stringAsArray[3];
                int popularity = Integer.parseInt(stringAsArray[4]);
                boolean hasAward = stringAsArray[5].equals("Yes");

                Movie currentMovie = new Movie(year, length, title, subject, popularity, hasAward);
                movies.add(currentMovie);

            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found.");
            e.printStackTrace();
        }
    }
}
