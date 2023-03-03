
public class Movie {
	public static final int CHARGE_OF_REGULAR = 3000;
	public static final int CHARGE_OF_NEWRELEASE = 4000;
	public static final int CHARGE_OF_CHILDRENS = 2500;
	public static final int PRICEPLUS_POINT = 1;
	
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
	
	public double getCharge(int rentDays, int giaTien, int tienCongThem) {
		double rs = 0;
		rs += chargeComputing.getCharge(rentDays, giaTien, tienCongThem);
		return rs;
	}
	public int getFrequentRenterPoints(int rentdays, int diemCongThem) {
		int rs = 0;
		rs+= this.frequentRenterPoint.getPoint(rentdays, diemCongThem);
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
