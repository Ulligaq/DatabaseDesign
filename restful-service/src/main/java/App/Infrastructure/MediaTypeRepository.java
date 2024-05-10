package App.Infrastructure;

import App.Domain.MediaType;
import App.Domain.Movie;
import App.Domain.IMediaTypeRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MediaTypeRepository implements IMediaTypeRepository {

    private JdbcTemplate databaseConnection;

    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    @Override
    public MediaType create(MediaType mediaType) {
        String sql = "INSERT INTO MEDIATYPE (MediaID, MovieID, Format, Distributer, AspectRatio, MPAA, Genre, RunTime) VALUES ("
                + mediaType.getMediaId() + ", "
                + mediaType.getMovieId() + ", '" + mediaType.getFormat() + "', '" + mediaType.getDistributor() + "', '"
                + mediaType.getAspectRatio() + "', " + mediaType.getMpaa() + "', '" + mediaType.getGenre() + "', "
                + mediaType.getRuntime() + ");";
        this.databaseConnection.execute(sql);
        return mediaType;
    }

    @Override
    public int update(MediaType mediaType) {
        String sql = "UPDATE kh184217.MEDIATYPE SET MovieID = " + mediaType.getMovieId() +
                ", Format = '" + mediaType.getFormat() +
                "', Distributer = '" + mediaType.getDistributor() +
                "', AspectRatio = '" + mediaType.getAspectRatio() +
                "', MPAA = '" + mediaType.getMpaa() +
                "', Genre = '" + mediaType.getGenre() +
                "', RunTime = " + mediaType.getRuntime() +
                " WHERE MediaID = " + mediaType.getMediaId();

        int rowsUpdated = this.databaseConnection.update(sql);
        return rowsUpdated;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM MEDIATYPE WHERE MediaID = " + id + ";";
        this.databaseConnection.execute(sql);
        return true;
    }

    @Override
    public MediaType get(int id) throws Exception {
        String sql = "SELECT * FROM MEDIATYPE WHERE MediaID = " + id + ";";
        List<Movie> movies = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(MediaType.class));
        if (movies.size() == 1) {
            return movies.get(0);
        }
        throw new Exception();
    }

    @Override
    public List<MediaType> get() {
        String sql = "SELECT mt.MediaID, mt.MovieID, mt.Format, mt.Distributer, mt.AspectRatio, mt.MPAA, mt.Genre, mt.RunTime, m.Title, m.YEAR "
                +
                "FROM MEDIATYPE mt " +
                "JOIN MOVIE m ON mt.MovieID = m.MovieID";

        List<MediaType> mediaTypes = this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(MediaType.class));
        return mediaTypes;
    }
}
