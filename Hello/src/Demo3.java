/**
 * 
输入一数字作为秒数，按小时，分钟，秒的格式输出。(x:x:x)1000
 * @author Administrator
 *
 */
public class Demo3 {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("请输入秒数：");
		int second = sc.nextInt();
		
		if (second<0) {
			System.out.println("你输入的秒数有误！");
		}else{
		int hour = second/3600;
		int minute = (second%3600)/60;
		int second2 = second%60;
		
		System.out.println("时间是"+hour+":"+minute+":"+second2);
		}
	}
}
