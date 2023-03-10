
public class NewReleasePoints implements FrequentRenterPointsWay{

	@Override
	public int getPoint(int soNgayThue) {
		int rs = 0;
		if(soNgayThue >=1 ) {
			rs += PRICEPLUS_POINT;
		}
		return rs;
	}


}
