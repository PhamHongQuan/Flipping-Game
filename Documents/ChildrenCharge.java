
public class ChildrenCharge implements ChargeComputing{

	@Override
	public double getCharge(int rentDays, int giaTien, int tienCongThem) {
		int rs = 0;
		if(rentDays >= 4) {
			rs += giaTien + tienCongThem;
		} else rs += giaTien;
		return rs;
	}

}
