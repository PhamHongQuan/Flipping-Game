
public interface ChargeComputing {
	public static int CHARGE_OF_REGULAR = 3000;
	public static final int CHARGE_OF_NEWRELEASE = 4000;
	public static final int CHARGE_OF_CHILDRENS = 2500;

	public static final int PLUS_CHARGE_OF_REGULAR = 1000;
	public static final int PLUS_CHARGE_OF_CHILDRENS = 1500;

	public double getCharge(int rentDays);
}
