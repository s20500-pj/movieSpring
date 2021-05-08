package pl.pjatk.movieSpring.MovieService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.pjatk.movieSpring.model.Category;
import pl.pjatk.movieSpring.model.Movie;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    public List<Movie> getAllMovies(){
        Movie movie1 = new Movie("Killer", Category.COMEDY);
        Movie movie2 = new Movie("Titanic", Category.ROMANCE);
        Movie movie3 = new Movie("FORREST GUMP", Category.DRAMA);

        return List.of(movie1,movie2,movie3);
    }


    public Movie getMovieById(int movieId) {
        Movie movie1 = new Movie("Killer", Category.COMEDY);

        return movie1;
    }

    public Movie getMovieFromBody() {
        Movie movie1 = new Movie("Killer", Category.COMEDY);
        System.out.println("Getting movie");
        return movie1;
    }

    public Movie updateMovieById(int movieId, Movie movie) {
        Movie movie1 = movie;
        System.out.println("Updated movie of id " + movieId);
        return movie1;
    }

    public void deleteMovieById(int movieId) {
        System.out.println("Deleted movie of id: " + movieId);
    }



}
