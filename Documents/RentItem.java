import java.util.Date;

public class RentItem {
	private Date startDate;
	private Movie movie;

	public RentItem(Date startDate, Movie movie) {
		this.startDate = startDate;
		this.movie = movie;
	}

//	public int getRentDays() {
//		doi tu ms -> h
//	}

	public double getCharge() {
		double rs = 0;
		rs += movie.getCharge(0, 0, 0);
		return rs;
	}
	
	public double getFrequentRenterPoints() {
		double rs = 0;
		rs += movie.getFrequentRenterPoints(0, 0);
		return rs;
	}
}
