package zhaomingchen.utlis;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	
	
	/*����һ���������ڵ��³�*/
	public static Date getDateByInintMonth(Date src) {

		// ��ȡ������
   		Calendar c=Calendar.getInstance();	
		
   		//���ݴ�������� ����������
   		c.setTime(src);
   		// �����³�
   		c.set(Calendar.DAY_OF_MONTH,1);// ��
   		c.set(Calendar.HOUR_OF_DAY,0);// Сʱ
   		c.set(Calendar.MINUTE,0);// ����
   		c.set(Calendar.SECOND,0);//��
   		return c.getTime();
	}
	/***
	 * 
	 * @Title: getDatebyFullMonth 
	 * @Description: ������ĩ
	 * @param date
	 * @return: void
	 */
   public static Date getDatebyFullMonth(Date date){
	// ��һ���ò�����·ݼ�1 2 �����ڱ�Ϊ�³� 3��������ڼ�ȥһ��
		// �Ȼ�ȡ������
		Calendar c=Calendar.getInstance();
		
		// ���·ݼ�1
		c.add(c.MONTH,1);
		
		// �����ڱ���³�
		Date da = getDateByInintMonth(c.getTime());
		
		// ���³���ʼ��������
	  c.setTime(da);
	 
	// ������-1��
	c.add(Calendar.SECOND,-1);
	return c.getTime();
		
	}

}
