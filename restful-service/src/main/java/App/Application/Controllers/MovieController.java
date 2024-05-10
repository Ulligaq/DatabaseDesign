package App.Application.Controllers;

import App.Domain.Movie;
import App.Infrastructure.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/Movie")
public class MovieController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private MovieRepository movieRepository;

    public MovieController() {
        this.movieRepository = new MovieRepository();
    }

    @PostMapping("/")
    public int post(@RequestBody() Movie moviecreate) {
        this.movieRepository.setDatabaseConnection(this.databaseConnection);
        this.movieRepository.create(moviecreate);
        return moviecreate.getMovieId();

    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") int id, @RequestBody() Movie movie) {
        this.movieRepository.setDatabaseConnection(this.databaseConnection);
        this.movieRepository.update(id, movie);
    }

    @GetMapping("/{id}")
    public Movie get(@PathVariable("id") int id) throws Exception {
        this.movieRepository.setDatabaseConnection(this.databaseConnection);
        return this.movieRepository.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        this.movieRepository.setDatabaseConnection(this.databaseConnection);
        this.movieRepository.delete(id);
    }

    @GetMapping("/")
    public List<Movie> get() {
        this.movieRepository.setDatabaseConnection(this.databaseConnection);
        return this.movieRepository.get();
    }
}
