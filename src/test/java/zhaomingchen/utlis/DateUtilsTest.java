package zhaomingchen.utlis;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateUtilsTest {

	/**
	 * 
	 * @Title: testGetDateByInintMonth 
	 * @Description: 获得月初的方法
	 * @return: void
	 */
	@Test
  public void testGetDateByInintMonth() {
		Calendar c=Calendar.getInstance();
		Date time = c.getTime();
		
		Date date = DateUtils.getDateByInintMonth(time);
		SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = da.format(date);
		System.out.println(format);
	}

	@Test
	 public void getDatebyFullMonth() {
		
		 Date datebyFullMonth = DateUtils.getDatebyFullMonth(new Date());
		 SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String format = da.format(datebyFullMonth);
			System.out.println(format); 
		 
	 
	 }
	
	
	

}
