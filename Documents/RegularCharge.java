
public class RegularCharge implements ChargeComputing {

	@Override
	public double getCharge(int rentDays) {
		double rs = 0;
		if (rentDays >= 3) {
			rs += CHARGE_OF_REGULAR + PLUS_CHARGE_OF_REGULAR;
		} else  {
			rs += CHARGE_OF_REGULAR;
		}
		return rs;
	}
}
