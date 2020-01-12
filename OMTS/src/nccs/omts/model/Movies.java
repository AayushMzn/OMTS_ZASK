package nccs.omts.model;

public class Movies {
	private int movie_id;
	private int genre_id;
	private String movie_name;
	private int length;
	private String director;
	private String cast;
	private int rating;
        private String run_date;

    public Movies(int movie_id, int genre_id, String movie_name, int length, String director, String cast, int rating, String run_date) {
        this.movie_id = movie_id;
        this.genre_id = genre_id;
        this.movie_name = movie_name;
        this.length = length;
        this.director = director;
        this.cast = cast;
        this.rating = rating;
        this.run_date = run_date;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRun_date() {
        return run_date;
    }

    public void setRun_date(String run_date) {
        this.run_date = run_date;
    }
}