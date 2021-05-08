package pl.pjatk.movieSpring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.movieSpring.MovieService.MovieService;
import pl.pjatk.movieSpring.model.Category;
import pl.pjatk.movieSpring.model.Movie;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>>getAllMovies(){
        return ResponseEntity.ok(movieService.getAllMovies());
    }


    @GetMapping("/{movieId}")
    public ResponseEntity<Movie> getMovieById(@PathVariable("movieId") Long movieId) {
        return ResponseEntity.ok(movieService.getMovieById(movieId));
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> getMovie(@RequestBody Movie movie) {
        Movie movie1 = movieService.getMovieFromBody();
        return ResponseEntity.ok(movie1);
    }

    @PutMapping("/movies/{movieId}")
    public ResponseEntity<Movie> updateById(@PathVariable("movieId") Long movieId, @RequestBody Movie movie) {
        Movie movie1 = movieService.updateMovieById(movieId, movie);
        return ResponseEntity.ok(movie1);
    }

    @DeleteMapping("/movies/{movieId}")
    public ResponseEntity<Void> deleteById(@PathVariable("movieId") Long movieId) {
        movieService.deleteMovieById(movieId);
        return ResponseEntity.ok().build();
    }


}
