
public class NewReleaseCharge implements ChargeComputing{

	@Override
	public double getCharge(int rentDays) {
		return CHARGE_OF_REGULAR;
	}
	
}
