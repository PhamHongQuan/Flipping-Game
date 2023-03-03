
public class RegularCharge implements ChargeComputing {

	@Override
	public double getCharge(int rentDays, int giaTien, int tienCongThem) {
		double rs = 0;
		if (rentDays >= 3) {
			rs += giaTien + tienCongThem;
		} else  {
			rs += giaTien;
		}
		return rs;
	}
}
