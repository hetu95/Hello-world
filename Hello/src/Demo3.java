/**
 * 
����һ������Ϊ��������Сʱ�����ӣ���ĸ�ʽ�����(x:x:x)1000
 * @author Administrator
 *
 */
public class Demo3 {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("������������");
		int second = sc.nextInt();
		
		if (second<0) {
			System.out.println("���������������");
		}else{
		int hour = second/3600;
		int minute = (second%3600)/60;
		int second2 = second%60;
		
		System.out.println("ʱ����"+hour+":"+minute+":"+second2);
		}
	}
}
