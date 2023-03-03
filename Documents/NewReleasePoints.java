
public class NewReleasePoints implements FrequentRenterPointsWay{

	@Override
	public int getPoint(int soNgayThue, int diemCong) {
		int rs = 0;
		if(soNgayThue >=1 ) {
			rs += diemCong;
		}
		return rs;
	}

}
