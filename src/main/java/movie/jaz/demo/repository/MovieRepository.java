package movie.jaz.demo.repository;

import movie.jaz.demo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Modifying
    @Query("update Movie m set m.isavailable = 1 where m.id = ?1")
    void changeAvailable(Long movieId);


    @Query("select m from Movie m where m.id=?1")
    Optional<Movie> findById(Long movieId);

    @Query("select m from Movie m")
    List<Movie> findAll();

    @Query("delete from Movie m where m.id=?1")
    void deleteById(Long movieId);


}