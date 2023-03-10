import java.time.LocalDate;
import java.util.Date;

public class RentItem {
	private Date startDate;
	private Movie movie;

	public RentItem(Date startDate, Movie movie) {
		this.startDate = startDate;
		this.movie = movie;
	}

	public int getRentedDays() {
		Date now = new Date();
		long duration = now.getTime() - startDate.getTime();
		long rentedDays = duration / (24 * 3600000);
		if (duration % (24 * 3600000) > 2 * 3600000)
			rentedDays++;
		return (int) rentedDays;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public double getCharge() {
		double rs = 0;
		rs += movie.getCharge(this.getRentedDays());
		return rs;
	}

	public double getFrequentRenterPoints() {
		double rs = 0;
		rs += movie.getFrequentRenterPoints(this.getRentedDays());
		return rs;
	}


}
