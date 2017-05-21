package com.assignment1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="movie")
public class Movies {
	@Id
	private String _id;
	private String MovieID;
	private String MovieName;
	private String Genre;
	
	public Movies(String _id, String MovieID, String MovieName,String Genre){
		this._id=_id;
		this.MovieName=MovieName;
		this.MovieID= MovieID;
		this.Genre=Genre;
	}
	
	public Movies(){
	}
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String MovieName) {
		this.MovieName = MovieName;
	}
	public String getMovieID() {
		return MovieID;
	}
	public void setMovieID(String MovieID) {
		this.MovieID = MovieID;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String Genre) {
		this.Genre = Genre;
	}
	
}
