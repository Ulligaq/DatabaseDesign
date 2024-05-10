package App.Infrastructure;

import App.Domain.Movie;
import App.Domain.IMovieRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MovieRepository implements IMovieRepository {

    private JdbcTemplate databaseConnection;

    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    @Override
    public Movie create(Movie movie) {
        String sql = "INSERT INTO MOVIE(MovieID, Title, YEAR, Genre) VALUES (" + movie.getMovieId() + ", '"
                + movie.getTitle() + "', " + movie.getYear() + ", '" + movie.getGenre() + "');";
        this.databaseConnection.execute(sql);
        return movie;
    }

    @Override
    public int update(Movie movie) {
        String sql = "UPDATE MOVIE SET MovieID = " + movie.getMovieId() + ", Title = '" + movie.getTitle()
                + "', YEAR = "
                + movie.getYear() + ", Genre = '" + movie.getGenre() + "' WHERE MovieID = " + movie.getMovieId() + ");";
        int rows = this.databaseConnection.update(sql);
        return rows;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM MOVIE WHERE MovieID = " + id + ";";
        this.databaseConnection.execute(sql);
        return true;
    }

    @Override
    public Movie get(int id) throws Exception {
        String sql = "SELECT * FROM MOVIE WHERE MovieID = " + id + ";";
        List<Movie> movies = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Movie.class));
        if (movies.size() == 1) {
            return movies.get(0);
        }
        throw new Exception();
    }

    @Override
    public List<Movie> get() {
        String sql = "SELECT * FROM MOVIE;";
        List<Movie> movies = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Movie.class));
        return movies;
    }
}
