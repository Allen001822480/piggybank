package model;
import java.util.ArrayList;
public class Account {
	Balance balance;
	Watchlist watchlist;
	
	String username;
	String password;
	
	boolean verify(String username, String password) {
		return this.username == username && this.password == password;
	}
}

class Watchlist{
	ArrayList<Movie> watchlist;
	
	void addMovie(Movie movie) {
		this.watchlist.add(movie);
	}
	void removeMovie(Movie movie) {
		this.watchlist.remove(movie);
	}
}

class Balance {
	float mian;

	public float getMian() {
		return mian;
	}

	public void setMian(float mian) {
		this.mian = mian;
	}
	
	
}