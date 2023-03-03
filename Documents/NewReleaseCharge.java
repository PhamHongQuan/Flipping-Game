
public class NewReleaseCharge implements ChargeComputing{

	@Override
	public double getCharge(int rentDays, int giaTien, int tienCongThem) {
		return giaTien;
	}
	
}
