import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {
	public static void main(String[] args){
		int year =2017;
		int day;
		//日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//創建日期物件
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);  
		
		String[][] array = new String[53][7];
		
		for(int i =0;i <array.length;i++){
			for(int j=0;j<array[i].length;j++){
				array[i][j]=sdf.format(calendar.getTime());
				//System.out.print(sdf.format(calendar.getTime())+"  ");
				day = calendar.get(Calendar.DATE); 
				calendar.set(Calendar.DATE, day+1); 
			}
			System.out.println("第"+i+"週   "+array[i][0]+" ~ "+array[i][6]);
			//System.out.println();
		}
	}
}
