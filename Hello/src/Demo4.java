/**
 * ����ͬ���������õ�ͷ��h�����Ź���f������Ƴ��򣬸����û������h��f��
����ֱ��м�ֻ��,��ֻ��

 * @author Administrator
 *
 */
public class Demo4 {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("������һ����ͷ��h:");
		int head = sc.nextInt();
		System.out.print("������һ���Ľ���f:");
		int foot = sc.nextInt();
		
		
		int rabit = (foot-2*head)/2;
		int chicken = head-rabit;
		System.out.println("����"+chicken+"ֻ\t���ӣ�"+rabit+"ֻ");
	}
}
