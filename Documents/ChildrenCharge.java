
public class ChildrenCharge implements ChargeComputing{

	@Override
	public double getCharge(int rentDays) {
		int rs = 0;
		if(rentDays >= 4) {
			rs += CHARGE_OF_CHILDRENS + PLUS_CHARGE_OF_CHILDRENS;
		} else rs += CHARGE_OF_CHILDRENS;
		return rs;
	}

}
