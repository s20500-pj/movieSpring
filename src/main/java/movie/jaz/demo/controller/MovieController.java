package movie.jaz.demo.controller;

import movie.jaz.demo.model.Movie;
import movie.jaz.demo.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>>getAll(){
        return ResponseEntity.ok(movieService.findAll());
    }


    @GetMapping("/{movieId}")
    public ResponseEntity<Movie> findById(@PathVariable("movieId") Long movieId) {
        return ResponseEntity.ok(movieService.findById(movieId).get());
    }



    @PutMapping("/movies")
    public ResponseEntity<Movie> update(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.update(movie));
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> save(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.update(movie));
    }


    @DeleteMapping("/movies/{movieId}")
    public ResponseEntity<Void> deleteById(@PathVariable("movieId") Long movieId) {
        movieService.deleteMovieById(movieId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/movies/{movieId}")
    public ResponseEntity<Void> changeAvailable(@PathVariable("movieId") Long movieId){
        movieService.changeAvailable(movieId);
        return ResponseEntity.ok().build();
    }


}
