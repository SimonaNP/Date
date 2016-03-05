import java.util.Date;

public class NationalHoliday extends Date {

	Date date1 = new Date();

	@SuppressWarnings("deprecation")
	public boolean isNatHol() {
		if (date1.getMonth() == 2 && date1.getDate() == 3) {
			return true;
		}
		return false;
	}

}