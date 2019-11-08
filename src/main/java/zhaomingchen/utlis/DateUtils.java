package zhaomingchen.utlis;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	
	
	/*返回一个传入日期的月初*/
	public static Date getDateByInintMonth(Date src) {

		// 获取日期类
   		Calendar c=Calendar.getInstance();	
		
   		//根据传入的日期 构建日历类
   		c.setTime(src);
   		// 设置月初
   		c.set(Calendar.DAY_OF_MONTH,1);// 日
   		c.set(Calendar.HOUR_OF_DAY,0);// 小时
   		c.set(Calendar.MINUTE,0);// 分钟
   		c.set(Calendar.SECOND,0);//秒
   		return c.getTime();
	}
	/***
	 * 
	 * @Title: getDatebyFullMonth 
	 * @Description: 返回月末
	 * @param date
	 * @return: void
	 */
   public static Date getDatebyFullMonth(Date date){
	// 第一步让插入的月份加1 2 让日期变为月初 3最后让日期减去一秒
		// 先获取日历类
		Calendar c=Calendar.getInstance();
		
		// 让月份加1
		c.add(c.MONTH,1);
		
		// 让日期变成月初
		Date da = getDateByInintMonth(c.getTime());
		
		// 让月初初始化日期类
	  c.setTime(da);
	 
	// 让日期-1秒
	c.add(Calendar.SECOND,-1);
	return c.getTime();
		
	}

}
