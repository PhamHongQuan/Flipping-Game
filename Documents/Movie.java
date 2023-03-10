
public class Movie {
	
	private boolean availabe;
	private String title;
	private ChargeComputing chargeComputing;
	private FrequentRenterPointsWay frequentRenterPoint;

	public Movie(boolean availabe, String title, ChargeComputing chargeComputing,
			FrequentRenterPointsWay frequentRenterPoint) {
		this.availabe = availabe;
		this.title = title;
		this.chargeComputing = chargeComputing;
		this.frequentRenterPoint = frequentRenterPoint;
	}
	
	public double getCharge(int rentDays) {
		double rs = 0;
		rs += chargeComputing.getCharge(rentDays);
		return rs;
	}
	public int getFrequentRenterPoints(int rentdays) {
		int rs = 0;
		rs+= this.frequentRenterPoint.getPoint(rentdays);
		return rs; 
		
	}

	// getter & setter
	public boolean isAvailabe() {
		return availabe;
	}

	public void setAvailabe(boolean availabe) {
		this.availabe = availabe;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ChargeComputing getChargeComputing() {
		return chargeComputing;
	}

	public void setChargeComputing(ChargeComputing chargeComputing) {
		this.chargeComputing = chargeComputing;
	}

	public FrequentRenterPointsWay getFrequentRenterPoint() {
		return frequentRenterPoint;
	}

	public void setFrequentRenterPoint(FrequentRenterPointsWay frequentRenterPoint) {
		this.frequentRenterPoint = frequentRenterPoint;
	}
	
	
}
