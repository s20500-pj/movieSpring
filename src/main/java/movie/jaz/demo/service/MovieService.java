package movie.jaz.demo.service;

import movie.jaz.demo.model.Movie;
import movie.jaz.demo.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> findById(Long id) {
        return movieRepository.findById(id);
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie update(Movie movie) {
        Optional<Movie> id = movieRepository.findById(movie.getId());
        if (id.isEmpty()) {
            throw new RuntimeException();
        } else {
            return movieRepository.save(movie);
        }
    }

    public void deleteMovieById(Long movieId) {
        movieRepository.deleteById(movieId);
    }

    public void changeAvailable(Long movieId){
        movieRepository.changeAvailable(movieId);
    }




}
