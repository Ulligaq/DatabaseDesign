package App.Domain;

public class MediaType {

    private int mediaid;

    private int movieid;

    private String format;

    private String distributer;

    private String aspectRatio;

    private String mpaa;

    private String genre;

    private int runtime;

    public int getMediaId() {
        return this.mediaid;
    }

    public void setMediaId(int id) {
        this.mediaid = id;
    }

    public int getMovieId() {
        return this.movieid;
    }

    public void setMovieId(int id) {
        this.movieid = id;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDistributor() {
        return this.distributer;
    }

    public void setDistributor(String distributor) {
        this.distributer = distributor;
    }

    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getMpaa() {
        return this.mpaa;
    }

    public void setMpaa(String mpaa) {
        this.mpaa = mpaa;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRuntime() {
        return this.runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

}