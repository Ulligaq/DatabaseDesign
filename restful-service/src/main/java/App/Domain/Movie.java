package App.Domain;

public class Movie {

    private int movieid;

    private String title;

    private int year;

    private String genre;

    public int getMovieId() {
        return this.movieid;
    }

    public void setMovieId(int id) {
        this.movieid = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}